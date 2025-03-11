package Gun04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_WebElementGetText {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        String elementinGorunenYazisi=labelFirstName.getText();
        // getText() -> WebElemntin ekranda gözüken yazısını verir
        System.out.println("elementinGorunenYazisi = " + elementinGorunenYazisi);

        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }
}
