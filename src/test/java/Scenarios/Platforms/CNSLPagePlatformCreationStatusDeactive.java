package Scenarios.Platforms;

import Pages.ConsolePage;
import Pages.LoginPage;
import Runner.AppClass;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CNSLPagePlatformCreationStatusDeactive {
    ConsolePage consolePage = new ConsolePage();

    @BeforeAll
    public static void setUp() {
        AppClass.setUp();
        LoginPage.Authorization();
    }
    @Test
    @Order(1)
    @DisplayName("Mid Selection")
    public void SelectMid(){
        consolePage.midSelectFirstTable();
    }

    @Test @Order(2)
    @DisplayName("Platform Header")
    public void CheckPlatformHeading(){
        System.out.println("Current opened page: " + consolePage.platformsHeadingText());
    }
    @Test @Order(3)
    @DisplayName("Create Second Platform")
    public void SecondPlatform(){
        consolePage.secondPlatformCreation();
    }
    @Test @Order(4)
    @DisplayName("Click to create  platform")
    public void CreatePlatform(){

        consolePage.InspectorCreateButton();
    }

    @Test @Order(5)
    @DisplayName("Platform Inspector Header")
    public void InspectorHeader(){
        System.out.println("Current opened inspector is: " + consolePage.platformsHeadingText());
    }
    @Test @Order(6)
    @DisplayName("Card type selection Visa")
    public void CardType(){
        consolePage.platformsCard();
        consolePage.platformsCardVisa();
        consolePage.platformInspectorHeadingClick();
    }
    @Test @Order(7)
    @DisplayName("TargetAlertsInput")
    public void TargetAlerts(){
        consolePage.platformAlertsField();
        consolePage.platformAlertsInput();
        consolePage.platformInspectorHeadingClick();
    }

    @Test @Order(8)
    @DisplayName("Target Hard Alerts")
    public void TargetHardAlerts(){
        consolePage.platformHardAlertsField();
        consolePage.platformHardAlertsInput();
        consolePage.platformInspectorHeadingClick();
    }
    @Test @Order(9)
    @DisplayName("Test Platformss status Set Active")
    public void PlatformsStatus(){
        consolePage.platformIsActiveState();
        consolePage.platformIsActiveStateTrue();
        consolePage.platformInspectorHeadingClick();
    }
    @Test @Order(10)
    @DisplayName("Test Save creation of Platform")
    public void CreateFinish(){
        consolePage.InspectorSaveButton();
        consolePage.InspectorSaveButton();
    }

}
