package com.testinium.driver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import page.FavouritePage;
import page.LoginPage;

public class BaseTest {

    public static WebDriver webDriver;




    @Before
    public void setUp(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications","disable-popup-blocking","disable-extensions");

        webDriver = new ChromeDriver(chromeOptions);
        webDriver.manage().window().maximize();

        webDriver.get("https://www.kitapyurdu.com/");

    }

    @After
    public void tearDown(){
        if(webDriver != null){
            webDriver.quit();
        }
    }
}
