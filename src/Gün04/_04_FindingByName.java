package Gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        // Senaryo: (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/252362792450963  sayfasınız açınız
        // 2-  isim kutucuğuna "Mehmet Deniz" yazdırınız
        // 3-  soyad kutucuğuna "Ünlü" yazdırınız

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/252362792450963");

        WebElement name = driver.findElement(By.name("q10_name[first]"));
        name.sendKeys("Mehmet Deniz");
        WebElement surname = driver.findElement(By.name("q10_name[last]"));
        surname.sendKeys("Ünlü");
        MyFunc.Bekle(5);
        driver.quit();

    }
}
