package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.interactions.Actions;

public class _08_Soru extends BaseDriver {

//    https://www.hepsiburada.com.tr/ sayfasına gidiniz.
//    Moda -> Pantolon  click
//    tıklatma işleminden sonra URL de
//    pantolon kelimesinin geçtiğini doğrulayın.
//    Yukarıdaki aksyonlar için Actions sınıfını kullanınız

    @Test
    public void Test1() {
        driver.get("https://www.hepsiburada.com.tr/");
        MyFunc.Bekle(2);
        Actions aksiyonlar = new Actions(driver);





        BekleKapat();
    }


}
