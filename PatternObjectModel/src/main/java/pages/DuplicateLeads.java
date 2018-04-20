package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class DuplicateLeads extends ProjectMethods{

	public DuplicateLeads() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement elefname;
	public DuplicateLeads typeFirstName(String uname)
	{
     type(elefname,uname);
     return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement elelname;
	public DuplicateLeads typeLastName(String lname)
	{
     type(elelname,lname);
     return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement createLeadBtn;
	
	public ViewLead clickCreateLeadBtn()
	{
     click(createLeadBtn);
	return new ViewLead();
	}

	
}