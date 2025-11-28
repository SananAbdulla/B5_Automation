package io.loop.test.day08;

import io.loop.test.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.Set;

public class T4_window_titles_practice extends TestBase {


    @Test
    public void windowHandleTitle(){
        driver.get("https://www.google.com");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://qafqazinfo.az/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://musavat.com/");


        Set<String> windowHandles = driver.getWindowHandles();

        for (String window : windowHandles) {
            driver.switchTo().window(window);

            if (driver.getTitle().contains("qafqazinfo")) {
                break;
            }




        }




    }


    public static void switchToWindow(WebDriver driver, String targetTitle){



    }
}
