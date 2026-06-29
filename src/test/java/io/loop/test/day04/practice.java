package io.loop.test.day04;

import io.loop.test.utilities.DocuportConstants;
import io.loop.test.utilities.DocuportUtils;
import io.loop.test.utilities.GeneralConstants;
import io.loop.test.utilities.WebDriverUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class practice {

    public static void main(String[] args) throws InterruptedException {

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
        driver.manage().window().maximize();

        driver.get(DocuportConstants.DOCUPORT_TEST);

        WebElement docuportLogo = driver.findElement(By.cssSelector("img[src = '/img/logo.d7557277.svg']"));

        String actualLogoValue =  docuportLogo.getAttribute("alt");

        if (actualLogoValue.equalsIgnoreCase(DocuportConstants.EXPECTED_LOGO_DOCUPORT)) {

            System.out.println("Test passed");
        }

        WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        WebElement loginButton = driver.findElement(By.cssSelector("button[type='submit']"));

        username.sendKeys(DocuportConstants.USERNAME_CLIENT);
        password.sendKeys(DocuportConstants.PASSWORD);
        loginButton.click();

        Thread.sleep(3000);

        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
        continueButton.click();

        Thread.sleep(3000);

        WebElement homeIcon = driver.findElement(By.cssSelector("i.mdi-home"));

        if (homeIcon.isDisplayed() && DocuportUtils.isHomeDashboardDisplayed(driver)) {
            System.out.println("Login validated - home dashboard is displayed");
        } else {
            System.out.println("Login validation failed - home dashboard was not displayed");
        }

        driver.get(DocuportConstants.DOCUPORT_TEST + "/received-docs");
        Thread.sleep(2000);

        DocuportUtils.goToHomeDashboard(driver);
        Thread.sleep(2000);

        if (DocuportUtils.isHomeDashboardDisplayed(driver)) {
            System.out.println("Returned to home dashboard successfully");
        } else {
            System.out.println("Failed to return to home dashboard");
        }

        driver.quit();
    }
}
