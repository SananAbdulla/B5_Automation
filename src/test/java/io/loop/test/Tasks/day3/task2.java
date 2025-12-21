package io.loop.test.Tasks.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class task2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1- Go to Temu
        driver.get("https://www.temu.com/");

        // 2- Search for "wooden spoon"
        driver.findElement(By.id("searchInput"))
                .sendKeys("wooden spoon" + Keys.ENTER);

        // 3- Validate title equals "Temu"
        String title = driver.getTitle();
        if (title.equals("Temu")) {
            System.out.println("PASS: Title is 'Temu'");
        } else {
            System.out.println("FAIL: Title is not 'Temu'");
        }

        driver.quit();

    }
}

