package Scenarios.LoginPage;
import Pages.LoginPage;
import Runner.AppClass;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LoginWithValidCredentials {
    LoginPage loginPage = new LoginPage();
    @BeforeAll
    public static void setUp() {
        AppClass.setUp();
    }

    @Test @Order(1)
    @DisplayName("Login Field Input")
    public void LoginPageLoginInput(){
        loginPage.LoginInput("");
    }
    @Test @Order(2)
    @DisplayName("Password Field Input")
    public void LoginPagePasswordInput(){
        loginPage.PasswordInput("");
    }
    @Test @Order(3)
    @DisplayName("Click Sign_In Button")
    public void ClickSign_InButton(){
        loginPage.clickSign_InButton();
    }
}
