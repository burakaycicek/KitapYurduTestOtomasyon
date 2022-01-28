package test;

import com.testinium.driver.BaseTest;
import org.junit.Test;
import page.*;

public class MainTest extends BaseTest {

    @Test
    public void MainTest(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();
        FavouritePage favouritePage = new FavouritePage();
        favouritePage.favouriteAdd();
        PointsCatalog pointsCatalog = new PointsCatalog();
        pointsCatalog.pointCatalog();
        ProductPage productPage = new ProductPage();
        productPage.search();
        CartPage cartPage = new CartPage();
        cartPage.cartP();
    }


}
