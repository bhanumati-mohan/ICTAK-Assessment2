package com.tech.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tech.utilities.PageUtility;

public class LoginPage {

	 WebDriver driver;

     @FindBy(id="txtUsername")
        private WebElement username;

     @FindBy(id="txtPassword")
        private WebElement password;

     @FindBy(id="btnSubmit")
        private WebElement login;

     public LoginPage(WebDriver driver) {
            this.driver=driver;
            PageFactory.initElements(driver, this);
        }

     public String setUsername(String uname) throws Exception {
         PageUtility.sendInput(username, uname);
         return uname;
         }

     public String setPassword(String pass) throws Exception {
         PageUtility.sendInput(password, pass);
         return pass;
         }

         public void clickLogin() throws Exception {
             PageUtility.clickele(login, driver);
         }
}
