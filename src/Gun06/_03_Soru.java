package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Soru extends BaseDriver {

// 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
// 2- Business i çekleyin.
// 3- discover XYZ ye tıklatın ve online Advertising i seçin
// 4- Every day i seçin
// 5- Good u seçin
// 6- using XYZ yi tıklatın ve 3.seçeneği seçin
// css selector
// her bir tıklatma vs işlemin arasına MyFunc.Bekle(2);
    // input[type='radio'][value='Business']
    // _4588 biten tıklat   -> [id$='_4588'] > :nth-child(4)
    // input[type='radio'][value='Every Day']
    // input[type='radio'][value='Good']
    // select[id$='_4597']   -> select[id$='_4597'] > :nth-child(4)

    @Test
    public void Test1()
    {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        MyFunc.Bekle(2);

        WebElement business=driver.findElement(By.cssSelector("input[type='radio'][value='Business']"));
        business.click();
        MyFunc.Bekle(2);

        WebElement dropDownDiscover=driver.findElement(By.cssSelector("[id$='_4588']"));
        dropDownDiscover.click();
        MyFunc.Bekle(2);

        WebElement optionOnlineAdvertising=driver.findElement(By.cssSelector("[id$='_4588'] > :nth-child(4)"));
        optionOnlineAdvertising.click();
        MyFunc.Bekle(2);

        WebElement everyDayRadio=driver.findElement(By.cssSelector("input[type='radio'][value='Every Day']"));
        everyDayRadio.click();
        MyFunc.Bekle(2);

        WebElement goodRadio=driver.findElement(By.cssSelector("input[type='radio'][value='Good']"));
        goodRadio.click();
        MyFunc.Bekle(2);

        WebElement dropdownHowLong=driver.findElement(By.cssSelector("[id$='_4597']"));
        dropdownHowLong.click();
        MyFunc.Bekle(2);

        WebElement option3=driver.findElement(By.cssSelector("[id$='_4597']>:nth-child(4)"));
        option3.click();
        goodRadio.click();
        MyFunc.Bekle(2);

        BekleKapat();
    }








}









