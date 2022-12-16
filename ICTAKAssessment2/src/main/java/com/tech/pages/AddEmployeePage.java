package com.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.utilities.PageUtility;
import com.tech.utilities.WaitUtility;

public class AddEmployeePage {

	WebDriver driver;

	@FindBy(xpath="//span[@id='ContentPlaceHolder1_lblTitle']")
    private WebElement AddSpan;
	
	@FindBy(id="ContentPlaceHolder1_txtName")
    private WebElement name;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
    private WebElement password;
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
    private WebElement email;
	
	@FindBy(id="ContentPlaceHolder1_drpDesignation")
    private WebElement designation;
	
	@FindBy(id="ContentPlaceHolder1_drpReportingTo")
    private WebElement reportingTo;
	
	@FindBy(id="ContentPlaceHolder1_drpGroup")
    private WebElement memberOf;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
    private WebElement empid;
	
	@FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
    private WebElement cpassword;
	
	@FindBy(id="ContentPlaceHolder1_txtMobileNumber")
    private WebElement mobile;
	
	@FindBy(id="ContentPlaceHolder1_drpEmployeeType")
    private WebElement empType;
	
	@FindBy(id="ContentPlaceHolder1_ChkReportingStaff")
    private WebElement reportStaff;
	
	@FindBy(id="ContentPlaceHolder1_txtAddress")
    private WebElement address;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_btnSubmit']")
    private WebElement Submit;
	
//	@FindBy(id="Reset")
//    private WebElement Reset;
	
	public AddEmployeePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    public String getValue() throws Exception {
        String ActValue=AddSpan.getText();
        System.out.println(ActValue);
        return ActValue;
    }
    
    public String setName(String ename) throws Exception {
        PageUtility.sendInput(name, ename);
        return ename;
        }
    
    public String setPassword(String pass) throws Exception {
        PageUtility.sendInput(password, pass);
        return pass;
        }
    
    public String setEmail(String emailid) throws Exception {
        PageUtility.sendInput(email, emailid);
        return emailid;
        }
    
    public String selectDesignation(String design) throws Exception {
        PageUtility.dropDown(designation, design);
        return design;
        }
    
    public String selectReportingTo(String report) throws Exception {
        PageUtility.dropDown(reportingTo, report);
        return report;
        }
    
    public String selectMemberOf(String member) throws Exception {
        PageUtility.dropDown(memberOf, member);
        return member;
        }
    
    public String setEmpID(String eid) throws Exception {
        PageUtility.sendInput(empid, eid);
        return eid;
        }
    
    public String setCPassword(String cpass) throws Exception {
        PageUtility.sendInput(cpassword, cpass);
        return cpass;
        }
    
    public String setMobile(String phone) throws Exception {
        PageUtility.sendInput(mobile, phone);
        return phone;
        }
    
    public String selectEmpType(String etype) throws Exception {
        PageUtility.dropDown(empType, etype);
        return etype;
        }
    
    public void checkStaff(String repStaff) throws Exception {
        PageUtility.selectCheckBox(reportStaff);
        }
    
    public String setAddress(String addr) throws Exception {
        PageUtility.sendInput(address, addr);
        return addr ;
        }
    
    public void clickSubmit() throws Exception {
        WaitUtility.waitForElementToBeClickable(driver, Submit);
        PageUtility.clickele(Submit, driver);
    	}
    
//    public void clickReset() throws Exception {
//        WaitUtility.waitForElementToBeClickable(driver, Reset);
//        PageUtility.clickele(Reset, driver);
//    	}
}
