package org.movoto.selenium.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Mouse;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by haozuo on 3/22/16.
 */
public class SafariTest {

    private String testUrl;
    private WebDriver driver;

    @Before
    public void prepare() {

    	testUrl = "http://www.google.com.au";

        driver = new SafariDriver();
        driver.manage().window().maximize();
        driver.get(testUrl);
    }

    @Test
    public void searchText() throws IOException {

        WebElement Searchbox = driver.findElement(By.name("q"));		
		//Enter the Search text Resmed.com
		Searchbox.sendKeys("ResMed");
		Searchbox.submit();	

    }
    
    @After
    public void teardown() throws IOException {
        driver.quit();
    }

}
