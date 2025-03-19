package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://demoqa.com/auto-complete");
        MyFunc.Bekle(3);

        WebElement txtBox = driver.findElement(By.id("autoCompleteMultipleInput"));

        new Actions(driver)
                .moveToElement(txtBox)// kutucuğa git
                .click()              // yazabilmek için içine tıklat
                .keyDown(Keys.SHIFT)  // shift tuşuna bas
                .sendKeys("a")        // a harfini gönder büyük A yazmalı shift tne dolayı
                .keyUp(Keys.SHIFT)    // shift tuşunu geri bırak
                .sendKeys("hmet")     // hmet yazısını gönder küçük harflerle yazmalı
                .build()              // aksiyonu hazırla
                .perform();           // işlemi gerçekleştir.

        BekleKapat();
    }

}
