package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @Then("user types username")
    public void user_types_username() {
        loginPage.userName.sendKeys("hr1@cydeo.com");

    }
    @Then("user types password")
    public void user_types_password() {
        loginPage.password.sendKeys("UserUser");
    }
    @Then("user clicks login button")
    public void user_clicks_login_button() {
        loginPage.loginButton.click();
    }
    @Then("Verify if user on the dashboard")
    public void verify_if_user_on_the_dashboard() {
        BrowserUtils.verifyElementDisplayed(loginPage.CRM24);
       // Assert.assertTrue(loginPage.CRM24.isDisplayed());
    }



    /**
     * WEBPAGE USED FOR THIS CODE BELOW IS : https://vytrack.com/
     * Code is commented out becuase we will not use this PAGE
     */

    /*
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }

*/



}
