package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class runnerFiles {

	@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions")
	public class runner extends AbstractTestNGCucumberTests {
	 
	}
	
}
