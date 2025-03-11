package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _09_GetAttribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.id("sublabel_8_first"));

        System.out.println("element.getAttribute(class) = " + element.getAttribute("class"));
        System.out.println("element.getAttribute(for) = " + element.getAttribute("for"));
        System.out.println("element.getAttribute(id) = " + element.getAttribute("id"));
        System.out.println("element.getAttribute(style) = " + element.getAttribute("style"));

        MyFunc.Bekle(3);
        driver.quit();
    }
}
