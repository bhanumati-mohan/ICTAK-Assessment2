package com.tech.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.tech.base.Base;

public class PageUtility extends Base {

	public static void sendInput(WebElement ele, String input) {
		ele.clear();
		ele.sendKeys(input);
	}
	
	public static void clickele(WebElement ele, WebDriver driver) {
		WaitUtility.waitForEle(driver, ele);
		ele.click();
	}
	
	public static void scrollTillEle(WebDriver driver, WebElement ele) {
		((JavascriptExecutor)driver).executeScript("argument[0].scrollIntoView(true);",ele);
	}
	
	public static void scroll(WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,000)", "");
	}
	
	public static String getText(WebElement ele) {
		return ele.getText();
	}
	
	public static boolean isDisplayed(WebElement ele) {
		return ele.isDisplayed();
	}
	
	public static void selectCheckBox(WebElement ele) {
		if(!ele.isSelected())
		{
			ele.click();
		}
	}
	
	public static void actionClick(WebElement ele, WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(ele).click().build().perform();
	}
	
	public static void doubleClick(WebElement ele, WebDriver driver) {
		Actions action=new Actions(driver);
		action.doubleClick(ele).build().perform();
	}
	
	public static void rightClick(WebElement ele, WebDriver driver) {
		Actions action=new Actions(driver);
		action.contextClick(ele).build().perform();
	}
	
	public static void hoverLink(WebElement ele, WebDriver driver) {
		Actions action=new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	
	public static void enterKey(WebDriver driver) {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER);
	}
	
	public static void multipleKey(WebDriver driver) {
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys().keyUp(Keys.CONTROL).perform();
	}
	
	public static void dropDown(WebElement ele, String visibleText) {
		Select select=new Select(ele);
		select.selectByVisibleText(visibleText);
		select.getFirstSelectedOption();
		ele.getText();
	}
}
