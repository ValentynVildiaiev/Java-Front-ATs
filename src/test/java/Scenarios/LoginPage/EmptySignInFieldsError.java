package Scenarios.LoginPage;
import Pages.LoginPage;
import Runner.AppClass;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmptySignInFieldsError {
    LoginPage loginPage = new LoginPage();

    @BeforeAll
    public static void setUp() {
        AppClass.setUp();
    }

    @Test @Order(1)
    @DisplayName("SignIn Username Field Empty Error")
    public void emptyUsername(){
        loginPage.LoginInputClick();
        loginPage.FrameClick();
        System.out.println("Error shown: " + loginPage.LoginRequiredError());
    }
    @Test @Order(2)
    @DisplayName("SignIn Password Field Empty Error")
    public void emptyPasswordField(){
        loginPage.PasswordInputClick();
        loginPage.FrameClick();
        System.out.println("Error shown: " + loginPage.passwordRequiredError());
    }



}
