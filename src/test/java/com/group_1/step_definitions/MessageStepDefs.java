package com.group_1.step_definitions;

import com.group_1.pages.HomePage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageStepDefs {

    HomePage homePage = new HomePage();

    @Then("user clicks message area")
    public void user_clicks_message_area() {
        homePage.messageArea.click();
    }

    @When("user should be able to type {string}")
    public void user_should_be_able_to_type(String message) {
        WebElement iframeElement = homePage.frame;
        Driver.getDriver().switchTo().frame(iframeElement);

        WebElement box = homePage.inputMessage;
        box.sendKeys(message);

        Driver.getDriver().switchTo().parentFrame();

        homePage.sendButton.click();

        BrowserUtils.sleep(1);
    }


    @Then("user should see message on top of the screen")
    public void user_should_see_message_on_top_of_the_screen() {
       WebElement message = homePage.messageEntered;

        Assert.assertTrue(message.isDisplayed());
    }

    @Then("user should be able to type {string} and cancel it")
    public void user_should_be_able_to_type_and_cancel_it(String message) {
        WebElement iframeElement = homePage.frame;
        Driver.getDriver().switchTo().frame(iframeElement);

        WebElement box = homePage.inputMessage;
        box.sendKeys(message);

        Driver.getDriver().switchTo().parentFrame();

        BrowserUtils.sleep(1);

        homePage.cancelButton.click();
    }
}
