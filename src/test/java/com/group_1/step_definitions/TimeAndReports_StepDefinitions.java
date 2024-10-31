package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.pages.TimeAndReportsPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.ConfigurationReader;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TimeAndReports_StepDefinitions {


    TimeAndReportsPage timeAndReportsPage = new TimeAndReportsPage();
    SoftAssertions softly = new SoftAssertions();



    @When("user goes to Time and Reports page")
    public void user_goes_to_time_and_reports_page() {

        timeAndReportsPage.timeAndReportsButton.click();

    }


    @Then("user should see {int} modules on the page")
    public void user_should_see_modules_on_the_page(int expectedModuleNumber) {


        int actualModuleNumber = timeAndReportsPage.modules.size();

        //Assert.assertEquals(expectedModuleNumber,actualModuleNumber);

        softly.assertThat(actualModuleNumber).isEqualTo(expectedModuleNumber);



        for (WebElement eachModule : timeAndReportsPage.modules) {

            //Assert.assertTrue( eachModule.isDisplayed());

            softly.assertThat(eachModule.isDisplayed()).isTrue();

        }

        softly.assertAll();

    }



    @And("user navigates to Worktime module")
    public void userNavigatesToWorktimeModule() {

        timeAndReportsPage.worktimeModule.click();

    }


    @Then("user sees {int} checkboxes on the Worktime module.")
    public void userSeeCheckboxesOnTheWorktimeModule(int expectedCheckboxNumber) {

        int actualCheckboxNumber = timeAndReportsPage.worktimeCheckboxes.size();

        //Assert.assertEquals(expectedCheckboxNumber,actualCheckboxNumber);

        softly.assertThat(actualCheckboxNumber).isEqualTo(expectedCheckboxNumber);

        softly.assertAll();


    }


    @Then("user sees ‘Statistics’ checkbox selected by default")
    public void userSeesStatisticsCheckboxSelectedByDefault() {

        //Assert.assertTrue(timeAndReportsPage.statisticCheckbox.isSelected());

        softly.assertThat(timeAndReportsPage.statisticCheckbox.isSelected()).isTrue();

        softly.assertAll();

    }



}
