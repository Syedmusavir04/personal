package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_DeleteLead extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_DeleteLead";
		testDescription="Deleting a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Syed";
		browserName="chrome";
		dataSheetName="TC005";
	}



	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String fname) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.enterFirsName(fname)
		.clickFindLeadsBtn()
		.clickLeadId()
		.clickDeleteBtn();

	}

}
