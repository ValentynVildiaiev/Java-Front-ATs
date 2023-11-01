package Pages;

import Runner.AppClass;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;
import java.util.UUID;

public class ConsolePage {
    private final By midsPage = By.xpath("//a[contains(text(),'Mids')]");
    private final By alertsPage = By.xpath("//a[contains(text(),'alerts')]");
    String uuid = UUID.randomUUID().toString();
    final By domainsHeader = By.xpath("//div[contains(text(),'Domains')]");
    private final By midsHeader = By.xpath("//div[contains(text(),'Mids')]");
    private final By platformsHeader = By.xpath("//div[@class='col'][normalize-space()='Platforms']");
    final By domainsInspectorHeader = By.xpath("//div[contains(text(),'domain')]");
    private final By platformsInspectorHeader = By.xpath("//div[contains(text(),'platform')]");
    private final By midInspectorHeader = By.xpath("//div[@class='text-capitalize col'][contains(text(),'mid')]");
    private final By inspectorCreateButton= By.xpath("//button[@name='editor-create']");
    private final By inspectorRemoveButton= By.xpath("//button[@name='editor-delete']");
    private final By inspectorSaveButton= By.xpath("//div//button[@name='editor-save']");
    private final By inspectorRollbackButton= By.xpath("//button[@name='editor-close']");
    final By createFirstDomain = By.xpath("//tbody/tr[1]/td[1]/div");
    private final By createFirstMid = By.xpath("//div[contains(text(),'Click here to create first Mids.')]");
    private final By selectMid = By.xpath("//div[normalize-space()='Click here to create first Mids.']");
    private final By createFirstPlatform = By.xpath("//div[normalize-space()='Click here to create first Platforms.']");
    private final By createSecondPlatform = By.xpath("//div[@id='table-platform']//tbody/tr[1]");
    private final By domainNameField = By.xpath("//tbody/tr[@name='domain']/td[2]");
    private final By domainNameInput = By.xpath("//input[@name='editor-domain']");
    private final By domainSiteIdField = By.xpath("//tbody/tr[2][@name='siteId']/td[2]");
    private final By domainSiteIdInput = By.xpath("//tbody//input[@name='editor-siteId']");
    private final By domainIsActive = By.xpath("//tr[@name='is_active']//td[2]");
    private final By domainIsActiveTrue = By.xpath("//div[@class='v-list-item__title'][normalize-space()='true']");
    private final By domainIsActiveFalse = By.xpath("//div[@class='v-list-item__title'][normalize-space()='false']");
    private final By midCurrenciesDropdown = By.xpath("//td[contains(text(),'Currencies')]/following-sibling::td");
    private final By CurrencyEUR = By.xpath(".//div[@class='v-list-item__title'][normalize-space()='EUR']");
    private final By CurrencyBDT = By.xpath(".//div[@class='v-list-item__title'][contains(text(),'BDT')]");
    private final By CurrencyXOF = By.xpath(".//div[contains(text(),'XOF')]");
    private final By CurrencyBGN = By.xpath(".//div[contains(text(),'BGN')]");
    private final By CurrencyBAM = By.xpath(".//div[contains(text(),'BAM')]");
    private final By CurrencyBBD = By.xpath(".//div[contains(text(),'BBD')]");
    private final By midTableFirstPosition = By.xpath("//body[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]");
    private final By midCurrencyWhiteList = By.xpath("//tbody/tr[@name='white_list']/td[2]");
    private final By midCurrencyBlackList = By.xpath("//tbody/tr[@name='black_list']/td[2]");
    private final By midIsActive = By.xpath("//tbody/tr[@name='is_active']/td[2]");
    private final By midIsActiveTrue = By.xpath("//div[@class='v-list-item__title'][normalize-space()='true']");
    private final By midIsActiveFalse = By.xpath("//div[@class='v-list-item__title'][normalize-space()='false']");
    private final By platformCardType = By.xpath("//tbody/tr[@name='type']/td[2]");
    private final By platformCardTypeVisa = By.xpath("//div[contains(text(),'visa')]");
    private final By platformCardTypeMasterCard = By.xpath("//div[contains(text(),'mastercard')]");
    private final By platformTargetAlertsField = By.xpath("//tbody/tr[@name='target_alerts']/td[2]");
    private final By platformTargetAlertsInput = By.xpath("//input[@name='editor-target_alerts']");
    private final By platformHardAlertsField = By.xpath("//tbody/tr[@name='hard_alerts']/td[2]");
    private final By platformHardAlertsInput = By.xpath("//input[@name='editor-hard_alerts']");
    private final By platformStatus = By.xpath("//tbody/tr[@name='is_active']/td[2]");
    private final By platformStatusTrue = By.xpath("//div[@class='v-list-item__title'][normalize-space()='true']");
    private final By platformStatusFalse = By.xpath("//div[@class='v-list-item__title'][normalize-space()='false']");


    public void midsPage(){
        new WebDriverWait(AppClass.driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(midsPage)).click();
        return;
    }
    public void alertsPage(){
        new WebDriverWait(AppClass.driver,Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(alertsPage)).click();
        return;
    }

    public WebElement waitSelect(WebElement container, By xpath) {
        String id = container.findElement(By.xpath(".//div[@class='v-input__slot']")).getAttribute("aria-owns");
        WebElement dropdown = new WebDriverWait(AppClass.driver, Duration.ofSeconds(2)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='" + id + "']")));
        return new WebDriverWait(AppClass.driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(dropdown.findElement(xpath)));
    }

    public void domainIsActive() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(domainIsActive)).click();
    }

    public String domainsHeading() {
        return new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(domainsHeader)).getText();
    }

    public void domainsCreate() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(createFirstDomain)).click();
    }

    public String domainsInspectorHeadingText() {
        return new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(domainsHeader)).getText();
    }

    public ConsolePage domainsInspectorHeadingClick() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(domainsInspectorHeader)).click();
        return this;
    }

    public void inputDomainName(String domName) {
      new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(domainNameField)).click();
      new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(domainNameInput)).sendKeys(domName+uuid);
    }

    public void inputDomainSite(String SiteID){
        new WebDriverWait(AppClass.driver,Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(domainSiteIdField)).click();
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(domainSiteIdInput)).sendKeys(SiteID+uuid);
    }

    public void domainActiveTrue() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(domainIsActiveTrue)).click();
    }

    public ConsolePage domainActiveFalse() {
        AppClass.driver.findElement(domainIsActiveFalse).click();
        return this;
    }

    public void midSelectFirstTable(){
     new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(midTableFirstPosition)).click();
     new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(midTableFirstPosition)).click();
    }
    public ConsolePage midSelectCurrencies() {
        AppClass.driver.findElement(createFirstMid).click();
        WebElement td = AppClass.driver.findElement(midCurrenciesDropdown);
        td.click();
        this.waitSelect(td, CurrencyBBD).click();
        this.waitSelect(td, CurrencyEUR).click();
        return this;
    }

    public ConsolePage midCurrencyWL() {
        AppClass.driver.findElement(midsHeader).click();
        WebElement td = AppClass.driver.findElement(midCurrencyWhiteList);
        td.click();
        this.waitSelect(td, CurrencyBAM).click();
        this.waitSelect(td, CurrencyBDT).click();
        return this;

    }

    public ConsolePage midCurrencyBL(){
        AppClass.driver.findElement(midsHeader).click();
        WebElement td = AppClass.driver.findElement(midCurrencyBlackList);
        td.click();
        this.waitSelect(td, CurrencyBGN).click();
        this.waitSelect(td, CurrencyXOF).click();
        return this;
    }

    public String midInspectorHeading() {
        return new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(midInspectorHeader)).getText();
    }
    public ConsolePage midInspectorHeadingClick() {
       new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(midInspectorHeader)).click();
       return this;
    }

    public ConsolePage midCreation() {
        AppClass.driver.findElement(selectMid).click();
        return this;
    }

    public ConsolePage midIsActiveState() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(midIsActive)).click();
        return this;
    }

    public ConsolePage midActiveTrue() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(midIsActiveTrue)).click();
        return this;
    }

    public ConsolePage midActiveFalse() {
        AppClass.driver.findElement(midIsActiveFalse).click();
        return this;
    }

    public ConsolePage InspectorCreateButton() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(inspectorCreateButton)).click();
        return this;
    }

    public void InspectorSaveButton() {
//        AppClass.driver.findElement(inspectorSaveButton).click();
       System.out.println(AppClass.driver);
       AppClass.driver.findElement(inspectorSaveButton).click();
    }

    public void InspectorRollBackButton() {
        AppClass.driver.findElement(inspectorRollbackButton).click();
    }

    public void InspectorDeleteButton() {
        AppClass.driver.findElement(inspectorRemoveButton).click();
    }

    public ConsolePage createPlatform(){
        AppClass.driver.findElement(createFirstPlatform).click();
        return this;
    }

    public String platformsHeadingText(){
        return new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(platformsHeader)).getText();
    }
    public ConsolePage platformInspectorHeading(){
        AppClass.driver.findElement(platformsInspectorHeader).getText();
        return this;
    }
    public ConsolePage platformInspectorHeadingClick(){
        AppClass.driver.findElement(platformsInspectorHeader).click();
        return this;
    }
    public ConsolePage platformsCard(){
        AppClass.driver.findElement(platformCardType).click();
        return this;
    }
    public ConsolePage platformsCardVisa(){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(platformCardTypeVisa)).click();
        return this;
    }
    public ConsolePage platformsCardMasterCard(){
        AppClass.driver.findElement(platformCardTypeMasterCard).click();
        return this;
    }
    public ConsolePage platformAlertsField() {
        AppClass.driver.findElement(platformTargetAlertsField).click();
        return this;
    }
    public ConsolePage platformAlertsInput() {
        AppClass.driver.findElement(platformTargetAlertsInput).click();
        AppClass.driver.findElement(platformTargetAlertsInput).sendKeys(randomNumber());
        return this;
    }
    public ConsolePage platformHardAlertsField(){
        AppClass.driver.findElement(platformHardAlertsField).click();
        return this;
    }
    public ConsolePage platformHardAlertsInput(){
        AppClass.driver.findElement(platformHardAlertsInput).click();
        AppClass.driver.findElement(platformHardAlertsInput).sendKeys(randomNumber());
        return this;
    }

    public ConsolePage platformIsActiveState() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(platformStatus)).click();
        return this;
    }
    public ConsolePage platformIsActiveStateTrue() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(platformStatusTrue)).click();
        return this;
    }
    public ConsolePage platformIsActiveStateFalse() {
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(platformStatusFalse)).click();
        return this;
    }
    public ConsolePage secondPlatformCreation(){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(createSecondPlatform)).click();
        return this;
    }


    public ConsolePage randomName(){
        // random string of length 8 composed of alphabetic characters
        String random = RandomStringUtils.randomAlphabetic(8);
        AppClass.driver.findElement(domainNameInput).sendKeys(RandomStringUtils.randomAlphabetic(8));
        return this;
    }

    public String randomNumber(){
        // random string of length 3 composed of Numeric characters
       return RandomStringUtils.randomNumeric(3);

    }





















    }


