package com.Vytrack.Utilities;

import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.lang.annotation.Annotation;

public class Driver {

    //1-Make constructor private
    private Driver(){
    }

    private static WebDriver driver;


    public static WebDriver getDriver(){


        if (driver == null){

             String browser = "browser";


            switch (ConfigurationReader.getProperty(browser)){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;

            }
        }

        return driver;

    }

    public static void closeDriver(){
        if (driver != null){
            driver.quit();
            driver=null;
        }
    }



}
