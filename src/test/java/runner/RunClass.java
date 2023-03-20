package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\resources\\FeatureFile",
		glue= {"StepDefinition"},
		plugin= {"json:target/cucumber.json"})
//		glue= {"StepDefinition"},
//		plugin = { "html:target/cucumber-reports/Cucumber.html","json:target/cucumber.json"},
//		monochrome = true
//		)
	
public class RunClass {

}
