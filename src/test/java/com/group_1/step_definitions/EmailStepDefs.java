package com.group_1.step_definitions;

import com.group_1.pages.EmailPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.junit.Assert;

import java.util.List;

public class EmailStepDefs {


    EmailPage emailPage = new EmailPage();
    SoftAssertions softly = new SoftAssertions();


    @Given("the user should see the {string} window")
    public void the_user_should_see_the_window(String expectedIntegrationTitle) {


        BrowserUtils.sleep(1);
        System.out.println(emailPage.mailboxIntegration.getText());
        Assert.assertEquals("Expected title is: " + expectedIntegrationTitle, expectedIntegrationTitle, emailPage.mailboxIntegration.getText());
    }

    @When("the user should see {int} email service providers")
    public void the_user_should_see_email_service_providers(int expectEmailProvidersNumbers) {
        int actualEmailProvidersNumbers = emailPage.emailProvidersList.size();
        Assert.assertEquals("Expected number of displayed emails " + expectEmailProvidersNumbers + " and  " + actualEmailProvidersNumbers, expectEmailProvidersNumbers, emailPage.emailProvidersList.size());
    }
    @Then("the following email service providers should be displayed")
    public void the_following_email_service_providers_should_be_displayed(List<String> expectedLogoElements) {

        for (int i = 0; i < emailPage.logoElements.size() + 1; i++) {

            emailPage.emailProvidersList.get(i).click();
            BrowserUtils.sleep(2);
            Driver.getDriver().switchTo().frame(emailPage.frame);
            BrowserUtils.sleep(2);
            emailPage.cancelButton.click();
            Driver.getDriver().switchTo().defaultContent();
            BrowserUtils.sleep(2);

            softly.assertThat(emailPage.emailProvidersList.get(i).isDisplayed()).isTrue();
        }
        softly.assertAll();
    }

    @Then("the user should be able to click and see the logo of each email service provider")
    public void the_user_should_be_able_to_click_and_see_the_of_logo_each_email_service_provider(List<String> expectedAltImgList) {

        List<String> actualImgList = BrowserUtils.getElementsText(emailPage.emailSevProList);

        for (int i = 0; i < emailPage.emailSevProList.size() - 1; i++) {

            softly.assertThat(emailPage.logoElements.get(i).getAttribute("alt")).isEqualTo(expectedAltImgList.get(i));
        }

        softly.assertThat(emailPage.logoElements.get(emailPage.logoElements.size() - 1).getAttribute("alt")).isNull();

        softly.assertAll();











    }

}

