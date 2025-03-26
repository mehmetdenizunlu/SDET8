package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() {
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

//        WebElement username=driver.findElement(By.name("username"));
//        username.sendKeys("ismet");
        driver.findElement(By.name("username")).sendKeys("ismet");
        driver.findElement(By.name("password")).sendKeys("123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        List<WebElement> errorMsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size()>0) // hata mesajı çıkmış semektir
        {
            System.out.println("Hata oldu");
            //ekran kaydını al


        }


        BekleKapat();
    }

}
