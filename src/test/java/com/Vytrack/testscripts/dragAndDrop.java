package com.Vytrack.testscripts;

import com.Vytrack.Utilities.BrowserUtils;
import com.Vytrack.Utilities.Driver;
import com.Vytrack.base.Environment;
import com.Vytrack.base.TestBase;
import com.Vytrack.pages.dragAndDropPage;
import org.testng.annotations.Test;

public class dragAndDrop extends TestBase{

    dragAndDropPage dd = new dragAndDropPage();


    @Test
    @Environment(url = "url7")
    public void testDragDrop(){

        BrowserUtils.waitFor(3);
        actions.clickAndHold(dd.boxA).moveToElement(dd.boxB).release(dd.boxB).perform();
        BrowserUtils.waitFor(3);
    }

    @Test
    @Environment(url = "url8")
    public void testDraggable(){

        BrowserUtils.waitFor(3);
        actions.clickAndHold(dd.draggable).moveToElement(dd.droppable).release(dd.droppable).perform();
        BrowserUtils.waitFor(3);
    }
}

