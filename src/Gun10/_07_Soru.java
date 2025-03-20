package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _07_Soru extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://letcode.in/waits");

        WebElement buton = driver.findElement(By.id("accept"));
        buton.click();

        WebDriverWait bekle=new WebDriverWait(driver,Duration.ofSeconds(200));
        bekle.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();  // alerti kapattım
        BekleKapat();
    }
}
