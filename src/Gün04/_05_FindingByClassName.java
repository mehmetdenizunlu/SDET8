package Gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        // Senaryo:
        // 1-  https://form.jotform.com/252362792450963  sayfasınız açınız
        // 2-  Bütün label ları bulup textlerini yazdırınız

        //form-sub-label className

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/252362792450963");

        WebElement label = driver.findElement(By.className("form-sub-label"));
        System.out.println("Class name label olanlar : " + label.getText()); // birden fazla olduğu halde tekini
        // seçmiş oluruz birden fazlasında işlemm yapmak için aşağıdaki yapıya ihtiyacımız var .

        List<WebElement> labels = driver.findElements(By.className("form-sub-label"));
        System.out.println("kac tane label var : " + labels.size()); // kaç tane locater bulduğunu veriyor

        for (WebElement e : labels) {
            System.out.println("textleri : " + e.getText()); // hepsini gezerek tek tek yazdırıyor
        }

        MyFunc.Bekle(3);
        driver.quit();

    }
}
