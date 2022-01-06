import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DellNotes extends BasePageObj{


    By avatar = By.xpath("//div[@class='avatar default-avatar']"); // нажать на аватар
    By blog = By.xpath("//a[@href=\"/u/brat2_kv/posts/edit\"]"); // нажать на на блог
    By selectFirst = By.xpath("//a[@class='btn btn-gray btn-with-icon mr-sm']"); // нажать редактировать
    //By selectFirst = By.cssSelector("btn btn-gray btn-with-icon mr-sm"); // нажать редактировать
    By edit = By.xpath("//button[@class='btn btn-simple-danger mr']"); // нажать удалить
    By dell = By.xpath("//button[@class='btn btn-simple-danger ml-sm']"); // подтвердить удаление




    public DellNotes(WebDriver driver) {
        super(driver);


    }

    public void clickDellNote() {

        driver.findElement(avatar).click();
        driver.findElement(blog).click();
        driver.findElement(selectFirst).click();
        driver.findElement(edit).click();
        driver.findElement(dell).click();

    }


}
