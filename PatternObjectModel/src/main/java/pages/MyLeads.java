package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	@And("Click Create Lead")
	public CreateLeads clickCreateLeads()
	{
		click(eleCreateLead);
		return new CreateLeads();
	}


	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeads;
   @And("Click on Find Leads Link")
	public FindLeads clickFindLeads()
	{
		click(eleFindLeads);
		return new FindLeads();

	}
	
	@FindBy(how=How.XPATH,using="//a[@href='/crmsfa/control/mergeLeadsForm']")
	private WebElement eleMergeLeads;

	public MergeLeads clickMergeLeads()
	{
		click(eleMergeLeads);
		return new MergeLeads();

	}
}