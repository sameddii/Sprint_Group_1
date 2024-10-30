package com.group_1.pages;

import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;

    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement submit;

    @FindBy(css = "div[class='errortext']")
    public WebElement errorMessage;


    public void login(String userType) {
        String userName = "";
        String password = "";

        switch (userType.toLowerCase()) {
            case "hr":
                userName = ConfigurationReader.getProperty("hr_username");
                password = ConfigurationReader.getProperty("hr_password");
                break;
            case "helpdesk":
                userName = ConfigurationReader.getProperty("helpdesk_username");
                password = ConfigurationReader.getProperty("helpdesk_password");
                break;
            case "marketing":
                userName = ConfigurationReader.getProperty("marketing_username");
                password = ConfigurationReader.getProperty("marketing_password");
                break;
            default:
                System.out.println("Invalid user type");
                break;
        }
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.submit.click();
    }

    public void invalidLogin(String userName, String password) {
        this.userName.sendKeys(userName);
        this.password.sendKeys(password);
        this.submit.click();
    }




}