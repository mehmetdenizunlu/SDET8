package Gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebElementGetText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement loginButton = driver.findElement(By.xpath("//button[@name='login']"));
        String elementinGörünenYazısı = loginButton.getText();
        System.out.println("Button elementindeki text : " +elementinGörünenYazısı);
        // getText() -> WebElemntin ekranda gözüken yazısını verir
        MyFunc.Bekle(4);
        driver.quit();
    }
}
