package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC007_DuplicateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Editing a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Syed";
		browserName="chrome";
		dataSheetName="TC007";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void DuplicateLead(String uName,String pwd,String emailID,String fname,String lname) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickEmailIDTab()
	    .enterEmailID(emailID)
	    .clickFindLeadsBtn()
	    .clickLeadId()
	    .clickDuplicateLead()
	    .typeFirstName(fname)
	    .typeLastName(lname)
	    .clickCreateLeadBtn()
	    .verifyFirstName(fname);
	    
				
	}

}
