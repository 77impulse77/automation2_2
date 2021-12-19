import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class Author_addTest {

    private WebDriver driver;

    @BeforeAll
    static void enableDriver(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @DisplayName("Auth")
    @Test
     void auth(){
        driver.get("https://author.today/");
        new WebDriverWait(driver, Duration.ofSeconds(10));

    }


    @AfterEach
    void exitDriver(){
        if (driver != null){
            driver.quit();
        }
    }

}
