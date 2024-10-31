package com.group_1.pages;


import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {

    public TaskPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Username or Email']")
    public WebElement userName;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(css = "input.login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//span[@class ='logo-color']")
    public WebElement logo24;

    @FindBy (xpath = "//span[text() ='Task']")
    public WebElement taskButton;

    @FindBy(css = "input[data-bx-id='task-edit-title']")
    public WebElement thingToDoArea;

    @FindBy(xpath = "//body[contains(@style, 'min-height:')]")
    public WebElement taskBodyArea;

    @FindBy(css = "button[id = 'blog-submit-button-save']")
    public WebElement sendButton;

    //@FindBy(xpath = "(//span[@class='feed-task-info-text-cont'])[1]")
    @FindBy(xpath = "(//div[contains(@id,'log-entry-')])[1]")
    public WebElement taskOnActiveStreamPage;

    @FindBy(css = "button[id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(css = "span.feed-add-post-micro-title" )
    public WebElement taskMessageAreaCollapsed;

    @FindBy (xpath = "//div[text() ='Task has been created']")
    public WebElement taskCreated;


    @FindBy(xpath ="(//iframe[@class = 'bx-editor-iframe'])[2]")
    public WebElement iframeElement;
}
