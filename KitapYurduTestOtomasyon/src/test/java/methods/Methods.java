package methods;

import com.testinium.driver.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Methods {

    WebDriver webDriver;
    FluentWait<WebDriver> wait;

    public Methods() {
        webDriver = BaseTest.webDriver;
        wait = new FluentWait<WebDriver>(webDriver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(300))
                .ignoring(NoSuchElementException.class);
    }

    public WebElement findElement(By by) {

        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void click(By by) {

        findElement(by).click();

    }
    public void sendKeys(By by, String text) {
        findElement(by).sendKeys(text);
    }

    public void scrollWithAction(By by){
        Actions actions = new Actions(webDriver);
        actions.moveToElement(findElement(by)).build().perform();
    }

    public void waitBySeconds(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public void assertions(By by){
        try {
            Assert.assertTrue(isElementVisible(by));
            System.out.println("Geçti");
        } catch (Exception e) {
            System.out.println("Kaldı");
        }

    }

    public Select getSelect(By by){
        return new Select(findElement(by));
    }

    public void selectByTest(By by,String text){
        getSelect(by).selectByVisibleText(text);
    }

    public List<WebElement>  findElements(By by) {

        return webDriver.findElements(by);
    }

    public void selectProduct(By by){
        Random rnd = new Random();
        List<WebElement> products = findElements(by);
        int index = rnd.nextInt(products.size());
        products.get(index).click();
    }

    public void selectProducts(By by,int i){
        Random rnd = new Random(i);
        List<WebElement> favouriteButton = findElements(by);
        int index = rnd.nextInt(favouriteButton.size());
        favouriteButton.get(index).click();
    }

    public void clear(By by) {
        findElement(by).clear();
    }

    public void mouseHover(By by) {
        WebElement element = webDriver.findElement(by);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(element).perform();
    }





}
