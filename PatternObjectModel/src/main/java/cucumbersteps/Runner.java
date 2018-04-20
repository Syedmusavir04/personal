package cucumbersteps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/main/java/features/DeleteLead.feature",glue= {"cucumbersteps","pages"})
public class Runner {

}