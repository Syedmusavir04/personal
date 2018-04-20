package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeads extends ProjectMethods{

	String leadId,leadID2;
	public MergeLeads() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[1]")
	private WebElement eleLookupFromLead;
	public MergeLeads clickLookupFromLead()
	{
		click(eleLookupFromLead);
		return new MergeLeads();
	}

	public MergeLeads switchToSubWindow()
	{
		switchToWindow(1);
		return this;

	}
	
	public MergeLeads switchToMainWindow()
	{
		switchToWindow(0);
		return this;

	}

	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")
	private WebElement eleLeadId;
	public MergeLeads clickLeadId()
	{
		click(eleLeadId);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleInputLeadId;
	public void enterLeadId()
	{
		type(eleInputLeadId,leadId);

	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadBtn;
	public void clickFindLeadBtn()
	{
		click(eleFindLeadBtn);

	}


	@FindBy(how=How.XPATH,using="(//img[@alt='Lookup'])[2]")
	private WebElement eleLookupToLead;
	public MergeLeads clickLookupToLead()
	{
		click(eleLookupToLead);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//a[@class='buttonDangerous']")
	private WebElement eleMergeBtn;
	public ViewLead clickMergeBtn()
	{
		click(eleMergeBtn);
		return new ViewLead();
	}
	
	
	public MergeLeads accept()
	{
	  acceptAlert();
		return this;
	}
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")
	private WebElement eleLeadId2;
	public MergeLeads clickLeadId2()
	{
		click(eleLeadId2);
		return this;
	}

}