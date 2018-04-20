package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_MergeLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Deleting a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Syed";
		browserName="chrome";
		dataSheetName="TC006";
	}



	@Test(dataProvider="fetchData")
	public void MergeLead(String uName,String pwd) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickLookupFromLead()
		.switchToSubWindow()
		.clickLeadId()
		.switchToMainWindow()
		.clickLookupToLead()
		.switchToSubWindow()
		.clickLeadId2()
		.switchToMainWindow()
		.clickMergeBtn();
		
	}

}
