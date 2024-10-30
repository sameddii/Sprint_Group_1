package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    LoginPage loginPage = new LoginPage();

    @Given("user go to login page")
    public void user_go_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enter {string}")
    public void userEnter(String email) {
        loginPage.userName.sendKeys(email);
    }

    @And("user enter password")
    public void userEnterPassword() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
    }

    @When("user click login button")
    public void userClickLoginButton() {
        loginPage.loginButton.click();
    }


    @Then("user should land on the page")
    public void userShouldLandOnThePage() {
        Assert.assertTrue(loginPage.activity.isDisplayed());
    }

    @When("user enter {string},{string}")
    public void userEnter(String email, String pass) {
        loginPage.userName.sendKeys(email);
        loginPage.password.sendKeys(pass);
    }

    @Then("user should see the message")
    public void userShouldSeeTheMessage() {
        String expectedMessage = "Incorrect login or password";
        String actualMessage = loginPage.errorMessage.getText();

        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Given("the checkbox is enabled")
    public void theCheckboxIsEnabled() {
        Assert.assertTrue(loginPage.rememberCheckbox.isEnabled());
    }

    @Then("user click the checkbox")
    public void userClickTheCheckbox() {
        loginPage.rememberCheckbox.click();
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
