package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Soru  extends BaseDriver {

    // Senaryo:
    // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
    // 2-  isim kutucuğuna adınızı yazdırınız
    // 3-  soyad kutucuğuna soyadınız yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  "Thank You" yazısını görünüyor ise "TEST PASSED" yazdırınız

    @Test
    public void Test1(){
        driver.get("https://form.jotform.com/252362792450963");
        WebElement name = driver.findElement(By.xpath("//input[@name='q10_name[first]']"));
        name.sendKeys("Mehmet Deniz");
        WebElement surname = driver.findElement(By.xpath("//input[@name='q10_name[last]']"));
        surname.sendKeys("ÜNLÜ");
        MyFunc.Bekle(3);
        WebElement button = driver.findElement(By.xpath("//button[@id='input_14']"));
        MyFunc.Bekle(3);
        button.click();
        WebElement msj = driver.findElement(By.xpath("//h1[@class='thankyou-main-text ty-text']"));
        /*
         if (msj.getText().contains("Thank You!")) {
            System.out.println("Test Başarılı");
        }else {
            System.out.println("Test Başarısız");
        }
          */

        Assert.assertTrue(msj.getText().contains("Thank You!"),"Aranan msj bulunamadı");
        //Ben true bekliyorum, değilse göster, yoksa test passed


        BekleKapat();
    }
}
