package com.group_1.step_definitions;

import com.group_1.pages.HomePage;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import java.util.ArrayList;
import java.util.List;

public class LogoutStepDefs {

    HomePage homePage = new HomePage();

    @When("user clicks on profile")
    public void user_clicks_on_profile() {
        homePage.userMenu.click();
    }

    @And("user sees options")
    public void userSeesOptions() {
        List<WebElement> allOptions = new ArrayList<>();
        allOptions.addAll(homePage.links);
        allOptions.addAll(homePage.spans);

        for (WebElement options : allOptions) {
            if (options.isDisplayed()) {
                System.out.println("Option displayed: " + options.getText());
            } else {
                System.out.println("Option NOT displayed: " + options.getText());
            }
        }

    }

    @Then("user clicks logout")
    public void userClicksLogout() {
        homePage.logoutLink.click();
    }

    @Then("user is logged out")
    public void userIsLoggedOut() {
      String expectedTitle = "Authorization";
      String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(expectedTitle,actualTitle);

    }

    @And("user clicks logout after {int} minutes")
    public void userClicksLogoutAfterMinutes(int minutes) {

        try {
            Thread.sleep(minutes * 60 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        homePage.logoutLink.click();
    }
}
