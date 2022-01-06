import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderBar extends BasePageObj{
    By addBtn = By.xpath("//button[@class=\"btn btn-transparent btn-nav-add\"]");
    By newBlog = By.xpath("//a[@href='/post/create']");


    public HeaderBar(WebDriver driver) {
        super(driver);
    }


    void clickAdd (){
        driver.findElement(addBtn).click();
        driver.findElement(newBlog).click();


    }
}
