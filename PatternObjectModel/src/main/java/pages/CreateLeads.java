package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods{

	public CreateLeads() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement elecname;
	@And("Enter Company Name(.*)")
	public CreateLeads typeCompanyName(String cname)
	{
     type(elecname,cname);
     return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	@And("Enter First Name(.*)")
	public CreateLeads typeFirstName(String fname)
	{
     type(elefname,fname);
     return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	@And("Enter Last Name(.*)")
	public CreateLeads typeLastName(String lname)
	{
     type(elelname,lname);
     return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmail;
	public CreateLeads typeEmailID(String emailID)
	{
     type(eleEmail,emailID);
     return this;
	}
	
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement createLeadBtn;
	
	@When("Click on Create lead button")
	public ViewLead clicCreateLeadBtn()
	{
     click(createLeadBtn);
	return new ViewLead();
	}


}
