package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.contextMenuPage;
import org.testng.annotations.Test;

public class contextMenu extends TestBase{

   contextMenuPage cm = new contextMenuPage();


    @Test
    @Environment(url = "url5")
    public void testContextMenu(){


        BrowserUtils.waitForClickablility(cm.hotSpot,10);
        actions.contextClick(cm.hotSpot).perform();
    }
}
