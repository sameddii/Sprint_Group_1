package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ApplicationPage {
    public ApplicationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@title='Applications']")
    public WebElement applicationTab;

    @FindBy(xpath = "//div[@class='mp-item']")
    public List<WebElement> applicationModules;

    @FindBy(xpath = "//span[@class='menu-favorites-more-text']")
    public WebElement moreTab;

    @FindBy(xpath = "//div[contains(@class, 'ui-btn-round')]")
    public List<WebElement> downloadElements;

    @FindBy(linkText = "Install")
    public WebElement verifyInstall;

    @FindBy(css = "iframe.side-panel-iframe")
    private WebElement iframe;






    


    

    







}