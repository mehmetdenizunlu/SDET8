package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_DragAndDropBy extends BaseDriver {

    @Test
    public void test1(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        MyFunc.Bekle(2);

        List<WebElement> consentButton=driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consentButton.size() > 0)  // bu element var ise ekranda
            consentButton.get(0).click();

        WebElement solSurgu=driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));

        new Actions(driver).dragAndDropBy(solSurgu, 100, 0).build().perform();
        // yatay yönde 100 ileri, dikey yönde 0 hareket

       BekleKapat();
    }

}
