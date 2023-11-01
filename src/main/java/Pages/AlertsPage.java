package Pages;
import Runner.AppClass;
import org.apache.commons.logging.Log;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertsPage {

    @Before
    public void setUp(){
        AppClass.setUp();
    }
    private By findTransactionHeading = By.xpath("//div[contains(text(),'Find transaction')]");


    public String getHeadingText(){
       return AppClass.driver.findElement(findTransactionHeading).getText();
    }
    public AlertsPage UserOnPage(){
       System.out.println("User now on page : " + getHeadingText());
        return this;
    }
}
