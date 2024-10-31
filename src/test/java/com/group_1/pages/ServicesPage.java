package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ServicesPage {
    public ServicesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//a[@title='Services']")
    public WebElement servicesTab;

    @FindBy(xpath = "//div[@data-top-menu-id='top_menu_id_services']")
    public List<WebElement> servicesModules;

    @FindBy(linkText = "FAQ")
    public WebElement faqTab;

    @FindBy(linkText = "Work Process")
    public WebElement workProcessDocuments;

    @FindBy(linkText = "Files and Documents")
    public WebElement filesAndDocuments;

    @FindBy(linkText = "Using portal services")
    public WebElement usingPortalServices;
}
