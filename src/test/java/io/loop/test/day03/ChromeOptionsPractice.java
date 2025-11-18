package io.loop.test.day03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsPractice {

    public static void main(String[] args) {

        // create an object of chrome options
        ChromeOptions options = new ChromeOptions();

        // add arguments to that options
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        System.out.println("Website name is: "+ driver.getTitle());

    }

}
