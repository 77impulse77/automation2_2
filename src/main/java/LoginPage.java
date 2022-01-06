import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePageObj{
    private WebElement in;
    private WebElement login;
    private WebElement password;
    private WebElement submit;
//    @FindBy (xpath = "//a[@onclick=\"app.showLoginModal();\"]")
//    private WebElement in;
//    @FindBy (xpath = "//input[@data-bind=\"textInput: login\"]")
//    private WebElement login;
//    @FindBy (xpath = "//input[@data-bind=\"textInput: password\"]")
//    private WebElement password;
//    @FindBy (xpath = "//button[@data-bind=\"btn: processing\"]")
//    private WebElement submit;
//
//    public LoginPage(WebDriver driver) {
//
//    }


    public LoginPage (WebDriver driver) {
        super(driver);

    }

    public void loginIn(String login, String password){
        in = driver.findElement(By.xpath("//a[@onclick=\"app.showLoginModal();\"]"));
        this.login = driver.findElement(By.xpath("//input[@data-bind=\"textInput: login\"]"));
        this.password = driver.findElement(By.xpath("//input[@data-bind=\"textInput: password\"]"));
        submit = driver.findElement(By.xpath("//button[@data-bind=\"btn: processing\"]"));

        in.click();
        this.login.sendKeys(login);
        this.password.sendKeys(password);
        submit.click();
    }
}
