package Pages;


import Runner.AppClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class MidsPage {

    private final By singlemidsHeading = By.xpath("//div[contains(text(),'Single-mids')]");
    private final By selectorButton = By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light primary--text']");
    private final By filterCurrencies = By.xpath("//div[@class='v-list-item__title'][contains(text(),'Currencies')]");
    private final By filterBlackList = By.xpath("//div[@class='v-list-item__title'][contains(text(),'Black List')]");
    private final By filterWhiteList = By.xpath("//div[@class='v-list-item__title'][contains(text(),'White List')]");
    private final By filterActions = By.xpath("//div[@class='v-list-item__title'][contains(text(),'Actions')]");
    private final By editButton = By.xpath("//tbody/tr[3]/td[5]/button[1]");







        public String midsPageHeadingText() {
            return new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(singlemidsHeading)).getText();
        }
        public void selectorButtonClick(){
            new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(selectorButton)).click();
        }
        public void setFilterCurrenciesClick(){
            new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(filterCurrencies)).click();
        }

        public void setFilterBlackList(){
            new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(filterBlackList)).click();
        }

        public void setFilterWhiteListClick(){
            new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(filterWhiteList)).click();
        }


    }

