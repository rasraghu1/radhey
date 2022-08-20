package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
    public WebDriver driver;
    @BeforeTest
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
    }
    @Test
            public void HomePage(){
        String expTitle= "Amazon.com. Spend less. Smile more.";
        String  actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle, expTitle);
    }
@AfterTest
    public void stopBrowser() {
    driver.close();
}
}
