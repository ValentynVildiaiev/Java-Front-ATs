package PagesTest;
import Pages.AlertsPage;
import Runner.AppClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class AlertsPageTest {
    AlertsPage alertsPage = new AlertsPage();
    @Before
    public void setUp(){
        AppClass.setUp();
    }
    @Test
    @DisplayName("Alert page is current opened page")
    public void HeadingOfThePage(){
        alertsPage.getHeadingText();
    }
    @Test
    @DisplayName("User currently on page")
    public void userNowOnPage(){
        alertsPage.UserOnPage();
    }
    @After
    public void tearDown(){
        AppClass.tearDown();
    }
}

