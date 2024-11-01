package com.group_1.pages;


import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MailPage {


    public MailPage()  {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//li[@id='bx_left_menu_menu_external_mail']//a")
    public WebElement mailbox;

    @FindBy(xpath = "//div[@class='mail-add-title']")
    public WebElement mailboxTitle;


}
