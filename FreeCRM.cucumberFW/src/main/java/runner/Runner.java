package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/features"},
		glue = {"stepDefinitions"},
		tags =  "@tag1",
		monochrome = true,
		plugin = {"pretty", 
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml"
				},
		publish = true,
		
		dryRun = true  // It will tell which feature does not have the gluecode
		)
public class Runner {

}
