package com.group_1.step_definitions;

import com.group_1.pages.EmailPage;
import com.group_1.pages.LoginPage;
import com.group_1.pages.MailPage;
import com.group_1.utilities.BrowserUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class MailStepDefs  {


    MailPage mailPage = new MailPage();

    @When("the user should click on the mailbox")
    public void the_user_should_click_on_the_mailbox() {

        mailPage.mailbox.click();
        BrowserUtils.sleep(2);

    }
    @Then("Verify that {string} display")
    public void verify_that_display(String expectedMailboxTitle) {

        mailPage.mailboxTitle.isDisplayed();
        BrowserUtils.sleep(1);
        Assert.assertEquals(expectedMailboxTitle, mailPage.mailboxTitle.getText());

    }








      }