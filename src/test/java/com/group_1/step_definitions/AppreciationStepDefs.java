package com.group_1.step_definitions;

import com.group_1.pages.AppreciationPage;
import com.group_1.pages.LoginPage;
import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public class AppreciationStepDefs {

    AppreciationPage appreciationPage = new AppreciationPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        loginPage.login(userType);
    }
    @When("user clicks the more menu")
    public void user_clicks_the_more_menu() {
        appreciationPage.moreMenu.click();
    }
    @When("user clicks appreciation")
    public void user_clicks_appreciation() {
        appreciationPage.appreciationMenu.click();
    }
    @When("user should be able to enter {string}")
    public void user_should_be_able_to_enter(String message) {
        WebElement iframeElement = appreciationPage.frame;
        Driver.getDriver().switchTo().frame(iframeElement);

        WebElement box = appreciationPage.inputMessage;
        box.sendKeys(message);

        Driver.getDriver().switchTo().parentFrame();

        appreciationPage.sendButton.click();;
    }
    @Then("user should see the message displayed on the feed")
    public void user_should_see_the_message_displayed_on_the_feed() {
        WebElement message = appreciationPage.consoleMessage;
        try {
            Assert.assertTrue(message.isDisplayed());
        }catch (StaleElementReferenceException e) {
            Assert.assertTrue(message.isDisplayed());
        }

    }
}
