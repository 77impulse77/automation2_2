import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotesAddTest extends BaseTest{


    @Test
    void addNotes(){
         headerBar.clickAdd();
         assertTrue(driver.findElement(By.xpath("//div[contains(text(),\"Новый пост\")]")).isDisplayed());



    }


}

