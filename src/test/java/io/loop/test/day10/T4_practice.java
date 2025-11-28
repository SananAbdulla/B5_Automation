package io.loop.test.day10;

import io.loop.pages.LoopPracticeDragDropPage;
import io.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T4_practice {


    Actions actions;
    LoopPracticeDragDropPage loopPracticeDragDropPage;


    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get("https://loopcamp.vercel.app/drag-and-drop-circles.html");
        loopPracticeDragDropPage = new LoopPracticeDragDropPage();
        actions = new Actions(Driver.getDriver());
    }

    @Test
    public void drag_small_here_test () {

        String expected = "Drag the small circle here.";
        String actual = loopPracticeDragDropPage.bigCircle.getText();

        Assert.assertEquals(actual, expected, "Does not match");
    }

    @Test
    public void darg_drop() {
      actions.moveToElement(loopPracticeDragDropPage.smallCircle)
              .clickAndHold()
              .moveByOffset(100, 100)
              .pause(3000)
              .perform();



    }
}
