package io.loop.test.day06;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class pacts {

     /*
    1. Open Chrome browser
    2. Go to https://demoqa.com/select-menu
    3. Select all the options from multiple select dropdown.
    4. Print out all selected values.
    5. Deselect all values.
     */


    WebDriver driver;


    @BeforeMethod
    public void setupMethod () {
        driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @AfterMethod
    public void tearDownMethod(){

        driver.close();
    }


    @Test
    public void multiSelect(){

        Select dropdown = new Select (driver.findElement(By.xpath("//select[@id = 'cars']")));

        List<WebElement> options = dropdown.getOptions();

        assertTrue(dropdown.isMultiple(), "Dropdown is not multiple");


        for (WebElement option : options) {
            option.click();
            System.out.println(option.getText());

        }

        System.out.println("--------------");

        options.forEach( option -> {
             option.click();
             System.out.println(option.getText());

        });



    }


}
