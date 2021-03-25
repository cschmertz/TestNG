package com.Vytrack.pages;

import com.Vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkBoxesPage {

    public checkBoxesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "form[id='checkboxes']")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]")
    public WebElement checkBoxOption1;

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]")
    public WebElement checkBoxOption2;


}
