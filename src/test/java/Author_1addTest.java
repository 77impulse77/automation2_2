import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;


public class Author_1addTest {
    private static ChromeOptions chromeOptions;
    private WebDriver driver;

    @BeforeAll
    static void enableDriver() {

        WebDriverManager.chromedriver().setup();
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");


    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @DisplayName("Auth")
    @Test
    public void addNotes() {


        driver.get("https://author.today/");
        driver.findElement(By.xpath("//a[@onclick=\"app.showLoginModal();\"]")).click();
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: login\"]")).sendKeys("brat2_kv@ukr.net");
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: password\"]")).sendKeys("slava-123");
        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();
        ArrayList icons = (ArrayList) driver.findElements(By.xpath("//button[@class=\"btn btn-transparent btn-nav-add\"]"));
        Assertions.assertTrue(icons.size() > 0);


        driver.findElement(By.xpath("//button[@class=\"btn btn-transparent btn-nav-add\"]")).click();
        driver.findElement(By.xpath("//a[@href='/post/create']")).click();


        Select select = new Select(driver.findElement(By.xpath("//select[@data-bind=\"valueWithInit: categoryId\"]")));
        select.selectByVisibleText("Оффтопик");

        driver.findElement(By.name("Title")).sendKeys("Test7777");
        driver.findElement(By.xpath("//div[@class=\"fr-element fr-view\"]")).sendKeys("ololo");

        Select select1 = new Select(driver.findElement(By.name("PrivacyDisplay")));
        select1.selectByVisibleText("Только друзья");

        Select select2 = new Select(driver.findElement(By.name("PrivacyComments")));
        select2.selectByVisibleText("Никто");

        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement toast = driver.findElement(By.cssSelector(".toast-message"));
        String message = toast.getText();
        System.out.println(message);
        Assertions.assertEquals("Ваш пост был успешно опубликован.", message);


    }


    @AfterEach
    void exitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }


}
