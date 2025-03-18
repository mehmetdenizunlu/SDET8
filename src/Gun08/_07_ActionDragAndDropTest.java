package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void test1() {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        MyFunc.Bekle(2);
        Actions driverAksiyon = new Actions(driver);

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));

        //1.yöntem
        driverAksiyon.clickAndHold(oslo).build().perform(); // osloyu eline al
        driverAksiyon.moveToElement(norway).release().build().perform(); // norway e bırak

        //2.Yöntem
        //driverAksiyon.dragAndDrop(oslo,norway).build().perform();

        BekleKapat();
    }

}
