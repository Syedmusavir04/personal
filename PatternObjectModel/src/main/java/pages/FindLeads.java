package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeads extends ProjectMethods{
    
	public FindLeads() {
		PageFactory.initElements(driver,this);
	}	
     
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleLeadId;
    @And("Click on first lead link")
	public ViewLead clickLeadId()
	{
		
     click(eleLeadId);
     return new ViewLead();
	}

	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsBtn;
    @And("Click Find Leads Button")
	public FindLeads clickFindLeadsBtn()
	{
		click(eleFindLeadsBtn);
     return this;
	
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailIDTab;
       
	public FindLeads clickEmailIDTab()
	{
		click(eleEmailIDTab);
     return this;
	
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEmailID;
       
	public FindLeads enterEmailID(String emailID)
	{
		type(eleEmailID,emailID);
     return this;
	
	}
    
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	public FindLeads enterFirsName(String fname) {
		type(elefname, fname);
		return this;
	}
	
	
}
