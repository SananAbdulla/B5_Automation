package io.loop.test.day04;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class practice {

    public static void main(String[] args) {

 /*
    go to docuport app
    identify docuport with css
    get value of the attribute
    validate if it is "Docuport"

    the rest is home work
    locate:
    username
    password
    login
        with css
    login to docuport
    locate home icon of docuport after login or any other element after login
    validated that you logged in

     */


        WebDriver driver = WebDriverUtil.getDriver(GeneralConstants.CHROME);

        driver.get(DocuportConstants.DOCUPORT_TEST);

        WebElement docuportLogo = driver.findElement(By.cssSelector("img[src = '/img/logo.d7557277.svg']"));

        String actualLogoValue =  docuportLogo.getAttribute("alt");

        if (actualLogoValue.equalsIgnoreCase(DocuportConstants.EXPECTED_LOGO_DOCUPORT)) {

            System.out.println("Test passed");
        }




    }
}
