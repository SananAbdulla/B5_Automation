package io.loop.test.day10;

import io.loop.pages.LoopPracticeDynamicLoading7Page;
import io.loop.test.utilities.BrowserUtils;
import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class T6_explicit_wait {


    /*
        go to https://loopcamp.vercel.app/dynamic_loading/7.html
        Wait until title is "Dynamic title"
        Assert: Message "Done!" is displayes
        Assert: Image is displayed

     */


    LoopPracticeDynamicLoading7Page loopPracticeDynamicLoading7Page;
    WebDriverWait wait;

   @BeforeMethod
   public void setUpMethod () {
       loopPracticeDynamicLoading7Page = new LoopPracticeDynamicLoading7Page();
       Driver.getDriver().get(ConfigurationReader.getProperties("loop.practice"));
   }

   @AfterMethod
   public void tearDownMethod() {
      Driver.getDriver().quit();
   }

   @Test
   public void explicit_wait_test() {
       BrowserUtils.loopLinkClick("Dynamic Loading");
//       BrowserUtils.waitForClickable(loopPracticeDynamicLoading7Page.getDynamicLoading7, 10).clear();
       loopPracticeDynamicLoading7Page.getDynamicLoading7.click();
       wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
       wait.until(ExpectedConditions.titleIs("Dynamic title"));
       assertTrue(loopPracticeDynamicLoading7Page.doneMessage.isDisplayed(), "Done message is not displayed");
       assertTrue(loopPracticeDynamicLoading7Page.image.isDisplayed(), "Image is not displayed");


   }


}
