package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _08_FindingElements_tag {
    public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));


        int sayac = 0;
        for (WebElement e : links) {
            if (!e.getText().equals("")) {
                System.out.println("a taglerinde texti olanlar : " + e.getText());
                sayac++;
            }
        }

        System.out.println("sayısı : "+ sayac);

        MyFunc.Bekle(4);
        driver.quit();
    }
}
