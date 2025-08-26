package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_FindingById {
    public static void main(String[] args) {
        // Senaryo:
        // 1-  https://www.facebook.com/  sayfasınız açınız
        // 2-  email kutucuğuna "mdu9506@gmail.com" yazdırınız
        // 3-  password  kutucuğuna "12345" yazdırınız

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        // email locate  = //input[@id='email']
        //password locate  = ////input[@id='pass']

        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys("mdu9506@gmail.com"); // kutucuga metni yaz demek
        WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
        password.sendKeys("12345"); // kutucuğa metni yaz demek
        MyFunc.Bekle(4);
        driver.quit();

        // bunları By.id ilede yapabilirdik farkı yok.


    }
}
