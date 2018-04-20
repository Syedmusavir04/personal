package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class EditLead extends ProjectMethods{

	public EditLead() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement elefname;
	@And("Edit First Name (.*)")
	public EditLead editFirstName(String fname)
	{
		type(elefname,fname);
		return new EditLead();
	}

	@FindBy(how=How.XPATH,using="//input[@value='Update']")
	private WebElement eleUpdateBtn;
	@When("Click on update lead button")
	public ViewLead clickUpdateLeadBtn()
	{
		click(eleUpdateBtn);
		return new ViewLead();
	}

}
