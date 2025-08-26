package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_Navigating  extends BaseDriver {
    @Test
    public void Test1(){
        driver.navigate().to("https://testpages.eviltester.com/styled/index.html");
        // navigate().to -> get ile aynı, history için kullanılır, ileri - geri için
        MyFunc.Bekle(3);



        WebElement allertLink = driver.findElement(By.xpath("//a[@id='alerttest']"));
        allertLink.click();
        //linke tıklattım yeni sayafaya gittim

        System.out.println("Sayfanın Titlesi : " + driver.getTitle());
        System.out.println("Sayfanın url i : " + driver.getCurrentUrl());
        MyFunc.Bekle(3);


        driver.navigate().back();// back : geri -> Bir önceki sayfaya dön
        System.out.println("Sayfanın Titlesi : " + driver.getTitle());
        System.out.println("Sayfanın url i : " + driver.getCurrentUrl());
        MyFunc.Bekle(3);

        driver.navigate().forward();//forward:ileri ,   bir sonraki sayfaya git.
        System.out.println("Sayfanın Titlesi : " + driver.getTitle());
        System.out.println("Sayfanın url i : " + driver.getCurrentUrl());
        MyFunc.Bekle(3);

        BekleKapat();

    }
}
