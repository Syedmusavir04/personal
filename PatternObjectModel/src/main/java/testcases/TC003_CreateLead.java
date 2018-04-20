package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeads;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeads;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLead";
		testDescription="Creating a Lead";
		testNodes="Leads";
		category="Smoke";
		authors="Syed";
		browserName="chrome";
		dataSheetName="TC003";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String errMsg,String cname,String fname,String lname,String emailID) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads().
		clickCreateLeads()
        .typeCompanyName(cname)
        .typeFirstName(fname)
        .typeLastName(lname)
        .typeEmailID(emailID)
        .clicCreateLeadBtn().verifyFirstName();
				
	}

}
