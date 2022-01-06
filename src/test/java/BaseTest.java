import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {

    private static ChromeOptions chromeOptions;
    protected WebDriver driver;
    protected HeaderBar headerBar;
    protected LoginPage loginPage;
    protected AddNotes addNotes ;

    @BeforeAll
    static void enableDriver() {
        WebDriverManager.chromedriver().setup();
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
    }

    @BeforeEach
    void setupDriver() {
        this.driver = new ChromeDriver(chromeOptions);
        addNotes = new AddNotes(driver);
        headerBar = new HeaderBar(driver);
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://author.today/");
        loginPage.loginIn("brat2_kv@ukr.net", "slava-123");
    }
    @AfterEach
    void exitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
