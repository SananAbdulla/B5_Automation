package io.loop.test.day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class GoogleSearch {
    public static void main(String[] args) {



        /*
         * Navigate to Google search
         * maximize the page
         * get title of the page
         * get url of the page
         * validate the title, expected title is "Google"
         * validate the url of the page, expected url is "https://www.google.com/"
         * close the browser
         */


//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--starts-maximized");
//
//        WebDriver driver  = new ChromeDriver(options);
//        driver.get("https://www.google.com");
//        String titleOfDriver = driver.getTitle();
//        String currentUrl = driver.getCurrentUrl();
//
//        String expectedUrl = "https://www.google.com";
//        String expectedTitle = "Google";
//        System.out.println("The title of driver is: " + titleOfDriver);
//        System.out.println("The current url is: " + currentUrl);
//
//        if (titleOfDriver.equals(expectedTitle)) {
//
//             if   (expectedTitle.equals(currentUrl))  {
//
//            }
//            System.out.println("The title and URL are matching");
//
//        }


        // Second option

        // in selenium 3 we had to set up the driver, for that we need webdrivermanager libraries
        // WebDriverManager.chromedriver().setup();

        // create the driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google
        // driver.get()
        driver.navigate().to("https://www.google.com");

        // maximize
        driver.manage().window().maximize();

        // expected
        String expectedTitle = "Google";

        // actual title
        String actualTitle = driver.getTitle();

        // validation
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: " + actualTitle + ", matches expected title: " + expectedTitle + ". => TEST PASS");
        } else {
            System.err.println("Actual title: " + actualTitle + ", DOES NOT match expected title: " + expectedTitle + ". => TEST FAIL");
        }

        // expected URL
        String  expectedURL = "https://www.google.com/";

        // actual URL
        String actualURL = driver.getCurrentUrl();

        if(actualURL.contains(expectedURL)){
            System.out.println("Actual url: " + actualURL + ", matches expected URL: " + expectedURL + ". => TEST PASS");
        } else {
            System.err.println("Actual url: " + actualURL + ", DOES NOT match expected URL: " + expectedURL + ". => TEST FAIL");
        }

        driver.quit();

        Assert.assertEquals(actualURL, expectedURL, "It does not matches");




    }
}
