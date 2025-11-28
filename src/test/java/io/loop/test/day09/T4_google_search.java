package io.loop.test.day09;

import io.loop.test.utilities.ConfigurationReader;
import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.DocuportUtils;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T4_google_search {

    /*
    1. go to "https://www.google.com"
    2. write "Loop Academy" and search
    3. validate title: Loop Academy - Google Search
     */

    @Test
    public void google_search() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperties("google.url"));
        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
        WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("Loop Academy" + Keys.ENTER);
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(actualTitle, "Loop Academy - Google Search");
    }


    @Test
    public void docuport() throws InterruptedException {

        Driver.getDriver().get("https://beta.docuport.app/");
        DocuportUtils.login(Driver.getDriver(), DocuportConstants.ADVISOR);

        WebElement element = Driver.getDriver().findElement(By.xpath("//span[.='My uploads']"));
        element.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Docuport";
        Assert.assertEquals(actualTitle, expectedTitle);

        System.out.println(actualTitle);









    }








//    @Test
//    public void docuport_search() throws InterruptedException {
//        Driver.getDriver().get(ConfigurationReader.getProperties("docuportBETA"));
//        System.out.println("((RemoteWebDriver) Driver.getDriver()).getSessionId() = " + ((RemoteWebDriver) Driver.getDriver()).getSessionId());
//
//        DocuportUtils.login(Driver.getDriver(), DocuportConstants.ADVISOR);
//        WebElement myUploads = Driver.getDriver().findElement(By.xpath("//span[contains(text(),'My uploads')]"));
//        myUploads.click();
 //   }
}
