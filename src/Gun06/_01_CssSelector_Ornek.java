package Gun06;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_Ornek extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("admin@admin.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("admin123");

        WebElement submit=driver.findElement(By.id("submitLoginBtn"));
        submit.click();

        WebElement shoppingCartMesaj=driver.findElement(By.className("section-header"));

        Assert.assertTrue("Aranan mesaj bulunamadı", shoppingCartMesaj.getText().contains("SHOPPING CART"));

        BekleKapat();
    }

}
