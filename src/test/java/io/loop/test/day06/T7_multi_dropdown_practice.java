package io.loop.test.day06;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class T7_multi_dropdown_practice {


        /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */
        WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){

        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
    }

    @Test
    public void multiSelect () {
        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='cars']")));

        List<WebElement> options = dropdown.getOptions();

//        for (WebElement each : options) {
//            each.click();
//            System.out.println(each.getText());
//        }
//

        options.forEach(each -> {
            each.click();
            System.out.println(each.getText());
        });


    }
}
