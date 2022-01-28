package test;

import com.testinium.driver.BaseTest;
import org.junit.Test;
import page.LoginPage;
import page.ProductPage;

public class ProductTest extends BaseTest {

    @Test
    public void productTest(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        ProductPage productPage = new ProductPage();
        productPage.search();
    }

}
