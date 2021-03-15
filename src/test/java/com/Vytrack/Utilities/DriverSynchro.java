package com.Vytrack.Utilities;

import com.Vytrack.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Optional;

public class DriverSynchro {

    //1-Make constructor private
    private DriverSynchro(){
    }

    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();



    public synchronized static WebDriver getDriverSynchro(String browser){

        if (driverThreadLocal.get()==null){


            switch (browser){
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverThreadLocal.set(new ChromeDriver());
                    //driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverThreadLocal.set(new FirefoxDriver());
                    //driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driverThreadLocal.set( new ChromeDriver(new ChromeOptions().setHeadless(true)));
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driverThreadLocal.set( new FirefoxDriver(new FirefoxOptions().setHeadless(true)));
                    break;

            }
        }

        return driverThreadLocal.get();


    }

    public synchronized static void closeDriver(){
        if (driverThreadLocal.get() != null){
            driverThreadLocal.get().quit();
            driverThreadLocal.remove();
        }
    }


}


