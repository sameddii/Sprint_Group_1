package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@id='microoPostFormLHE_blogPostForm_inner']")
    public WebElement messageArea;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement inputMessage;

    @FindBy(xpath = "//div[contains(@id,'blg-post-img-')]//div[3]/div[1]")
    public WebElement messageEntered;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement userMenu;

    @FindBy(xpath = "//div[@class='menu-popup-items']/a")
    public List<WebElement> links;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span")
    public List<WebElement> spans;

    @FindBy(xpath = "//div[@class='menu-popup-items']/a/span[.='Log out']")
    public WebElement logoutLink;
}
