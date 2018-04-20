package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC004_EditLead";
		testDescription="Editing a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Syed";
		browserName="chrome";
		dataSheetName="TC004";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fname) throws InterruptedException {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickLeadId()
		.clickEditBtn()
		.editFirstName(fname)
		.clickUpdateLeadBtn();		
				
	}

}
