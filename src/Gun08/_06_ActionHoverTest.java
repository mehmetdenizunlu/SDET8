package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionHoverTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://www.hepsiburada.com/");
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//*[text()='Moda']"));

        Actions aksiyonDriver=new Actions(driver);
        Action aksiyon=aksiyonDriver.moveToElement(element).build();
        aksiyon.perform();

        //new Actions(driver).moveToElement(element).build().perform();

        BekleKapat();
    }


}
