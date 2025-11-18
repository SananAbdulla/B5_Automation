package io.loop.test.day01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://google.com");

    }
}
