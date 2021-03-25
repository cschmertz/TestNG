package com.Vytrack.pages;

import com.Vytrack.Utilities.ConfigurationReader;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.TestBase;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fileUploadPage {


    public static String file = ConfigurationReader.getProperty("file");


    public fileUploadPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[id='file-upload']")
    public WebElement chooseFileButton;

    @FindBy(css = "input[class='button']")
    public WebElement uploadButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div/h3")
    public WebElement Validation;



}
