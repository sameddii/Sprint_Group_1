package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ActivitystreamPage {

    public ActivitystreamPage() {
        PageFactory.initElements(Driver.getDriver(),this);}

        @FindBy(xpath = "//div[@id='feed-add-post-form-tab']")
        public WebElement optionsMenu;

        @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
        public WebElement moreMenu;

        @FindBy(xpath = "//div[@class='menu-popup']")
        public WebElement moreMenuoptions;





}
