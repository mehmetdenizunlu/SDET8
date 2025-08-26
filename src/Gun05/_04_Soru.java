package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Soru  extends BaseDriver {

    @Test
    public void Test1() {
        // Senaryo:
        // 1-  https://qa-practice.netlify.app/auth_ecommerce  sayfasınız açınız
        // 2-  Email kutucuğuna "admin@admin.com" i yaziniz
        // 3-  Password kutucuğuna "admin123" yazdırınız
        // 4-  Submit butona tıklatınız (click)
        // 5-  Açılan yeni sayfada "SHOPPING CART" yazısının göründüğünü Assert ile doğrulayınız

        //input[@id='email']
        //input[@id='password']
        //button[@id='submitLoginBtn']
        //h2[@class='section-header']

        driver.get("https://qa-practice.netlify.app/auth_ecommerce");
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("admin@admin.com");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("admin123");
        WebElement submitButton = driver.findElement(By.xpath("//button[@id='submitLoginBtn']"));
        submitButton.click();
        MyFunc.Bekle(3);

        WebElement dogrulamaYazisi = driver.findElement(By.xpath("//h2[@class='section-header']"));
        Assert.assertTrue(dogrulamaYazisi.getText().contains("SHOPPING") , "Yazı Bulunamadı.Test Başarısız !!");

        BekleKapat();

    }
}
