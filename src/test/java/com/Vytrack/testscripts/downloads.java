package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.downloadPage;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

public class downloads extends TestBase {

    downloadPage dL= new downloadPage();


    @Test
    @Environment(url = "url_4")
    public void testDownloadFiles(){


        actions.moveToElement(dL.downloadTextFile).click().perform();
        BrowserUtils.waitFor(5);


        BrowserUtils.isFileDownloaded("/Users/riazahmed/Downloads/","textfile.txt");


    }
}
