package Pages;

import Runner.AppClass;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private static final By loginField = By.xpath("//input[@name='auth-login']");
    private static final By passwordField = By.xpath("//input[@name='auth-password']");
    private static final By loginError = By.xpath("//div[@class='v-messages__message'][contains(text(),'Login is required')]");
    private static final By passwordError = By.xpath("//div[@class='v-messages__message'][contains(text(),'Password is required')]");
    private static final By signInButton = By.xpath("//span[contains(text(),'Sign In')]");
    private final By loginPageFrame = By.xpath("//body/div[@id='inspire']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]");


    public void LoginInput(String Login){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(loginField)).sendKeys("qa.mp-srv@milkbox.com");
    }
    public void LoginInputClick(){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(loginField)).click();
    }
    public void PasswordInput(String Password){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys("z^(7F{E:");
    }
    public void PasswordInputClick(){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(passwordField)).click();
    }
    public String LoginRequiredError(){
        return new WebDriverWait(AppClass.driver,Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(loginError)).getText();
    }
    public String passwordRequiredError(){
        return new WebDriverWait(AppClass.driver,Duration.ofSeconds(3)).until(ExpectedConditions.presenceOfElementLocated(passwordError)).getText();
    }
    public LoginPage clickSign_InButton(){
       new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(signInButton)).click();
       return this;
    }

    public static void Authorization (){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(loginField)).click();
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(loginField)).sendKeys("qa.mp-srv@milkbox.com");
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(passwordField)).click();
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(passwordField)).sendKeys("z^(7F{E:");
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(signInButton)).click();
        return;
    }

    public void FrameClick(){
        new WebDriverWait(AppClass.driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(loginPageFrame)).click();
    }


}
