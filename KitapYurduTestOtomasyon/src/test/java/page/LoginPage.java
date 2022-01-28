package page;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage  {

    Methods methods;

    public LoginPage(){
        methods= new Methods();
    }

    public void login(){
        methods.click(By.cssSelector(".menu-top-button.login"));     //login islemi yapilir
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-email"), "buraktest2@outlook.com");
        methods.waitBySeconds(3);
        methods.sendKeys(By.id("login-password"), "555654654555b");
        methods.waitBySeconds(3);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(10);
        methods.assertions(By.xpath("//h1[@class='section' and text()='Hesabım']"));  //Login Kontrol
        methods.waitBySeconds(2);









    }


}
