package com.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.utilities.PageUtility;
import com.tech.utilities.WaitUtility;

public class AdminHomePage {

WebDriver driver;
    
 	@FindBy(xpath="//ul[@class='dash']//child::a[1]")
    private WebElement	ListEmp ;
    
    public AdminHomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    public void clickEmployee() throws Exception {
        WaitUtility.waitForElementToBeClickable(driver, ListEmp);
        PageUtility.clickele(ListEmp, driver);
    }
}
