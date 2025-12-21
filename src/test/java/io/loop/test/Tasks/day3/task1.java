package io.loop.test.Tasks.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class task1 {
    public static void main(String[] args) {
        /*
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Click to Gmail from top right.
        4- Validate title contains:
        Expected: Gmail
        5- Go back to Google by using the .back();
        6- Validate title equals:
       Expected: Google
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1- Open Chrome and go to Google
        driver.get("https://www.google.com");

        // 2- Click Gmail from top right
        driver.findElement(By.linkText("Gmail")).click();

        // 3- Validate title contains "Gmail"
        String gmailTitle = driver.getTitle();
        if (gmailTitle.contains("Gmail")) {
            System.out.println("PASS: Title contains 'Gmail'");
        } else {
            System.out.println("FAIL: Title does not contain 'Gmail'");
        }

        // 4- Go back to Google
        driver.navigate().back();

        // 5- Validate title equals "Google"
        String googleTitle = driver.getTitle();
        if (googleTitle.equals("Google")) {
            System.out.println("PASS: Title equals 'Google'");
        } else {
            System.out.println("FAIL: Title is NOT 'Google'");
        }

        driver.quit();


    }
}
