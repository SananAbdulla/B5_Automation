package io.loop.test.day06;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class practice {

    WebDriver driver;
    String actual;
    String expected;


 @BeforeMethod
    public  void setUpMethod (){
     driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
     driver.manage().window().maximize();


 }
   @Test
   public void GoogleSearch() {
     driver.get("https://www.google.com/");
     expected = "Google";
     actual = driver.getTitle();
     Assert.assertEquals(actual, expected);

       System.out.println("practice.GoogleSearch" + ((RemoteWebDriver) driver).getSessionId());

 }



}
