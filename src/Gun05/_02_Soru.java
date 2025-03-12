package Gun05;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseDriver {

    // Senaryo:
    // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
    // 2-  isim kutucuğuna adınızı yazdırınız
    // 3-  soyad kutucuğuna soyadınız yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  "Thank You" yazısını görünüyor ise "TEST PASSED" yazdırınız

    @Test
    public void Test1(){
        // test yazım bölgesi
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu= driver.findElement(By.id("first_8"));
        isimKutusu.sendKeys("ismet");

        WebElement soyadKutusu= driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("temur");

        WebElement submitButton= driver.findElement(By.id("input_2"));
        submitButton.click();

        WebElement tesekkurYazisi=driver.findElement(By.className("thankyou-main-text"));
        System.out.println("tesekkurYazisi.getText() = " + tesekkurYazisi.getText());

        BekleKapat();
    }

}
