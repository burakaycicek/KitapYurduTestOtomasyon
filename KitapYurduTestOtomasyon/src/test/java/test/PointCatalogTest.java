package test;

import com.testinium.driver.BaseTest;
import org.junit.Test;
import page.LoginPage;
import page.PointsCatalog;

public class PointCatalogTest extends BaseTest {

    @Test

    public void pointCatalog(){
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        PointsCatalog pointsCatalog = new PointsCatalog();
        pointsCatalog.pointCatalog();

    }



}
