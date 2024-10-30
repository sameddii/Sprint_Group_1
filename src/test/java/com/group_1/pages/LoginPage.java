package com.group_1.pages;


import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement userName;

    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(xpath="//input[@type ='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='pagetitle']")
    public WebElement activity;

    @FindBy(xpath = "//div[@class='errortext']")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement rememberCheckbox;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotLink;



    /// These locators below are commented out becuase they belong to : https://vytrack.com/
    /*
    @FindBy(id="prependedInput")
    public WebElement userName;

    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;
*/

    /// re-usable method
//    public void login(String userNameStr, String passwordStr) {
//   userName.sendKeys(userNameStr);
//    password.sendKeys(passwordStr);
//        submit.click();
//            // verification that we logged
//}

}