import io.qameta.allure.Epic;
import org.junit.jupiter.api.Test;

public class DellNotesTest extends BaseTest{




    @Test
    @Epic("del notes")
    void dellAddNotes (){
        dellNotes.clickDellNote();




//        WebElement toast = driver.findElement(By.cssSelector(".toast-message"));
//        String message = toast.getText();
//        System.out.println(message);
//        Assertions.assertEquals("Ваш пост был успешно опубликован.", message);


    }
}
