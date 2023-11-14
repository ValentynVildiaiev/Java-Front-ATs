package Scenarios.Platforms;

import Pages.ConsolePage;
import Pages.LoginPage;
import Runner.AppClass;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CNSLPagePlatformCreationStatusActive {
    ConsolePage consolePage = new ConsolePage();

    @BeforeAll
    public static void setUp() {
        AppClass.setUp();
        LoginPage.Authorization();
    }
    @Test @Order(1)
    @DisplayName("Test Mid Selection")
    public void SelectMid(){
        consolePage.midSelectFirstTable();
    }
    @Test @Order(2)
    @DisplayName("Test Platform Header")
    public void CheckPlatformHeading(){
        System.out.println("Current opened page: " + consolePage.platformsHeadingText());
    }
    @Test @Order(3)
    @DisplayName("Click to create first platform")
    public void CreateFirstPlatform(){
        consolePage.createPlatform();
    }
    @Test @Order(4)
    @DisplayName("Platform Inspector Header")
    public void InspectorHeader(){
        System.out.println("Current opened inspector is: " + consolePage.platformsHeadingText());
    }
    @Test @Order(5)
    @DisplayName("Card type selection Visa")
    public void CardType(){
        consolePage.platformsCard();
        consolePage.platformsCardVisa();
        consolePage.platformInspectorHeadingClick();
    }
    @Test @Order(6)
    @DisplayName("Target Alerts Input")
    public void TargetAlerts(){
        consolePage.platformAlertsField();
        consolePage.platformAlertsInput();
        consolePage.platformInspectorHeadingClick();
    }

    @Test @Order(7)
    @DisplayName("Target Hard Alerts")
    public void TargetHardAlerts(){
        consolePage.platformHardAlertsField();
        consolePage.platformHardAlertsInput();
        consolePage.platformInspectorHeadingClick();
    }
    @Test @Order(8)
    @DisplayName("Platforms status Set Active")
    public void PlatformsStatus(){
        consolePage.platformIsActiveState();
        consolePage.platformIsActiveStateTrue();
        consolePage.platformInspectorHeadingClick();
    }
    @Test @Order(9)
    @DisplayName("Save creation of Plaform")
    public void CreateFinish(){
        consolePage.InspectorSaveButton();
    }

}
