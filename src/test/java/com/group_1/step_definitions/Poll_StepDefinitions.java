package com.group_1.step_definitions;

import com.group_1.pages.PollPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Poll_StepDefinitions {

    PollPage pollPage = new PollPage();

    @When("user navigates to poll page")
    public void user_navigates_to_poll_page() {

        pollPage.pollButton.click();

    }


    @When("user creates a poll with a question and two answers")
    public void user_creates_a_poll_with_a_question_and_answers() {

        Driver.getDriver().switchTo().frame(pollPage.iframeElement);

        pollPage.messageBox.sendKeys("Message");

        Driver.getDriver().switchTo().defaultContent();

        pollPage.questionBox.sendKeys("Question");

        pollPage.answer1.sendKeys("Answer 1");

        pollPage.answer2.sendKeys("Answer 2");

        pollPage.sendButton.click();

    }


    @Then("user sees the poll in the feed")
    public void userSeesThePollInTheFeed() {

        Driver.getDriver().navigate().refresh();

       Assert.assertTrue(pollPage.pollInTheFeed.isDisplayed());

    }


    @When("user cancels the pool")
    public void user_cancels_the_pool() {

        pollPage.cancelButton.click();

    }

    @Then("poll message area collapses")
    public void poll_message_area_collapses() {

        Assert.assertFalse(pollPage.questionBox.isDisplayed());

    }



}
