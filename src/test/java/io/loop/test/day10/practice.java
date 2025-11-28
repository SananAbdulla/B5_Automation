package io.loop.test.day10;

import io.loop.pages.LoopPracticeDragDropPage;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class practice {

    LoopPracticeDragDropPage loopPracticeDragDropPage;
    Actions actions;

    @BeforeMethod
    public void beforeMethod() {
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        actions = new Actions(Driver.getDriver());

    }



    @Test
    public void dragAndDrop() {
        String expected = "blablabala";
        String actual = loopPracticeDragDropPage.bigCircle.getText();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void actions() {
        actions.moveToElement(loopPracticeDragDropPage.bigCircle)
                .clickAndHold()
                .pause(Duration.ofSeconds(5))
                .perform();


    }




    @Test
    public void loopcamp_scroll() {
        Driver.getDriver().get("https://loopcamp.vercel.app/index.html");

        WebElement link = Driver.getDriver().findElement(By.xpath("//a[@href='https://www.loopcamp.io/']"));



        Actions actions = new Actions(Driver.getDriver());

        //actions.moveToElement(link).perform();
       // actions.scrollToElement(link).perform();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true);", link);






    }
}
