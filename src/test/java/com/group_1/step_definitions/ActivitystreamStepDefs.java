package com.group_1.step_definitions;

import com.group_1.pages.ActivitystreamPage;
import com.group_1.pages.LoginPage;
import com.group_1.pages.ServicesPage;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ActivitystreamStepDefs {
    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();
    ActivitystreamPage activitystreamPage = new ActivitystreamPage();


    @Then("user sees the MESSAGE,TASK,EVENT and MORE options in top menu")
    public void user_sees_the_message_task_event_and_more_options_in_top_menu() {
        Assert.assertTrue(activitystreamPage.optionsMenu.isDisplayed());
    }

    @When("user clicks MORE tab")
    public void user_clicks_more_tab() {
        activitystreamPage.moreMenu.click();

    }
    @Then("user sees FILE,APPRECIATION,ANNOUNCEMENT and WORKFLOW options under the MORE tab")
    public void user_sees_file_appreciation_announcement_and_workflow_options_under_the_more_tab() {
        Assert.assertTrue(activitystreamPage.moreMenuoptions.isDisplayed());


    }


}
