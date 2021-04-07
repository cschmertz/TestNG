package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import org.testng.annotations.Test;

public class infiniteScroll extends TestBase {

    @Test
    @Environment(url = "url_9")
    public void testScroll(){
        boolean x = true;

        BrowserUtils.waitFor(2);

        while(x){
            BrowserUtils.executeJScommand("window.scrollBy(0,22000)");
        }

        BrowserUtils.waitFor(2);
    }
}
