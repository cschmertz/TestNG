package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.JQueryUIPage;
import org.testng.annotations.Test;

public class JQueryUI extends TestBase {

    JQueryUIPage jp = new JQueryUIPage();

    @Test
    @Environment(url = "url_11")
    public void testJQueryUI(){
        BrowserUtils.waitFor(2);
        actions.moveToElement(jp.enabled).click().perform();
        BrowserUtils.waitFor(2);
        actions.moveToElement(jp.downloads).click().perform();
        BrowserUtils.waitFor(2);
        actions.moveToElement(jp.pdf).click().perform();
        BrowserUtils.waitFor(2);


        BrowserUtils.isFileDownloaded("/Users/riazahmed/Downloads/","menu.pdf");
    }
}
