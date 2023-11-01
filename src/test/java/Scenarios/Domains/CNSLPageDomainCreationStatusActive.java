package Scenarios.Domains;
import Pages.LoginPage;
import Pages.ConsolePage;
import Runner.AppClass;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CNSLPageDomainCreationStatusActive {

    ConsolePage consolePage = new ConsolePage();

    @BeforeAll
    public static void setUp() {
        AppClass.setUp();
        LoginPage.Authorization();
    }



    @Test @Order(1)
    @DisplayName("Console page heading")
    public void HeadingOfThePage()  {
        System.out.println("Current heading of the page : " + consolePage.domainsHeading());
    }
    @Test @Order(2)
    @DisplayName("Creation of first domain with status Active ")
    public void FirstDomainCreation(){
        consolePage.domainsHeading();
        consolePage.domainsCreate();
    }
    @Test @Order(3)
    @DisplayName("InspectorDomainHeader")
    public void InspectorHeader(){
        System.out.println("!!!!!==========!!!!!");
        System.out.println("Current opened inspector is: " + consolePage.domainsInspectorHeadingText());
        System.out.println("!!!!!==========!!!!!");
    }
    @Test @Order(4)
    @DisplayName("Domain SiteId Setup")
    public void DomainSiteId() {
        consolePage.inputDomainSite("TestDomSite_");
        consolePage.domainsInspectorHeadingClick();
    }
    @Test @Order(5)
    @DisplayName("Domain Name Setup")
    public void DomainName(){
        consolePage.domainsInspectorHeadingClick();
        consolePage.inputDomainName("TestDom_");
        consolePage.domainsInspectorHeadingClick();
    }

    @Test @Order(6)
    @DisplayName("Domain Status Setup")
    public void DomainStatus(){
        consolePage.domainIsActive();
        consolePage.domainActiveTrue();
        consolePage.domainsInspectorHeadingClick();
    }
    @Test @Order(7)
    @DisplayName("Domain Creation Save")
    public void DomainEndCreation(){
        System.out.println("!!!!!!!!!!!!!!Domain End Creation!!!!!!!!!!!!!!!!!!!");
        consolePage.InspectorSaveButton();
    }


}


