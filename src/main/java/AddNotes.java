import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNotes extends BasePageObj {

    By topic = By.xpath("//select[@data-bind=\"valueWithInit: categoryId\"]"); // нажать на выпадающее меню Тема
    By selectOfftopic = By.xpath("//select[@data-bind=\"valueWithInit: categoryId\"]/option[5]"); // выбрать оффтопик
    By title = By.name("Title"); // заголовок
    By whoCan = By.name("PrivacyDisplay");// кто может просматривать
    By reader = By.xpath("//select[@name='PrivacyDisplay']/option[3]");
    By text = By.xpath("//div[@class=\"fr-element fr-view\"]"); // ввести значение в поле текст
    By create = By.xpath("//button[@data-bind=\"btn: processing\"]"); // опублковать заметку


    public AddNotes(WebDriver driver) {
        super(driver);


    }

    public void clickAddNotes() {

        driver.findElement(topic).click();
        driver.findElement(selectOfftopic).click();
        driver.findElement(title).sendKeys("page object");
        driver.findElement(text).sendKeys(" page object");
        driver.findElement(whoCan).click();
        driver.findElement(reader).click();
        driver.findElement(create).click();
    }
}
