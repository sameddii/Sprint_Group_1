package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Services_StepDefs {

    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();

    @Given("{string} user is logged in and launched on the home page")
    public void userIsLoggedInAndLaunchedOnTheHomePage(String userType) {
        driver.get(ConfigurationReader.getProperty("url"));
        loginPage.login(userType);
    }

    @When("user navigates to Services tab on the home page")
    public void user_navigates_to_services_tab_on_the_home_page() {

    }

    @Then("user sees {string} modules in top menu")
    public void user_sees_modules_in_top_menu(String string) {

    }

}
