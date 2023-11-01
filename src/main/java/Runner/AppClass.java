package Runner;

import net.lightbody.bmp.BrowserMobProxy;
import net.lightbody.bmp.BrowserMobProxyServer;
import net.lightbody.bmp.client.ClientUtil;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;

public class AppClass {

    public static WebDriver driver;

    public static void setUp() {
        System.out.println("=!!!!!!BEGIN OF THE TEST!!!!!!=");
        System.setProperty("webdriver.chrome.driver","D:\\Education\\Maven\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://milkguard.dev.mp-srv.com/#/");

    }


    public static void tearDown() {
                driver.quit();
    }
}
