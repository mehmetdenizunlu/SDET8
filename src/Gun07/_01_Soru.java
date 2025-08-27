package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _01_Soru  extends BaseDriver {
    //        Senaryo
//        1- https://www.saucedemo.com/
//        2- login işlemini yapınız.
//        3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//        4- Sonra geri dönün (Back to products e tıklatın)
//        5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//        6- sepete tıklatın
//        7- CheckOut a tıklatın
//        8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//        9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//        Item total e eşit olup olmadığını Assert ile test ediniz.
//
//        Bu soruda tamamen XPATH kullanılacaktır.

    @Test
    public void Test1(){

        /*
        ------------------------Locatorlar : ---------------------------
        Username ://input[@id='user-name']
        Password ://input[@id='password']
        LoginButton : //input[@id='login-button']
        Source labs Backoack : //button[@id='add-to-cart-sauce-labs-backpack']


        */

        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginButton.click();

        MyFunc.Bekle(3);

        WebElement saurceLabsBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        saurceLabsBackpack.click();
        MyFunc.Bekle(3);

        WebElement addToCard1 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCard1.click();
        MyFunc.Bekle(3);

        WebElement backToProducts = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProducts.click();
        MyFunc.Bekle(3);


        WebElement saurceLabsBoltTsort = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        MyFunc.Bekle(3);
        saurceLabsBoltTsort.click();
        MyFunc.Bekle(3);

        WebElement addToCard2 = driver.findElement(By.xpath("//button[@id='add-to-cart']"));
        addToCard2.click();
        MyFunc.Bekle(3);

        WebElement sepetim = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        sepetim.click();
        MyFunc.Bekle(3);


        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();
        MyFunc.Bekle(3);

        WebElement firstName = driver.findElement(By.xpath(" //input[@id='first-name']"));
        firstName.sendKeys("Mehmet Deniz");


        WebElement lastName = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastName.sendKeys("ÜNLÜ");

        WebElement zipCode = driver.findElement(By.xpath("//input[@id='postal-code']"));
        zipCode.sendKeys("1234567");


        WebElement contiuneButton = driver.findElement(By.xpath("//input[@id='continue']"));
        contiuneButton.click();
        MyFunc.Bekle(3);

        List<WebElement> fiyatlarListesi = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        MyFunc.Bekle(3);

        //Alt toplamı bulalım:  item total alınıyor
        WebElement itemtotalElement= driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        String strItemTotal = itemtotalElement.getText().replaceAll("[^0-9,.]","");
        System.out.println(strItemTotal);
        double itemTotal=Double.parseDouble(strItemTotal);


        int ürünlerToplami = 0;
        for (WebElement e : fiyatlarListesi) {
            System.out.println(e.getText()); // 15.99$ olarak string şeklinde.
            String strUrunFiyat = e.getText().replaceAll("[^0-9.,]" , ""); // rakam , . hariç hepsini sil.
            double doubleUrunFiyat = Double.parseDouble(strUrunFiyat);
            ürünlerToplami+=doubleUrunFiyat;
        }

        System.out.println(ürünlerToplami);
        System.out.println(itemTotal);




        BekleKapat();


    }
}
