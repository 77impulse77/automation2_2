import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddNotesTest extends BaseTest{



    @Test
    void clickAddNotes (){

        headerBar.clickAdd();
        addNotes.clickAddNotes();
        WebElement toast = driver.findElement(By.cssSelector(".toast-message"));
        String message = toast.getText();
        System.out.println(message);
        Assertions.assertEquals("Ваш пост был успешно опубликован.", message);
        //Assertions

    }


}