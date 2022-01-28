package page;

import methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class FavouritePage {

    Methods methods;

    public FavouritePage(){
        methods= new Methods();
    }

    public void favouriteAdd(){
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".common-sprite.button-search"));     //arama butonuna basilir
        methods.waitBySeconds(2);
        methods.scrollWithAction(By.cssSelector("div[class='product-list']>:nth-child(7)"));   //7. ürüne scroll yaptirilir
        methods.waitBySeconds(3);
        try {  //Random 4 ürün favorilere eklenir
            for (int i=0;i<4;i++){
                methods.selectProducts(By.xpath("//div[@id='product-table']/div//i[@class='fa fa-heart']"),i);
                methods.waitBySeconds(3);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        methods.waitBySeconds(3);
        methods.assertions((By.cssSelector(".swal2-success-ring")));    // favorilere eklendi kontrolü yapilir
        methods.waitBySeconds(4);
        methods.click(By.xpath("//div[@class='logo-text']"));        //ana sayfaya dönülür
        methods.waitBySeconds(4);
    }


}
