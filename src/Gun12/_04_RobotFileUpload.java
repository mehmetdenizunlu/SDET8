package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class _04_RobotFileUpload extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");
        MyFunc.Bekle(2);

        Robot rbt=new Robot();

        //6 kere TAB a bas bırak
        for (int i = 0; i < 6; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


        BekleKapat();
    }

}
