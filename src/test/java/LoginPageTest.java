import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;


public class LoginPageTest extends BaseTest{


    @Test
    void loginIn(){
        new WebDriverWait(driver, Duration.ofSeconds(10));
        ArrayList icons = (ArrayList) driver.findElements(By.xpath("//button[@class=\"btn btn-transparent btn-nav-add\"]"));
        Assertions.assertTrue(icons.size() > 0);

    }
//@Test
//void loginIn(){
//    LoginPage loginIn = new LoginPage(driver);
//    loginIn.loginIn("brat2_kv@ukr.net", "slava-123");
//    new WebDriverWait(driver, Duration.ofSeconds(10));
//}
    @AfterEach
    void exitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
