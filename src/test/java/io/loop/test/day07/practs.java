package io.loop.test.day07;

import io.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class practs extends TestBase {


     /*
    1- Open a chrome browser
    2- Go to: https://loopcamp.vercel.app/iframe.html
    3- Clear text from comment body
    4- Type "Loop Academy" in comment body
    5- Verify "Loop Academy" text is written in comment body
    6- Verify header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
     */


    @Test
    public void testFrame () {
        driver.get("https://loopcamp.vercel.app/iframe.html");

        driver.switchTo().frame(0);

        WebElement frameTextArea = driver.findElement(By.xpath("//body[@id = 'tinymce']"));

        frameTextArea.clear();
        frameTextArea.sendKeys("Sanan ABD");

        assertEquals(frameTextArea.getText(), "Sanan ABD",  "Does not match");



    }
}
