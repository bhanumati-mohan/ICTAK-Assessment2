package com.tech.utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {

	public static void takeSnapShot(WebDriver driver) throws Exception{
	    TakesScreenshot scrShot =((TakesScreenshot)driver);
	    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	    File DestFile=new File(System.getProperty("user.dir")+"\\Screenshots\\op.png");
	    FileUtils.copyFile(SrcFile, DestFile);
	     }
}
