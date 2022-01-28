package page;

import methods.Methods;
import org.openqa.selenium.By;

public class PointsCatalog {
    Methods methods;

    public PointsCatalog() {
        methods = new Methods();
    }

    public void pointCatalog() {

        methods.click(By.cssSelector(".lvl1catalog")); //Puan Kataloğuna tiklanir
        methods.waitBySeconds(2);
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']")); // Türk Klasiklerine tiklanir
        methods.waitBySeconds(2);
        methods.selectByTest(By.xpath("//div[@class='sort']/select"),"Yüksek Oylama");  //Yüksek oylama secilir
        methods.waitBySeconds(2);
        methods.click(By.xpath("//span[@class='mn-strong common-sprite' and text()='Tüm Kitaplar']")); // Tüm kitaplar tiklanir
        methods.waitBySeconds(4);
        methods.click(By.xpath("//a[@class='mn-icon icon-angleRight' and text()='Hobi']"));  //Hobi secilir
        methods.waitBySeconds(5);
        methods.selectProduct(By.xpath("//a[@class='pr-img-link']")); //Random ürün secimi yapilir
        methods.waitBySeconds(4);






    }

}
