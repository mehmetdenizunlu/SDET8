package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimLink = driver.findElement(By.linkText("Siparişlerim"));
        System.out.println("siparişlerim getText() : " + siparislerimLink.getText());

        WebElement süperFiyatLink = driver.findElement(By.linkText("Süper Fiyat, Süper Teklif")) ;
        System.out.println("süperFiyatLink.getText() : " +süperFiyatLink.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }
}
