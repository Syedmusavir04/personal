package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{

	public ViewLead() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	private WebElement eleFirstName;

	public ViewLead verifyFirstName()
	{
     click(eleFirstName);
     return new ViewLead();
	}

	@FindBy(how=How.LINK_TEXT,using="Edit")
	private WebElement eleEditBtn;
    @And("Click on Edit Button")
	public EditLead clickEditBtn()
	{
     click(eleEditBtn);
     return new EditLead();
	}

	@FindBy(how=How.LINK_TEXT,using="Delete")
	private WebElement eleDeleteBtn;
    @When("Click on Delete Button")
	public MyLeads clickDeleteBtn()
	{
     click(eleDeleteBtn);
     return new MyLeads();
	}
	
	@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
	private WebElement eleDuplicateLead;

	public DuplicateLeads clickDuplicateLead()
	{
     click(eleDuplicateLead);
     return new DuplicateLeads();
	}

	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement verifyFirstName;
		public ViewLead verifyFirstName(String fname)
	{
     verifyExactText(verifyFirstName,fname);
	return this;
	}
}
