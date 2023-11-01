package Scenarios.Mids;

import Pages.ConsolePage;
import Pages.LoginPage;
import Runner.AppClass;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MidCreationWithStatusDeactive {
    ConsolePage consolePage = new ConsolePage();

    @BeforeAll
    public static void setUp() {
        AppClass.setUp();
        LoginPage.Authorization();
    }

    @Test
    @Order(1)
    @DisplayName("First Mid creation")
    public void FirstMidCreationClick(){
        consolePage.midCreation();
    }
    @Test @Order(2)
    @DisplayName("MidInspectorCheck")
    public void MidInspectorHeading(){
        System.out.println("Current opened inspector is: " + consolePage.midInspectorHeading());
    }
    @Test @Order(3)
    @DisplayName("Currency select")
    public void Currency(){
        System.out.println("Current Inspector: " + consolePage.midInspectorHeading());
        consolePage.midSelectCurrencies();
        consolePage.midInspectorHeadingClick();
    }
    @Test @Order(4)
    @DisplayName("Currency White List Select")
    public void WLCurrency(){
        consolePage.midCurrencyWL();
        consolePage.midInspectorHeadingClick();
    }
    @Test @Order(5)
    @DisplayName("Currency Black List Select")
    public void BLCurrency() {
        consolePage.midCurrencyBL();
        consolePage.midInspectorHeadingClick();
    }

    @Test @Order(6)
    @DisplayName("Status Setup Active")
    public void midStatus(){
        consolePage.midIsActiveState();
        consolePage.midActiveFalse();
        consolePage.midInspectorHeadingClick();
    }
    @Test @Order(8)
    @DisplayName("SAve Inspector")
    public void midCreationFinish(){
        consolePage.InspectorSaveButton();
    }
}
