package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetCssValue_2 extends BaseDriver {
    public static void main(String[] args) {
        //DriverBasla

        driver.get("https://www.google.com/?hl=tr");

        WebElement aramaKutusu = driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']"));

        //getAttribute : parametre ve değerleri.

        System.out.println("aramaKutusu.getAttribute() "+aramaKutusu.getAttribute("class"));
        System.out.println("aramaKutusu.getAttribute() "  +aramaKutusu.getAttribute("aria-controls"));
        System.out.println(" aramaKutusu.getAttribute()" +aramaKutusu.getAttribute("aria-owns"));
        System.out.println(" aramaKutusu.getAttribute" +aramaKutusu.getAttribute("name"));
        System.out.println(" aramaKutusu.getAttribute"+aramaKutusu.getAttribute("autocorrect"));

        // Şekillendiren özellikleri, renk, fontu, background yani class ın içindekiler

        System.out.println(aramaKutusu.getCssValue("width"));
        System.out.println(aramaKutusu.getCssValue("background-color"));
        System.out.println(aramaKutusu.getCssValue("color"));
        System.out.println(aramaKutusu.getCssValue("display"));

      BekleKapat();
    }
}
