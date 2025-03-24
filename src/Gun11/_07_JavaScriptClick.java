package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _07_JavaScriptClick extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement ciftFrameLink= driver.findElement(By.xpath("//a[@href='#Multiple']"));
        //ciftFrameLink.click();  //öne consent çıktığından tıklatamadı

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ciftFrameLink);  // içerden kod ile tıklatıldı

        BekleKapat();
    }

}
