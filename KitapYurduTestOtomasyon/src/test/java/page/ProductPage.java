package page;

import methods.Methods;
import org.openqa.selenium.By;
public class ProductPage {

    Methods methods;

    public ProductPage() {
        methods = new Methods();
    }
    public void search() {


        methods.click(By.cssSelector(".menu.top.my-list"));
        methods.waitBySeconds(4);
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/favorite&selected_tags=0']"));
        methods.waitBySeconds(4);
        methods.click(By.cssSelector(".sprite.display-item"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("div[class='product-list']>:nth-child(3)>:nth-child(2)>:nth-child(4)>:nth-child(3)"));
        methods.waitBySeconds(4);

    }


}
