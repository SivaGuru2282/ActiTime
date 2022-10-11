package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrack
{
	@FindBy(id="logoutLink")
	private WebElement lgotx;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasktab;
	
	public EnterTimeTrack(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setlogout()
	{
		lgotx.click();
	}
public void setTabtask()
{
	tasktab.click();
}
}
