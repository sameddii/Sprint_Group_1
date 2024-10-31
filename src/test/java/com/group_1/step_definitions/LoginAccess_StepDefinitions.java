package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.utilities.BrowserUtils;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.assertEquals;

public class LoginAccess_StepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(LoginAccess_StepDefinitions.class);
    LoginPage loginPage= new LoginPage();

    @Then("user should see the title named as {string}")
    public void userShouldSeeTheTitleNamedAs(String expectedTitle) {
    BrowserUtils.verifyTitle(expectedTitle);
    }


    @Then("user should see {string} Header text displayed")
    public void user_should_see_header_text_displayed(String expectedHeaderText) {
        String actualHeaderText = loginPage.header.getText();
        assertEquals(expectedHeaderText, actualHeaderText);
    }




    @Then("user should see {string} placeholder text displayed on the username input field")
    public void userShouldSeePlaceholderTextDisplayedOnTheUsernameInputField(String expectedTextUsername) {
       //String actualTextInUsernameField= loginPage.userName.getText(); //DOESNT PASS

       // WebElement inputUsername=Driver.getDriver().findElement(By.xpath("//input[@name='USER_LOGIN']"));
       // String actualTextInUsernameField = inputUsername.getText(); DOESNT PASS

        String actualTextInUsernameField= loginPage.userName.getAttribute("placeholder");
       assertEquals(expectedTextUsername, actualTextInUsernameField);
    }//pass


    @Then("user should see {string} text displayed on the password input field")
    public void userShouldSeeTextDisplayedOnThePasswordInputField(String expectedPasswordText) {
        String actualPasswordText=loginPage.password.getAttribute("placeholder");
        //doesn't pass by using .getText()
        assertEquals(expectedPasswordText, actualPasswordText);
    }


    @Then("user should see {string} text displayed on the login button")
    public void userShouldSeeTextDisplayedOnTheLoginButton(String expectedLoginText) {
        String actualLoginText=loginPage.submit.getText();
        assertEquals(expectedLoginText, actualLoginText);
    } //Error Question

    @Then("user can click on the Log In button")
    public void userCanClickOnTheLogInButton() {
        loginPage.submit.click();
    }

    @Then("user should be see {string} displayed")
    public void userShouldBeSeeDisplayedQuestionToBaha(String expectedErrorText) {
        String actualErrorText=loginPage.errorMessage.getText();
        assertEquals(expectedErrorText, actualErrorText);
    }

    @Then("user should see {string} text displayed on the forgot link")
    public void userShouldSeeTextDisplayedOnTheForgotLink(String expectedForgotLinkText) {
        String actualForgotLinkText=loginPage.forgot.getText();
        assertEquals(expectedForgotLinkText, actualForgotLinkText);
    }


    @And("user can click on the forgot password link")
    public void userCanClickOnTheForgotPasswordLink() {
        loginPage.forgot.click();
    }


    @Then("user should be directed to this page with the title {string}")
    public void userShouldBeDirectedToThisPageWithTheTitle(String expectedGetPasswordText) {
        Driver.getDriver().getTitle();
        assertEquals(expectedGetPasswordText, Driver.getDriver().getTitle());
    }
}
