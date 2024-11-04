package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {

    public PollPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[.='Poll']")
    public WebElement pollButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeElement;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageBox;

    @FindBy(id = "question_0")
    public WebElement questionBox;

    @FindBy(id = "answer_0__0_")
    public WebElement answer1;

    @FindBy(id = "answer_0__1_")
    public WebElement answer2;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id = "blog-submit-button-cancel")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[.='Send message …']")
    public WebElement sendMessageText;


    @FindBy(xpath = "(//*[contains(@id,'blg-post-img-')])[1]")
    public WebElement pollInTheFeed;



}
