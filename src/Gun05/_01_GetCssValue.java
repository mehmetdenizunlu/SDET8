package Gun05;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetCssValue {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.snapdeal.com/");

        WebElement aramaKutusu=driver.findElement(By.id("inputValEnter"));
        
        // GetAttribute : parametreleri ve değerleri
        System.out.println("aramaKutusu.getAttribute(autocomplete) = " + aramaKutusu.getAttribute("autocomplete"));
        System.out.println("aramaKutusu.getAttribute(name) = " + aramaKutusu.getAttribute("name"));
        System.out.println("aramaKutusu.getAttribute(type) = " + aramaKutusu.getAttribute("type"));
        System.out.println("aramaKutusu.getAttribute(class) = " + aramaKutusu.getAttribute("class"));
        System.out.println("aramaKutusu.getAttribute(placeholder) = " + aramaKutusu.getAttribute("placeholder"));

        // Şekillendiren özellikleri, renk, fontu, background yani class ın içindekiler
        System.out.println("aramaKutusu.getCssValue(color) = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.getCssValue(font-size) = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.getCssValue(height) = " + aramaKutusu.getCssValue("height"));
        System.out.println("aramaKutusu.getCssValue(font-family) = " + aramaKutusu.getCssValue("font-family"));

        MyFunc.Bekle(3);
        driver.quit();
    }
}
