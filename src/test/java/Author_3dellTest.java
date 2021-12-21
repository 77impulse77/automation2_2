import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;

public class Author_3dellTest {
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

    @DisplayName("Dell")
    @Test
    void dellNotes() {


        driver.get("https://author.today/");
        driver.findElement(By.xpath("//a[@onclick=\"app.showLoginModal();\"]")).click();
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: login\"]")).sendKeys("brat2_kv@ukr.net");
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: password\"]")).sendKeys("slava-123");
        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();
        ArrayList icons = (ArrayList) driver.findElements(By.xpath("//button[@class=\"btn btn-transparent btn-nav-add\"]"));
        Assertions.assertTrue(icons.size() > 0);

        driver.findElement(By.xpath("//div[@class='avatar default-avatar']")).click();
        driver.findElement(By.xpath("//a[@href=\"/u/brat2_kv/posts/edit\"]")).click();

        driver.findElement(By.xpath("//a[@class=\"btn btn-default mt-sm\"]")).click();
//        Thread.sleep(500);
        driver.navigate().back();
//        Thread.sleep(500);
        driver.navigate().forward();
        driver.findElement(By.xpath("//a[@class=\"btn btn-default mt-sm\"]")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-gray btn-with-icon mt-lg']")).click();
        driver.findElement(By.xpath("//select[@name='PrivacyDisplay']")).click();
        driver.findElement(By.xpath("//select[@name='PrivacyDisplay']/option[2]")).click();
        driver.findElement(By.xpath("//span[@class='icon-check-bold']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Выберите от одного до трех редакторов']")).sendKeys("american");
        driver.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
        driver.findElement(By.xpath("//i[@class='icon-cross']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-simple-danger mr']")).click();
        driver.findElement(By.xpath("//span[contains(text(),\"×\")]")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-simple-danger mr']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-simple-danger ml-sm']")).click();
        WebElement toast = driver.findElement(By.cssSelector(".toast-message"));
        String message = toast.getText();
        System.out.println(message);
        Assertions.assertEquals("был удален.", message.substring(message.length() - 11));


    }


    @AfterEach
    void exitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }

}
