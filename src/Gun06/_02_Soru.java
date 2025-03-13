package Gun06;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseDriver {
    // Senaryo: (Bu soruda bulunacak elemanın hiç bir attribute kullanılmadan elemnnlar bulunmalıdır.)
    // 1-  https://qa-practice.netlify.app/auth_ecommerce  sayfasınız açınız
    // 2-  Email kutucuğuna "admin@admin.com" i yaziniz
    // 3-  Password kutucuğuna "admin123" yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  Açılan yeni sayfada "SHOPPING CART" yazısının göründüğünü Assert ile doğrulayınız

    @Test
    public void Test1()
    {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        WebElement email=driver.findElement(By.cssSelector("small[id='emailHelp']~input"));
        email.sendKeys("admin@admin.com");

        WebElement password=driver.findElement(By.cssSelector("form[id='login']> :nth-child(2) > :nth-child(2)"));  // form[id='login']>div+div>input
        password.sendKeys("admin123");

        WebElement submit=driver.findElement(By.cssSelector("form[id='login']> :nth-child(3)"));
        submit.click();

        WebElement shoppingCartMesaj=driver.findElement(By.cssSelector("div[id='prooood'] h2"));

        Assert.assertTrue("Aranan mesaj bulunamadı", shoppingCartMesaj.getText().contains("SHOPPING CART"));

        BekleKapat();
    }
}
