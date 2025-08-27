package Gun06;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_CssSelectorOrnek extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");
        //input[@placeholder='Enter email - insert admin@admin.com']
        //input[@placeholder='Enter Password - insert admin123']
        //button[@id='submitLoginBtn']

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Enter email - insert admin@admin.com']"));
        email.sendKeys("admin@admin.com");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Password - insert admin123']"));
        password.sendKeys("admin123");
        WebElement sumbitButton = driver.findElement(By.xpath("//button[@id='submitLoginBtn']"));
        sumbitButton.click();

        WebElement msj = driver.findElement(By.cssSelector("h2[class='section-header']"));

        Assert.assertTrue(msj.getText().contains("SHOPPING CART") , "Msj görünmüyor başarılı giriş sağlanamadı.");

        BekleKapat();


    }
}
