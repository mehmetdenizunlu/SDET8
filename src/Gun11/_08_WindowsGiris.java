package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _08_WindowsGiris extends BaseDriver {

    // driver.quit();  // bütün açılmış windowları kapatır
    // driver.close(); // sadece bulunduğun window u kapatır.

    @Test
    public void Test1()
    {
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        MyFunc.Bekle(2);

        String anasayfaWindowID=driver.getWindowHandle();  //bulunduğumm window un(Tab) id sini ver
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);

        //linklere tıklatalım
        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement e: linkler)
            js.executeScript("arguments[0].click();", e);

       Set<String> windowsIDler= driver.getWindowHandles(); //bütün tabların İD sini ver
       for (String id: windowsIDler)
           System.out.println("id = " + id);

        // bu noktada en son açılan link tabı aktif
        // Peki ilk sayafa nasıl geçiş yaparım ?

        driver.switchTo().window(anasayfaWindowID); // Ana sayafa geçiş yaptım

        BekleKapat();
    }


}
