package com.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.utilities.PageUtility;
import com.tech.utilities.WaitUtility;

public class ListEmployeePage {

WebDriver driver;
    
 	@FindBy(xpath="//div[@class='adminFormWrap']//child::h2//child::span")
    private WebElement SpanValue;
 	
 	@FindBy(id="ContentPlaceHolder1_gvList_LinkButton1_0")
    private WebElement EditButton;
 	
 	@FindBy(id="ContentPlaceHolder1_gvList_LinkButton2_0")
    private WebElement DeleteButton;
 	
 	@FindBy(id="addButton")
    private WebElement AddButton;
    
    public ListEmployeePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    public String getValue() throws Exception {
        String ActValue=SpanValue.getText();
        System.out.println(ActValue);
        return ActValue;
    }
    
    public void clickEdit() throws Exception {
        WaitUtility.waitForElementToBeClickable(driver, EditButton);
        PageUtility.clickele(EditButton, driver);
    }
    
    public void clickDelete() throws Exception {
        WaitUtility.waitForElementToBeClickable(driver, DeleteButton);
        PageUtility.clickele(DeleteButton, driver);
    }
    
    public void clickAdd() throws Exception {
        WaitUtility.waitForElementToBeClickable(driver, AddButton);
        PageUtility.clickele(AddButton, driver);
    }
}
