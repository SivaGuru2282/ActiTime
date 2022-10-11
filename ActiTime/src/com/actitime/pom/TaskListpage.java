package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListpage 
{
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newcstbtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustTbx;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustdescr;
	
	@FindBy(xpath="//div[text()='- Select Customer -' and @class='emptySelection']")
	private WebElement selectdropDown;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustBtn;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustCreated;
	
	public TaskListpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcstbtn() {
		return newcstbtn;
	}

	public WebElement getEnterCustTbx() {
		return enterCustTbx;
	}

	public WebElement getEnterCustdescr() {
		return enterCustdescr;
	}

	public WebElement getSelectdropDown() {
		return selectdropDown;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustBtn() {
		return createCustBtn;
	}

	public WebElement getActualCustCreated() {
		return actualCustCreated;
	}
}
