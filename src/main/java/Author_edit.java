//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.util.concurrent.TimeUnit;
//
//public class Author_edit {
//
//    // ЗАПУСКАТЬ ВТОРЫМ
//
//    public static void main(String[] args) {
//
//        System.setProperty(
//                "webdriver.chrome.driver", "src/main/resources//chromedriver.exe"
//        );
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("incognito");
//
//        WebDriver driver = new ChromeDriver(chromeOptions);
//
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        driver.get("https://author.today/");
//
//        driver.findElement(By.xpath("//a[@onclick=\"app.showLoginModal();\"]")).click();
//        driver.findElement(By.xpath("//input[@data-bind=\"textInput: login\"]")).sendKeys("brat2_kv@ukr.net");
//        driver.findElement(By.xpath("//input[@data-bind=\"textInput: password\"]")).sendKeys("slava-123");
//        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();
//
//        driver.findElement(By.xpath("//div[@class='avatar default-avatar']")).click();
//
//
//        driver.findElement(By.xpath("//a[@href=\"/u/brat2_kv/posts/edit\"]")).click();
//        driver.findElement(By.xpath("//a[@class=\"btn btn-gray btn-with-icon mr-sm\"]")).click();
//        driver.findElement(By.xpath("//div[@class=\"fr-element fr-view\"]")).sendKeys("ololo123");
//        driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]")).click();
//
//
//     driver.quit();
//    }
//}
