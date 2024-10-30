package com.group_1.pages;

import com.group_1.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TimeAndReportsPage {


    public TimeAndReportsPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[.='Time and Reports']")
    public WebElement timeAndReportsButton;



    @FindBy(xpath = "//div[@data-locked='false']")
    public List<WebElement> modules;


    @FindBy(xpath = "//a[.='Worktime']")
    public WebElement worktimeModule;


    @FindBy(xpath = "//input[@type='checkbox']")
    public List<WebElement> worktimeCheckboxes;


    @FindBy(xpath = "//input[@name='stats']")
    public WebElement statisticCheckbox;


}
