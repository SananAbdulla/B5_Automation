package io.loop.test.day08;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class T2_windows_practice extends TestBase {

         /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */


    @Test
    public void window_handle() {
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Assert.assertEquals(driver.getTitle(), "The Internet", "Actual does not match expected");

        System.out.println(driver.getWindowHandle());

        WebElement clickHere = driver.findElement(By.xpath("//*[.='Click Here']"));
        clickHere.click();

        System.out.println(driver.getWindowHandle());

        String originalWindowHandle = driver.getWindowHandle();


        Set<String> windowsHandles = driver.getWindowHandles();

        for ( String each : windowsHandles) {
            driver.switchTo().window(each);
            System.out.println(each);
        }

        driver.switchTo().window(originalWindowHandle);
        System.out.println(driver.getWindowHandle());


    }
}
