package io.loop.pages;

import io.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDynamicLoading1Page {

   public LoopPracticeDynamicLoading1Page() {

       PageFactory.initElements(Driver.getDriver(),this);

   }

   @FindBy(xpath= "//button[.='Start']")
   public WebElement startButton;


    @FindBy(xpath= "//div[.='Loading... ']")
    public WebElement loadingBar;


    @FindBy(xpath= "//button[@type='submit']")
    public WebElement submitButton;

    @FindBy(xpath= "//input[@type='username']")
    public WebElement username;

    @FindBy(xpath= "//input[@type='password']")
    public WebElement password;


    @FindBy(xpath= "//div[@class='alert alert-danger']")
    public WebElement errorMessage;


    @FindBy(xpath= "//a[@href='dynamic_loading/1.html']")
    public WebElement dynamicLoading1;
}
