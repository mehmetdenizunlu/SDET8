package Gun10;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _04_ImplicitlyWait extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        //bu bölümü iyi anlamakl için BaseDriver daki implicitlyWait i kapatıp denemeleri yapalım
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120)); // 5,10,120
        // mühlet kadar beklemedi, elementi bulduğu anda devam etti,sürenin hepsini kullanmadı
        // Thread.Sleep(120000) -> 120 sn beklerdi.

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebElement msj=driver.findElement(By.xpath("//*[text()='WebDriver']"));
        System.out.println("msj.getText() = " + msj.getText());

        BekleKapat();
    }


}
