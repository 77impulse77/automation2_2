import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Author_add {

// ЗАПУСКАТЬ ПЕРВЫМ
    public static void main(String[] args) {

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources//chromedriver.exe"
        );
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("incognito");

        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://author.today/");

        driver.findElement(By.xpath("//a[@onclick=\"app.showLoginModal();\"]")).click();
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: login\"]")).sendKeys("brat2_kv@ukr.net");
        driver.findElement(By.xpath("//input[@data-bind=\"textInput: password\"]")).sendKeys("slava-123");
        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();


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












//      driver.quit();
    }

}
