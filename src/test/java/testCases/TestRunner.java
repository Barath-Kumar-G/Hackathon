package testCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(
		features= {"C:\\Users\\Barath\\eclipse-workspace\\Hackathon\\src\\test\\resources\\FeatureFiles\\Feature.feature"},
			glue="stepDefinitions",
			plugin= {"pretty",
					"html:reports/myCucumberReport.html",
					"rerun:target/rerun.txt",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
			)

public class TestRunner {

}
