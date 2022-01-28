package page;

import methods.Methods;
import org.openqa.selenium.By;

public class CartPage {
    Methods methods;
    public CartPage(){

        methods = new Methods();
    }

    public void cartP(){
        methods.click(By.id("sprite-cart-icon"));          //sepetime tiklanir
        methods.waitBySeconds(4);
        methods.click(By.id("js-cart"));         // sepete gidilir
        methods.waitBySeconds(3);
        methods.clear(By.xpath("//input[@style='width:22px']"));  // ürün adedindeki 1 rakamı silinir
        methods.waitBySeconds(3);
        methods.sendKeys(By.xpath("//input[@style='width:22px']"),"2"); //ürün adedi 2 yapilir
        methods.waitBySeconds(5);
        methods.click(By.cssSelector(".fa.fa-refresh.green-icon"));  // güncelle iconuna basilir
        methods.waitBySeconds(5);
        methods.click(By.cssSelector("div[class='right']"));    // sepete git butonuna basilir
        methods.waitBySeconds(6);
        methods.sendKeys(By.cssSelector("input[id='address-firstname-companyname']"),"Burak"); //isim girilir
        methods.waitBySeconds(4);
        methods.sendKeys(By.cssSelector("input[id='address-lastname-title']"),"Ayçiçek"); //soyisim girilir
        methods.waitBySeconds(4);
        methods.selectByTest(By.cssSelector("select[id='address-country-id']"),"Türkiye"); // Ülke  secilir
        methods.waitBySeconds(4);
        methods.selectByTest(By.cssSelector("select[id='address-zone-id']"),"İstanbul");  //İl secilir
        methods.waitBySeconds(4);
        methods.selectByTest(By.cssSelector("select[id='address-county-id']"),"ATAŞEHİR"); // İlçe secilir
        methods.waitBySeconds(4);
        methods.sendKeys(By.cssSelector("input[id='district']"),"İÇERENKÖY MAH"); //Mahalle adı yazılır
        methods.waitBySeconds(4);
        methods.click(By.id("districtautocomplete-list"));   //Mahalle secilir
        methods.waitBySeconds(3);
        methods.sendKeys(By.cssSelector("textarea[id='address-address-text']"),"Umut Sokak Testinium Sitesi No:7"); //Adres girilir
        methods.waitBySeconds(4);
        methods.sendKeys(By.cssSelector("input[id='address-postcode']"),"34000"); //Posta Kodu girilir
        methods.waitBySeconds(4);
        methods.sendKeys(By.cssSelector("input[id='address-telephone']"),"2121234567"); // Sabit telefon numarası girilir
        methods.waitBySeconds(4);
        methods.sendKeys(By.cssSelector("input[id='address-mobile-telephone']"),"5351234567");  //Cep numarasi girilir
        methods.waitBySeconds(4);
        methods.click(By.cssSelector("button[id='button-checkout-continue']")); //Devam butonuna basilir
        methods.waitBySeconds(4);
        methods.click(By.cssSelector("button[id='button-checkout-continue']")); //Devam butonuna basilir
        methods.waitBySeconds(4);
        methods.waitBySeconds(4);
        methods.sendKeys(By.xpath("//input[@id='credit-card-owner']"),"Burak Test");
        methods.waitBySeconds(4);
        methods.sendKeys(By.xpath("//input[@name='credit_card_number_1']"),"4664");
        methods.waitBySeconds(4);
        methods.sendKeys(By.xpath("//input[@name='credit_card_number_2']"),"2342");
        methods.waitBySeconds(4);
        methods.sendKeys(By.xpath("//input[@name='credit_card_number_3']"),"5433");
        methods.waitBySeconds(4);
        methods.sendKeys(By.xpath("//input[@name='credit_card_number_4']"),"2342");
        methods.waitBySeconds(4);
        methods.selectByTest(By.id("credit-card-expire-date-month"),"01");
        methods.waitBySeconds(4);
        methods.selectByTest(By.id("credit-card-expire-date-year"),"2027");
        methods.waitBySeconds(4);
        methods.sendKeys(By.id("credit-card-security-code"),"123");
        methods.waitBySeconds(4);
        methods.click(By.cssSelector("button[id='button-checkout-continue']")); // Devam butonuna basilir
        methods.waitBySeconds(4);
        methods.assertions(By.xpath("//span[@class='error' and text()='Kart numarası geçersiz. Kontrol ediniz!']")); // Hata mesajı kontrol edilir
        methods.waitBySeconds(4);
        methods.click(By.xpath("//div[@class='logo-text']"));
        methods.waitBySeconds(4);
        methods.mouseHover(By.cssSelector(".login.menu.top"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".login ul li:nth-of-type(4)"));
        methods.waitBySeconds(4);


    }

}
