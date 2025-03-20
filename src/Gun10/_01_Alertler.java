package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_Alertler extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement clickMe=driver.findElement(By.id("alert"));
        clickMe.click();
        MyFunc.Bekle(2);
        //su anda alert çıkmış oldu

        driver.switchTo().alert().accept(); // Alertin OK butonuna bas

        BekleKapat();
    }

    @Test
    public void Test2() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement clickMe=driver.findElement(By.id("prompt"));
        clickMe.click();
        MyFunc.Bekle(2);
        //su anda alert-prompt çıkmış oldu

        driver.switchTo().alert().sendKeys("ismet");
        driver.switchTo().alert().accept(); // Alertin OK butonuna bas

        WebElement txtMesaj=driver.findElement(By.id("text"));

        MyFunc.Bekle(2);
        new Actions(driver).scrollToElement(txtMesaj).build().perform();
        MyFunc.Bekle(2);

        Assert.assertTrue("Yazı bulunamadı", txtMesaj.getText().contains("ismet"));

        BekleKapat();
    }

    @Test
    public void Test3() {
        driver.get("https://www.selenium.dev/selenium/web/alerts.html");
        MyFunc.Bekle(2);

        WebElement clickMe=driver.findElement(By.id("prompt"));
        clickMe.click();
        MyFunc.Bekle(2);
        //su anda alert-prompt çıkmış oldu

        String baslik=driver.switchTo().alert().getText(); // promptun Açıklama başlığı
        driver.switchTo().alert().accept(); // Alertin OK butonuna bas

        Assert.assertTrue("Yazı bulunamadı", baslik.contains("Enter"));

        BekleKapat();
    }


}
