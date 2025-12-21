package io.loop.test.day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NavigateToAmazon {
    public static void main (String [] args ) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(options);

        //driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



    }
}
