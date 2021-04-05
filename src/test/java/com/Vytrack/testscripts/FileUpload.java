package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.fileUploadPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUpload extends TestBase{

    fileUploadPage fu = new fileUploadPage();



  @Test
  @Environment(url = "url1")
  public void fileUploadTest(){


      BrowserUtils.waitForClickablility(fu.chooseFileButton,10);
      BrowserUtils.waitFor(5);
      actions.moveToElement(fu.chooseFileButton);
      fu.chooseFileButton.sendKeys(fileUploadPage.file);

      BrowserUtils.waitForClickablility(fu.chooseFileButton,10);
      BrowserUtils.waitFor(5);
      actions.moveToElement(fu.uploadButton).click().perform();


      BrowserUtils.waitFor(5);
      Assert.assertTrue(fu.Validation.isDisplayed());








  }





}
