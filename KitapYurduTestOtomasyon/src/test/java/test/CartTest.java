package test;

import com.testinium.driver.BaseTest;
import org.junit.Test;
import page.CartPage;
import page.LoginPage;

public class CartTest extends BaseTest {

    @Test

    public void cart(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();

        CartPage cartPage = new CartPage();
        cartPage.cartP();
    }

}
