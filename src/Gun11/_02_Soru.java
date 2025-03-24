package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Soru extends BaseDriver {
    // Senaryo:
    // https://demo.automationtesting.in/Frames.html sayfasına gidiniz
    // "Iframe with in an Iframe"   butonuna tıklatınız.
    // Açılan kutucuğa isminizi yazdırınız
    // Daha sonra  "iFrame Demo" isimli yazının olduğu elemanın getText ini yazıdırnız.
    // Daha sonra  "Nested iFrames" isimli yazının olduğu elemanın getText ini yazdırınız.
    // en son ana sayfanın Title ını yazdırınız.

    @Test
    public void Test1() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        List<WebElement> consentButton = driver.findElements(By.xpath("//*[text()='Consent']"));
        if (consentButton.size() > 0)  // bu element var ise ekranda
            consentButton.get(0).click();

        WebElement ciftFrameLink= driver.findElement(By.xpath("//a[@href='#Multiple']"));
        ciftFrameLink.click();

        WebElement iframe1=driver.findElement(By.xpath("//div[@id='Multiple']/iframe")); // prent iframe
        driver.switchTo().frame(iframe1);

        driver.switchTo().frame(0);  // iframe isimli frame in içindeki ilk iframe geçilmiş olur
        // şu anda en içteki iframe deyim.

        WebElement yaziKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        yaziKutusu.sendKeys("Merhaba");

        WebElement ictekiYazi=driver.findElement(By.xpath("//*[text()='iFrame Demo']"));
        System.out.println("ictekiYazi.getText() = " + ictekiYazi.getText());

        driver.switchTo().parentFrame(); // bir geri gel yani parenete git

        WebElement parentYazi=driver.findElement(By.xpath("//*[text()='Nested iFrames']"));
        System.out.println("parentYazi.getText() = " + parentYazi.getText());

        driver.switchTo().defaultContent();  //şu an ana sayfa ulaştım
        System.out.println("driver.getTitle() = " + driver.getTitle());

        BekleKapat();
    }

}
