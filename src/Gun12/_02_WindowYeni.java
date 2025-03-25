package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.WindowType;

public class _02_WindowYeni extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        driver.switchTo().newWindow(WindowType.TAB); // yeni BOŞ sekme açar.
        //şu anda yeni boş sayfadayım
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        BekleKapat();
    }


}
