package io.loop.test.day05;

import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pactice {
    public static void main(String[] args) {

        // T1_css_isDisplayed

         /*
    https://the-internet.herokuapp.com/forgot_password
     */

        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.navigate().to(GeneralConstants.HEROKUAPP_URL);

        WebElement forgotPassword = driver.findElement(By.xpath("//div[@class = 'example']/h2"));
        System.out.println(forgotPassword.getText());

        System.out.println(forgotPassword.isDisplayed());

        if (forgotPassword.isDisplayed()) {
            System.out.println("Forgot Password Displayed" + "===> TEST PASSED");
        }
        else {
            System.out.println("Test fails");
        }


        ///  T2_xpath_getText


    }
}
