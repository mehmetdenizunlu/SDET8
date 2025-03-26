package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

// commons-io:commons-io:2.11.0

public class _01_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

//        WebElement username=driver.findElement(By.name("username"));
//        username.sendKeys("ismet");
        driver.findElement(By.name("username")).sendKeys("ismet");  //kısa yazılışı
        driver.findElement(By.name("password")).sendKeys("123");    //kısa yazılışı
        driver.findElement(By.cssSelector("button[type='submit']")).click();  //kısa yazılışı

        List<WebElement> errorMsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size()>0) // hata mesajı çıkmış semektir
        {
            System.out.println("Hata oldu");
            //ekran kaydını al

            TakesScreenshot ts=(TakesScreenshot)driver;
            File hafizadaDosyaHalinde =ts.getScreenshotAs(OutputType.FILE); // ekran kaydı aldı dosya tipi şeklinde

            // hafızadaki bu ekran görüntüsünü, fiziksel bir dosyaya yaz dememiz lazım
            FileUtils.copyFile(hafizadaDosyaHalinde, new File("ekranGoruntuleri\\screenshot.jpg"));

        }

        BekleKapat();
    }

}
