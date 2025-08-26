package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _09_GetAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/252362792450963");

        WebElement element = driver.findElement(By.id("last_10"));
        System.out.println(element.getAttribute("type")); // type attributenini value değerini vericek
        System.out.println(element.getAttribute("id")); // id attributenin value değerini vericek.
        System.out.println(element.getAttribute("name")); //name attributenin value değerini vericek.
        System.out.println(element.getAttribute("aaaa")); //aa isminde attributesi olamadığı için null vericek.
        System.out.println(element.getAttribute("class")); // class attributenin value değerini vericek.

        MyFunc.Bekle(3);
        driver.quit();
    }
}
