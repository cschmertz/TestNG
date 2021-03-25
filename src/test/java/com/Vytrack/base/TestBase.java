package com.Vytrack.base;

import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.Utilities.DriverSynchro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;


public abstract class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;
    protected String url;



    @BeforeMethod
    @Parameters("env")
    public void setUpMethod(@Optional String env){


        if(url==null){
            url=ConfigurationReader.getProperty("url");
        }else{
            url=ConfigurationReader.getProperty(env+"_url");
        }

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);

        driver.get(url);

    }

    @AfterMethod
    public void tearDownMethod(){

        driver.quit();

    }



}

