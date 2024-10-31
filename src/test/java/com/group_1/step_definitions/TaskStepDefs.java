package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.pages.TaskPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TaskStepDefs {

    TaskPage taskPage = new TaskPage();
    LoginPage loginPage = new LoginPage();


    @Given("the user is on the CRM24 page.")
    public void the_user_is_on_the_crm24_page() {
        Driver.getDriver().get("https://login1.nextbasecrm.com/stream/?login=yes");

    }

    @When("users log in with valid {string} credentials.")
    public void users_log_in_with_valid_credentials(String accountType) {

        loginPage.login(accountType);

    }

    @Then("the user should see the dashboard.")
    public void the_user_should_see_the_dashboard() {
        BrowserUtils.verifyElementDisplayed(taskPage.logo24); // this my utility
    }


    @When("users click on TASK button")
    public void users_click_on_task_button() {
        taskPage.taskButton.click();
    }

    @Then("users enter the task title {string} on Things to do area")
    public void users_enter_the_task_title_on_things_to_do_area(String taskTitle) {
        taskPage.thingToDoArea.click();
        taskPage.thingToDoArea.sendKeys(taskTitle);

    }
    @Then("users enter the task body {string} on task body area")
    public void users_enter_the_task_body_on_task_body_area(String taskBody) {

        Driver.getDriver().switchTo().frame(taskPage.iframeElement);

        taskPage.taskBodyArea.click();
        taskPage.taskBodyArea.sendKeys(taskBody);

        Driver.getDriver().switchTo().defaultContent();
    }
    @Then("users click on the SEND button")
    public void users_click_on_the_send_button() {

        taskPage.sendButton.click();
    }
    @Then("User should see the task on Active Stream page")
    public void user_should_see_the_task_on_active_stream_page() {
        // if I use helpdesk1@cydeo.com,hr1@cydeo.com and marketing1@cydeo.com usernames where comes out a pop-up message so,
        // I used if-else block
        if (("helpdesk1@cydeo.com".equals(ConfigurationReader.getProperty("helpdesk_username"))) ||
                ("hr1@cydeo.com".equals(ConfigurationReader.getProperty("hr_username"))) ||
                ("marketing1@cydeo.com".equals(ConfigurationReader.getProperty("hr_password")))) {
            BrowserUtils.verifyElementDisplayed(taskPage.taskCreated);
        } else {
            BrowserUtils.waitForVisibility(taskPage.taskOnActiveStreamPage, 2);
            BrowserUtils.verifyElementDisplayed(taskPage.taskOnActiveStreamPage);
        }
    }

    @Then("users click on CANCEL button")
    public void users_click_on_cancel_button() {
        taskPage.cancelButton.click();

    }
    @Then("users should see the task message area has collapsed")
    public void users_should_see_the_task_message_area_has_collapsed() {
        taskPage.taskMessageAreaCollapsed.isDisplayed();

    }


}
