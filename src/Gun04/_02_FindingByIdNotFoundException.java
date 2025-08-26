package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        try {
            WebElement email = driver.findElement(By.xpath("hataliLocator"));
            email.sendKeys("Mehmet");
        } catch (Exception e) {
            System.out.println("web element bulunamadı : " + e.getMessage());
        }

        MyFunc.Bekle(5);
        driver.quit();

        //button[@name='login']
    }
}
