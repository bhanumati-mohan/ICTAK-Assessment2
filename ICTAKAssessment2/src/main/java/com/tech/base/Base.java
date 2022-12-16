package com.tech.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

public class Base {

	private WebDriver driver;
	public static Properties properties;
	
	@BeforeSuite
	public void onSetup() throws Exception {
		
	  properties=new Properties();
	  
	  File file=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
      FileInputStream inputStream= new FileInputStream(file);
      properties.load(new InputStreamReader(inputStream,Charset.forName("UTF-8")));

    if(properties.getProperty("browser").equals("chrome"))
      {
          driver=new ChromeDriver();
      }
      else if (properties.getProperty("browser").equals("ff"))
      {
          driver=new FirefoxDriver();    
      }
      else if (properties.getProperty("browser").equals("edge"))
      {
          driver=new EdgeDriver();    
      }
	  
    getDriver().get(properties.getProperty("url"));
    getDriver().manage().window().maximize();
    System.out.println("SetUp Completed Successfully...");
  }
  
  public WebDriver getDriver() {
	  return driver;
  }
  
  public void setDriver(WebDriver driver) {
	  this.driver=driver;
  }
}
