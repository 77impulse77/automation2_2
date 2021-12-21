import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;



public class Author_2editTest {

    private WebDriver driver;

    @BeforeAll
    static void enableDriver(){
//       System.setProperty("webdriver.chrome.driver", "src/main/resources//chromedriver.exe");
        WebDriverManager.chromedriver().setup();

    }
    @BeforeEach
    void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }

    @DisplayName("Auth")
    @Test
    void addNotes() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");
        driver.get("https://author.today/");
        driver.findElement(By.xpath("//a[@onclick=\"app.showLoginModal();\"]")).click();
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: login\"]")).sendKeys("brat2_kv@ukr.net");
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: password\"]")).sendKeys("slava-123");
        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();

        Thread.sleep(1000);
        //new WebDriverWait(driver, Duration.ofSeconds(2)).until(ExpectedConditions.urlContains("vvv"));
        Assertions.assertThrows(NoSuchElementException.class,()->{WebElement error=driver.findElement(By.xpath("//*[@id=\"authModal\"]/div/div/div[2]/div/div/div/form[2]/ul"));});



        driver.findElement(By.xpath("//div[@class='avatar default-avatar']")).click();
        driver.findElement(By.xpath("//a[@href=\"/u/brat2_kv/posts/edit\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"btn btn-gray btn-with-icon mr-sm\"]")).click();
        driver.findElement(By.xpath("//div[@class=\"fr-element fr-view\"]")).sendKeys("ololo123");
        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();
        WebElement toast=driver.findElement(By.cssSelector(".toast-message"));
        String message = toast.getText();
        System.out.println(message);
        Assertions.assertEquals(message, "Ваш пост был успешно отредактирован.");

    }




    @AfterEach
    void exitDriver(){
        if (driver != null){
            driver.quit();
        }
    }

}
