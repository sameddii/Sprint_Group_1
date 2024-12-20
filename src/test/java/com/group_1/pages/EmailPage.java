package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmailPage {

    public EmailPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//span[@id='pagetitle']")
    public WebElement mailboxIntegration;

    @FindBy(xpath = "//div[@class='side-panel-content-container']/iframe")
    public WebElement frame;

    @FindBy(xpath = "//button[@id='mail_connect_cancel_btn']")
    public WebElement cancelButton;

    @FindBy(xpath = "//div[@class='mail-add-list']/a")
    public List<WebElement> emailProvidersList;

    @FindBy(xpath = "//img[@class='mail-connect-img']")
    public List<WebElement> emailSevProList;







}
