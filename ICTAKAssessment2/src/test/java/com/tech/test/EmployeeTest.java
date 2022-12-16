package com.tech.test;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;

import com.tech.base.Base;
import com.tech.constants.AutomationConstants;
import com.tech.pages.AddEmployeePage;
import com.tech.pages.AdminHomePage;
import com.tech.pages.EditEmployeePage;
import com.tech.pages.ListEmployeePage;
import com.tech.pages.LoginPage;
import com.tech.utilities.ExcelUtility;

import junit.framework.Assert;

public class EmployeeTest extends Base {
	
	LoginPage obj1;
	AdminHomePage obj2;
	ListEmployeePage obj3;
	EditEmployeePage obj4;
	AddEmployeePage obj5;
	
	
  @Test(priority=0)
  public void verifyLogin() throws Exception {
	  obj1=new LoginPage(getDriver());
	  
      String uname=ExcelUtility.readDetails(1, 0).getStringCellValue();  
      obj1.setUsername(uname);

      String pass=NumberToTextConverter.toText(ExcelUtility.readDetails(1, 1).getNumericCellValue());
      obj1.setPassword(pass);

      obj1.clickLogin();
      String ActTitle=getDriver().getTitle();
      Assert.assertEquals(AutomationConstants.ExpTitle, ActTitle);
  }
  
  @Test(priority=1)
  public void verifyEmployeeList() throws Exception {
	  obj2=new AdminHomePage(getDriver());
	  obj3=new ListEmployeePage(getDriver());
	  obj4=new EditEmployeePage(getDriver());
      
      obj2.clickEmployee();
      String ActValue=obj3.getValue();
      Assert.assertEquals(AutomationConstants.ExpSpanValue, ActValue);
      
      obj3.clickEdit();
      String ActSpanValue=obj4.getValue();
      Assert.assertEquals(AutomationConstants.ExpAddSpanValue, ActSpanValue);
      
      obj4.clickBack();
      String ActBckValue=obj3.getValue();
      Assert.assertEquals(AutomationConstants.ExpSpanValue, ActBckValue);
      
      obj3.clickDelete();
      //getDriver().switchTo().alert().accept();      
      getDriver().switchTo().alert().dismiss();
  }
  
  @Test(priority=2)
  public void verifyAddEmployee() throws Exception {
	  obj3=new ListEmployeePage(getDriver());
	  obj5=new AddEmployeePage(getDriver());
      
      obj3.clickAdd();
      String ActValue=obj5.getValue();
      Assert.assertEquals(AutomationConstants.ExpAddSpanValue, ActValue);
      
      String ename=ExcelUtility.readDetails(1, 2).getStringCellValue();  
      obj5.setName(ename);
      
      String pass=NumberToTextConverter.toText(ExcelUtility.readDetails(1, 3).getNumericCellValue());  
      obj5.setPassword(pass);
      
      String email=ExcelUtility.readDetails(1, 4).getStringCellValue();  
      obj5.setEmail(email);
      
      String design=ExcelUtility.readDetails(1, 5).getStringCellValue();  
      obj5.selectDesignation(design);
    
      String report=ExcelUtility.readDetails(1, 6).getStringCellValue();  
      obj5.selectReportingTo(report);
      
      String member=ExcelUtility.readDetails(1, 7).getStringCellValue();  
      obj5.selectMemberOf(member);
      
      String empid=NumberToTextConverter.toText(ExcelUtility.readDetails(1, 8).getNumericCellValue());  
      obj5.setEmpID(empid);
      
      String cpass=NumberToTextConverter.toText(ExcelUtility.readDetails(1, 9).getNumericCellValue());  
      obj5.setCPassword(cpass);
      
      String phone=NumberToTextConverter.toText(ExcelUtility.readDetails(1, 10).getNumericCellValue());  
      obj5.setMobile(phone);
      
      String empType=ExcelUtility.readDetails(1, 11).getStringCellValue();  
      obj5.selectEmpType(empType);
      
      String Address=ExcelUtility.readDetails(1, 12).getStringCellValue();  
      obj5.setAddress(Address);
      
      obj5.clickSubmit();
      String ActSubValue=obj3.getValue();
      Assert.assertEquals(AutomationConstants.ExpSpanValue, ActSubValue);      
      
      //obj5.clickReset();
  }
}