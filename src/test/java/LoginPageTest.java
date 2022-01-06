import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPageTest {
    private static ChromeOptions chromeOptions;
    private WebDriver driver;

//    @BeforeEach
//    void runPage() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        driver.get("https://author.today/");
//    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://author.today/");

    }


    @BeforeAll
    static void enableDriver() {

        WebDriverManager.chromedriver().setup();
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

    }


    @Test
    void loginIn(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://author.today/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginIn("brat2_kv@ukr.net", "slava-123");

        new WebDriverWait(driver, Duration.ofSeconds(10));
//        driver.quit();

    }

    @AfterEach
    void exitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
