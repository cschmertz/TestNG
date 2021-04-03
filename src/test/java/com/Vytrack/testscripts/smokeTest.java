package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.Utilities.DriverSynchro;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fleetPage;
import com.Vytrack.pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class smokeTest {

    loginPage login = new loginPage();
    fleetPage fp = new fleetPage();
    Actions actions;
    WebDriver driver;

    @BeforeTest(alwaysRun = true)
    public void testSetUp(){

        driver = Driver.getDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("http://qa2.vytrack.com");
    }

    @AfterTest(alwaysRun = true)
    public void testTearDown(){
        driver.quit();
    }

    @Test(priority = 1)
    public void testVehiclePageInfo()  {

        actions = new Actions(driver);
        driver.get("http://qa2.vytrack.com");
        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);


        BrowserUtils.waitForVisibility(fp.fleetTab,10);
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


    }

    @Test(priority = 0)
    public void vehicleCostPage(){
        actions = new Actions(driver);
        driver.get(ConfigurationReader.getProperty("url"));
        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitForVisibility(fp.fleetTab,10);
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


    }

    @Test(priority = 2)
    public void testGridReset() {
        actions = new Actions(driver);
        BrowserUtils.waitFor(5);
        driver.get(ConfigurationReader.getProperty("url"));
        String username = ConfigurationReader.getProperty("username1");
        String password = ConfigurationReader.getProperty("password");
        login.login(username,password);

        BrowserUtils.waitForVisibility(fp.fleetTab,10);
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


    }




}
