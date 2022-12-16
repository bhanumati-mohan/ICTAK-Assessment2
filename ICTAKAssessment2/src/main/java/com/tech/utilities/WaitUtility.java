package com.tech.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tech.base.Base;
import com.tech.constants.AutomationConstants;

public class WaitUtility extends Base{

	public static void waitForElementToBeClickable(WebDriver driver, WebElement target) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(AutomationConstants.EXPLICIT_WAIT));
		wait.until(ExpectedConditions.elementToBeClickable(target));
	}
	
	public static void waitForEle(WebDriver driver, WebElement target) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(AutomationConstants.EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
}
