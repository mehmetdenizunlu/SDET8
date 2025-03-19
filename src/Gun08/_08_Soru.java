package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _08_Soru extends BaseDriver {

//    https://www.hepsiburada.com.tr/ sayfasına gidiniz.
//    Moda -> Pantolon  click
//    tıklatma işleminden sonra URL de
//    pantolon kelimesinin geçtiğini doğrulayın.
//    Yukarıdaki aksyonlar için Actions sınıfını kullanınız

    @Test
    public void Test1() {
        driver.get("https://www.hepsiburada.com/");
        MyFunc.Bekle(2);
        Actions aksiyonlar = new Actions(driver);

        List<WebElement> detailsButton=driver.findElements(By.id("details-button"));
        if (detailsButton.size() > 0)  // bu eleemnt var ise ekranda
        {
            detailsButton.get(0).click();
            WebElement devamLinki=driver.findElement(By.id("proceed-link"));
            devamLinki.click();
        }

        List<WebElement> consentButton=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consentButton.size() > 0)  // bu eleemnt var ise ekranda
        {
            consentButton.get(0).click();
        }

        MyFunc.Bekle(2);

        WebElement moda=driver.findElement(By.xpath("//*[text()='Moda']"));
        aksiyonlar.moveToElement(moda).build().perform();
        MyFunc.Bekle(2);

        WebElement pantolon=driver.findElement(By.xpath("(//*[text()='Pantolon'])[2]"));
        pantolon.click();
        MyFunc.Bekle(2);

        Assert.assertTrue("Aranan kelime bulunamadı", driver.getCurrentUrl().contains("pantolon"));

        BekleKapat();
    }


}
