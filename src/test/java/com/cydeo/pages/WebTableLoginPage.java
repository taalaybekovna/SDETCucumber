package com.cydeo.pages;

import com.cydeo.step_definitions.WebTableLoginStepdefs;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//input[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBtn;


    public void login(){                                //this is another way to login
        username.sendKeys("Test");
        password.sendKeys("Tester");
        loginBtn.click();
    }

    public void login(String user_name, String passWord){       //next variant the way to login
        username.sendKeys(user_name);
        password.sendKeys(passWord);
        loginBtn.click();

    }
}
