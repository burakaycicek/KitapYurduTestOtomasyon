package test;

import com.testinium.driver.BaseTest;
import methods.Methods;
import org.junit.Test;
import page.FavouritePage;
import page.LoginPage;

public class FavouriteTest extends BaseTest {

    @Test

    public void favourite(){

        LoginPage loginPage = new LoginPage();
        loginPage.login();

        FavouritePage favouritePage = new FavouritePage();
        favouritePage.favouriteAdd();

    }

}
