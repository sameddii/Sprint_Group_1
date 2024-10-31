package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppreciationPage {

    public AppreciationPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
    public WebElement moreMenu;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationMenu;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement inputMessage;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner'])[1]")
    public WebElement consoleMessage;
}

