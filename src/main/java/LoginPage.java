import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private WebElement in;
    private  WebElement login;
    private  WebElement password;
    private WebElement submit;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        in = driver.findElement(By.xpath("//a[@onclick=\"app.showLoginModal();\"]"));
        login = driver.findElement(By.xpath("//input[@data-bind=\"textInput: login\"]"));
        password = driver.findElement(By.xpath("//input[@data-bind=\"textInput: password\"]"));
        submit = driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]"));

    }

    public void loginIn(String login, String password){
        in.click();
        this.login.sendKeys(login);
        this.password.sendKeys(password);
        submit.click();
    }
}
