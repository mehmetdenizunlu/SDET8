package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_WaitsGiris extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://letcode.in/waits");

        WebElement buton = driver.findElement(By.id("accept"));
        buton.click();

        MyFunc.Bekle(20); // Web sayfasından haberi yok sadece JAVA tarafını bekletiyor.
        // az veya çok fazla olabilir, yetersiz gelebilir veya zaman kaybı oluşturur
        driver.switchTo().alert().accept();  // alerti kapattım
        BekleKapat();
    }
}
