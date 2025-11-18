package io.loop.test.day02;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        // Setting up the driver
        WebDriver driver = new ChromeDriver(options);

        // navigates to the website
        //driver.navigate().to("https://google.com");
        // wait for
        Thread.sleep(3000);

        // maximize the window
        //driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // navigate back
        driver.navigate().back();

        // navigate forward
        driver.navigate().forward();

        // refresh
        driver.navigate().refresh();

        // quiting the browser
        driver.quit();










    }
}
