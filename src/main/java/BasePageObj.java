
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class BasePageObj {

    protected WebDriver driver;
    protected WebDriverWait waiter;


    public BasePageObj(WebDriver driver) {
        this.driver = driver;
        waiter = new WebDriverWait(this.driver, Duration.ofSeconds(15));

    }
}
