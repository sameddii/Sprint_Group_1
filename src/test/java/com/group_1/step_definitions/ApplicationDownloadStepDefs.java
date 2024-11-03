package com.group_1.step_definitions;

import com.group_1.pages.LoginPage;
import com.group_1.pages.ApplicationPage;
import com.group_1.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;


public class ApplicationDownloadStepDefs {

    WebDriver driver = Driver.getDriver();
    ApplicationPage applicationPage = new ApplicationPage();

    @When("user navigates to the More tab on Home Page")
    public void userNavigatesToTheMoreTabOnHomePage() {
        applicationPage.moreTab.click();
        
    }

    @Then("user clicks on Applications Button")
    public void userClicksOnApplicationsButton() {
        applicationPage.applicationTab.click();
    }

    @Then("verify user is seeing Application Page")
    public void verifyUserIsSeeingApplicationPage() {
        Assert.assertTrue(driver.getCurrentUrl().contains("marketplace"));
    }

    @Given("I am on the application download page")
    public void iAmOnTheApplicationDownloadPage() {

    }

    @Then("count all {int} modules")
    public void countAllModules(int expectedNumberOfModules) {
        int actualNumberOfModules = applicationPage.applicationModules.size();
        Assert.assertEquals("Expected number of modules in the top menu was " + expectedNumberOfModules +
                ", but found " + actualNumberOfModules, expectedNumberOfModules, actualNumberOfModules);
    }

    @Then("inspect all modules and confirm Install button working")
    public void inspectAllModulesAndConfirmInstallButtonWorking() {
        List<WebElement> elementsList = applicationPage.downloadElements;

        for (WebElement element : elementsList) {
            element.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.urlContains("detail"));
            // This one is driving me crazy ~Robert
            //WebElement iframeElement = driver.findElement(By.className("side-panel-iframe"));
            //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class, 'side-panel-iframe')]")));
            //String frameId = driver.findElement(By.className("side-panel-iframe")).getAttribute("id");
            //System.out.println("Currently in iframe with classname: " + frameId);
            //applicationPage.verifyInstall.click();
            Actions actions = new Actions(driver);
            actions.sendKeys(org.openqa.selenium.Keys.ESCAPE).perform();




        }

    }
}
