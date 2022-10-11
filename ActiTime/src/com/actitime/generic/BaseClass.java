package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.LoginPage;

public class BaseClass 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
	@BeforeTest
	public void OpenBrowser()
	{
		Reporter.log("Open Browser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@AfterTest
	public void CloseBrowser()
	{
		Reporter.log("Close Browser",true);
		driver.close();
	}
	@BeforeMethod
	public void Login() throws IOException
	{
		FileLib f=new FileLib();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url=f.getPropertyData("url");
		String un=f.getPropertyData("username");
		String pw=f.getPropertyData("password");
		driver.get(url);
		LoginPage l=new LoginPage(driver);
		l.setLogin(un,pw);
		Reporter.log("Login",true);
	}
	@AfterMethod
	public void Logout()
	{
		Reporter.log("Login",true);
	}
}
