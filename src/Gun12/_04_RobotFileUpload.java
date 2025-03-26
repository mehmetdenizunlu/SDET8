package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;

public class _04_RobotFileUpload extends BaseDriver {

    @Test
    public void Test1() throws AWTException {
        driver.get("https://letcode.in/file");
        MyFunc.Bekle(2);


        Robot rbt=new Robot();

        //6 kere TAB a bas bırak
        for (int i = 0; i < 6; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        MyFunc.Bekle(2);

        //hafızaya kopyalanmış hale getirmem lazım, dosyanın yolunu
        StringSelection dosyaYolu= new StringSelection("C:\\Users\\TechnoStudy\\Desktop\\test.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);
        // ctrl+C, panoya gitti, panoya kopyalandı

        //sonra ctrl+v ile yapıştırcam açılan pencereye
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);  // yapıştır
        rbt.keyRelease(KeyEvent.VK_V);  // tuşlar serbest bırakıldı
        rbt.keyRelease(KeyEvent.VK_CONTROL);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        WebElement dosyaSecildiMesaji=driver.findElement(By.cssSelector("[class='file']+p"));
        Assert.assertTrue("Dosya seçilemedi", dosyaSecildiMesaji.getText().contains("test.txt"));

        MyFunc.Bekle(2);
        BekleKapat();
    }

}
