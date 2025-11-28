package io.loop.test.day07;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class practice extends TestBase {


    @Test
    public void leftFrame() {
        driver.get("https://loopcamp.vercel.app/nested-frames.html");
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");

        WebElement leftFrame = driver.findElement(By.xpath("//*[contains(text(), 'LEFT')]"));

        String actual = leftFrame.getText();
        System.out.println(actual);
        String expected = "LEFT";

        Assert.assertEquals(actual, expected, " Does not match");


    }
}
