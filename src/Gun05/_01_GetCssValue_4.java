package Gun05;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_GetCssValue_4 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.snapdeal.com/");
        WebElement aramaKutusu=driver.findElement(By.id("inputValEnter"));

        // Şekillendiren özellikleri, renk, fontu, background yani class ın içindekiler
        System.out.println("aramaKutusu.getCssValue(color) = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.getCssValue(font-size) = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.getCssValue(height) = " + aramaKutusu.getCssValue("height"));
        System.out.println("aramaKutusu.getCssValue(font-family) = " + aramaKutusu.getCssValue("font-family"));

        BekleKapat();
    }


}
