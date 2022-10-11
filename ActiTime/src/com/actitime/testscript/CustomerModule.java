package com.actitime.testscript;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTimeTrack;
import com.actitime.pom.TaskListpage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass
{

	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("Create Customer",true);
		FileLib f=new FileLib();
		String expectedcust = f.getExcelData("createcustomerr", 1, 2);
		String custdescription = f.getExcelData("createcustomerr",1, 3);
		EnterTimeTrack e=new EnterTimeTrack(driver);
		e.setTabtask();
		TaskListpage t=new TaskListpage(driver);
		t.getAddnewbtn().click();
		t.getNewcstbtn().click();
		t.getEnterCustTbx().sendKeys(expectedcust);;
		t.getEnterCustdescr().sendKeys(custdescription);;
		t.getSelectdropDown().click();
		t.getOurCompany().click();
		t.getCreateCustBtn().click();
		Thread.sleep(4000);
		String actualcustname = t.getActualCustCreated().getText();
		Assert.assertEquals(actualcustname, expectedcust);
		
		

	}

}
