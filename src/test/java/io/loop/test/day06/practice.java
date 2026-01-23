package io.loop.test.day06;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class practice {

//    WebDriver driver;
//    String actual;
//    String expected;
//
//
//    @BeforeMethod
//    public void setUpMethod(){
//        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void googleTitle() {
//      driver.get("https://www.google.com/");
//
//      System.out.println("((RemoteWebDriver) driver ).getSessionId() = " + ((RemoteWebDriver) driver).getSessionId());
//
//      expected = "Google";
//      actual = driver.getTitle();
//      assertEquals(actual, expected, "Actual does not match expected title");
//
//


//    }


     WebDriver driver;
     String expected;
     String actual;


     @BeforeMethod
     public void setUpMethod(){
         driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
         driver.manage().window().maximize();
     }

    @Test
     public void googleTitle () {
       driver.get("https://google.com");
        System.out.println("((RemoteWebDriver) driver).getCapabilities() = " + ((RemoteWebDriver) driver).getCapabilities());
        actual = driver.getTitle();
       expected = "Google";

       assertEquals(actual, expected, "Actual " + actual + "does not match " + expected);
     }

}
