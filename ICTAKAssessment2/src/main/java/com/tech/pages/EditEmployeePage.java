package com.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.utilities.PageUtility;
import com.tech.utilities.WaitUtility;

public class EditEmployeePage {
	
	WebDriver driver;

	@FindBy(xpath="//span[@id='ContentPlaceHolder1_lblTitle']")
    private WebElement AddSpan;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnBack']")
    private WebElement BackButton;
    
    public EditEmployeePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    public String getValue() throws Exception {
        String ActValue=AddSpan.getText();
        System.out.println(ActValue);
        return ActValue;
    }
    
    public void clickBack() throws Exception {
        WaitUtility.waitForElementToBeClickable(driver, BackButton);
        PageUtility.clickele(BackButton, driver);
    }
}
