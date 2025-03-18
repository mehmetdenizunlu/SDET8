package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionRightClickTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("https://demoqa.com/buttons");
        MyFunc.Bekle(2);

        WebElement rightClickBtn=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        Actions aksiyonDriver=new Actions(driver);
        Action aksyion=aksiyonDriver.moveToElement(rightClickBtn).contextClick().build();
        aksyion.perform();

        //new Actions(driver).contextClick(rightClickBtn).build().perform();

        BekleKapat();
    }


}
