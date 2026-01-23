package io.loop.test.day05;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pract {
    public static void main(String[] args) {


        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);
        driver.manage().window().maximize();

        driver.get(GeneralConstants.HEROKUAPP_URL);


        WebElement element = driver.findElement(By.xpath("//div[@class = 'example']/h2"));

        System.out.println("element.isDisplayed() = " + element.isDisplayed());


        if (element.isDisplayed()) {
            System.out.println("element.isDisplayed() = true");
        }
        else {
            System.out.println("element.isDisplayed() = false");
        }
    }
}
