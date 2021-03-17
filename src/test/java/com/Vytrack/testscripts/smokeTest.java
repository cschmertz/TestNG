package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.DriverSynchro;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class smokeTest {

    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();

    String url = ConfigurationReader.getProperty("url");
    Actions actions;



    @Test
    public void testVehiclePageInfo()  {
        WebDriver driver = DriverSynchro.getDriverSynchro("chrome");
        actions = new Actions(driver);
        driver.get(url);


        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitFor(2);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleBtn).click().perform();
        BrowserUtils.waitFor(2);

        WebElement table = driver.findElement(By.xpath("//table"));

        List<WebElement> rowData = table.findElements(By.tagName("tr"));

        for(WebElement row : rowData){
            List<WebElement> cellData = row.findElements(By.tagName("td"));

            for(WebElement cell : cellData){
                System.out.println(cell.getText());
            }
        }

        Assert.assertFalse(rowData.isEmpty(),"List is Empty");

        BrowserUtils.waitFor(3);

        driver.close();













    }

    @Test
    public void vehicleCostPage(){

        WebDriver driver = DriverSynchro.getDriverSynchro("firefox");
        actions = new Actions(driver);
        driver.get(url);


        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitFor(2);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleCostBtn).click().perform();
        BrowserUtils.waitFor(2);

        WebElement table = driver.findElement(By.xpath("//table"));

        List<WebElement> rowData = table.findElements(By.tagName("tr"));

        for(WebElement row : rowData){
            List<WebElement> cellData = row.findElements(By.tagName("td"));

            for(WebElement cell : cellData){
                System.out.println(cell.getText());
            }
        }

        Assert.assertFalse(rowData.isEmpty(),"List is Empty");

        BrowserUtils.waitFor(3);

        driver.close();



    }

    @Test
    public void testGridReset() {

        WebDriver driver = DriverSynchro.getDriverSynchro("chrome-headless");
        actions = new Actions(driver);
        driver.get(url);



        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitFor(2);
        actions.moveToElement(fp.fleetTab).pause(2).moveToElement(fp.vehicleBtn).click().perform();
        BrowserUtils.waitFor(2);


        actions.moveToElement(fp.gridButton).click().perform();

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.idButton).click().perform();

        BrowserUtils.waitFor(2);

        Assert.assertTrue(fp.idCheckBox.isSelected(),"Id is selected");

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.closeButton).click().perform();

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.resetButton).click().perform();

        BrowserUtils.waitFor(2);

        actions.moveToElement(fp.gridButton).click().perform();

        BrowserUtils.waitFor(2);

        Assert.assertFalse(fp.idCheckBox.isSelected(),"Id is deselected");

        BrowserUtils.waitFor(3);

        driver.close();






    }

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
