package com.group_1.step_definitions;

import com.group_1.pages.CompanyPage;
import com.group_1.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class CompanyStepDefs {

    @When("user clicks on company")
    public void user_clicks_on_company() {
        HomePage homePage = new HomePage();
        homePage.companyLink.click();
    }

    CompanyPage companyPage = new CompanyPage();

    @Then("user sees {int} modules in the page")
    public void user_sees_modules_in_the_page(Integer modules) {

        int allModules = companyPage.companyModules.size();
        System.out.println("allModules = " + allModules);

        for (WebElement mods : companyPage.companyModules) {
            System.out.println("Modules = " + mods.getText());
        }
        Assert.assertTrue(allModules == 7);


    }
}
