package com.jenkinsTest.sampleTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class AutomationTalk {
	public static WebDriver driver;
  @Test
  public void test1() {
	  driver.findElement(By.name("username")).sendKeys("admin");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Rupendranathreddy\\Sel-new-workspace on sep42020\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumbymahesh.com/HMS/");
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		//driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
