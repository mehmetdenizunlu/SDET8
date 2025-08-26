package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _06_FindElementVeFindElements {
    public static void main(String[] args) {
        // Browserda incele yaptığınızda id lerden aramalar için #, class aramalar için . konabilir.

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/252362792450963");

       // WebElement element1 = driver.findElement(By.id("hataliLocator"));
        // no such element : element bulunamadı hatası

        List<WebElement> elements2 = driver.findElements(By.id("HataliLocator"));
        System.out.println("Elements2 size : " + elements2.size()); // boş eleman olduğu için hatalı locator
                                                                    // verildiği için locator 0 olucak.

        // findElements locator hatalı ise hata vermez boş list gönderir

        MyFunc.Bekle(3);
        driver.quit();


    }
}
