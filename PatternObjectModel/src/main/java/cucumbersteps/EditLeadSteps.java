package cucumbersteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import wdMethods.ProjectMethods;

public class EditLeadSteps extends ProjectMethods{
	
	@Before
	public void before() {
		startResult();
		startTestModule("TC004_EditLead", "Editing a Lead");	
		test = startTestCase("Leads");
		test.assignCategory("Smoke");
		test.assignAuthor("Syed");
		startApp("chrome");		
	
	}
	
	@After
	public void after() {
		endResult();
		closeAllBrowsers();
	}

}
