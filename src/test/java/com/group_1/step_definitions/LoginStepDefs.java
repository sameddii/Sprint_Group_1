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

import static org.junit.Assert.assertEquals;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @Given("the user logs in as {string}")
    public void the_user_logs_in_as(String userType) {
        loginPage.login(userType);
    }

    @Then("the user should land on the home page and the {string} should be displayed")
    public void the_user_should_land_on_the_home_page_and_the_should_be_displayed(String expectedTitle) {
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);
    }


    //Login with valid username and invalid password
    @When("the user enters a valid {string} and an invalid {string}")
    public void the_user_enters_a_valid_and_an_invalid(String username, String password) {
        String userName = "";

        switch (username) {
            case "hrUser":
                userName = ConfigurationReader.getProperty("hr_username");
                break;
            case "helpdeskUser":
                userName = ConfigurationReader.getProperty("helpdesk_username");
                break;
            case "marketingUser":
                userName = ConfigurationReader.getProperty("marketing_username");
                break;
            default:
                System.out.println("Invalid user type");
                break;
        }

        loginPage.invalidLogin(userName, password);
    }

    @Then("the {string} should be displayed")
    public void the_should_be_displayed(String expectedErrorMessage) {
        String actualErrorMessage = loginPage.errorMessage.getText();
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    //Login with invalid username and valid password
    @When("the user enters an invalid {string} and a valid {string}")
    public void the_user_enters_an_invalid_and_a_valid(String username, String Password) {
        String password = "";

        switch (Password) {
            case "hrUser":
                password = ConfigurationReader.getProperty("hr88@cydeo.com");
                break;
            case "helpdeskUser":
                password = ConfigurationReader.getProperty("helpdesk_password");
                break;
            case "marketingUser":
                password = ConfigurationReader.getProperty("marketing_password");
                break;
            default:
                System.out.println("Invalid user type");
                break;
        }

        loginPage.invalidLogin(username, password);
    }

    //Login attempt with empty credentials
    @When("the user logs in with missing {string} and_or {string} fields")
    public void the_user_logs_in_with_missing_and_or_fields(String username,String password) {

        if (password.isEmpty()) {
            username = ConfigurationReader.getProperty("hr_username");
            loginPage.invalidLogin(username, password);
        }
        if (username.isEmpty()) {
            password = ConfigurationReader.getProperty("helpdesk_password");
            loginPage.invalidLogin(username, password);
        } else {
            loginPage.invalidLogin(username, password);
        }
    }

    //Verify "Remember me" option is visible and clickable
    @Then("the {string} text should be visible")
    public void the_text_should_be_visible(String string) {

    }

    @When("the user clicks the Remember me checkbox")
    public void the_user_clicks_the_remember_me_checkbox() {

    }

    @Then("the Remember me checkbox should be selected")
    public void the_remember_me_checkbox_should_be_selected() {

    }

    //Verify password is hidden by default
    @When("the user enters a password")
    public void the_user_enters_a_password() {

    }
    @Then("the password should be masked with bullets by default")
    public void the_password_should_be_masked_with_bullets_by_default() {

    }


}
