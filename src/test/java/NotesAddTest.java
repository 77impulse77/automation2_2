import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NotesAddTest extends BaseTest{


    @Test
    @Epic("header")
    void addNotes(){
         headerBar.clickAdd(); // нажать на кнопку добавить в хедере после логина
         assertTrue(driver.findElement(By.xpath("//div[contains(text(),\"Новый пост\")]")).isDisplayed());



    }


}

