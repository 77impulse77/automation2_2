import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DellNotesTest extends BaseTest{




    @Test
    void dellAddNotes (){
        dellNotes.clickDellNote();
        WebElement toast = driver.findElement(By.cssSelector(".toast-message"));
        String message = toast.getText();
        System.out.println(message);
        Assertions.assertEquals("был удален.", message.substring(message.length() - 11));




//        WebElement toast = driver.findElement(By.cssSelector(".toast-message"));
//        String message = toast.getText();
//        System.out.println(message);
//        Assertions.assertEquals("Ваш пост был успешно опубликован.", message);


    }
}
