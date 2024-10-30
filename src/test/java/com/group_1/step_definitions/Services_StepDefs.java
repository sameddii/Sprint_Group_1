package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.pages.ServicesPage;
import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class Services_StepDefs {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    ServicesPage servicesPage = new ServicesPage();

    @Given("{string} user is logged in and launched on the home page")
    public void userIsLoggedInAndLaunchedOnTheHomePage(String userType) {
        driver.get(ConfigurationReader.getProperty("url"));
        loginPage.login(userType);
    }

    @When("user navigates to Services tab on the home page")
    public void user_navigates_to_services_tab_on_the_home_page() {
        servicesPage.servicesTab.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("services"));

    }

    @Then("user sees {string} modules in top menu")
    public void user_sees_modules_in_top_menu(String expectedNumberOfModules) {
        String actualNumberOfModules = "" + servicesPage.servicesModules.size();
        Assert.assertEquals("Expected number of modules in the top menu was " + expectedNumberOfModules +
                ", but found " + actualNumberOfModules, expectedNumberOfModules, actualNumberOfModules);
    }


    @And("user navigates to FAQ module")
    public void userNavigatesToFAQModule() {
        Assert.assertTrue(servicesPage.faqTab.isDisplayed());
        servicesPage.faqTab.click();
    }

    @Then("user sees FAQ documents on the FAQ page")
    public void userSeesFAQDocumentsOnTheFAQPage() {
        Assert.assertTrue(servicesPage.workProcessDocuments.isDisplayed());
        Assert.assertTrue(servicesPage.filesAndDocuments.isDisplayed());
        Assert.assertTrue(servicesPage.usingPortalServices.isDisplayed());


    }
}
