package com.Vytrack.testscripts;

import com.Vytrack.Utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class testingTable {




    @Test(description = "testingData", dataProvider = "testData")
    public void test(String url, String title){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        Assert.assertTrue(driver.getTitle().contains(title));

        driver.quit();





    }


    @DataProvider(name = "testData")
     public Object [] [] testData(){
        return new Object [] [] {{"http://etsy.com", "Etsy"},
                                    {"http://google.com", "Google"},
                                    {"http://etsy.com", "Etsy"}
                                                                };
    }

}




