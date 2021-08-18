package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "stepDepinations",
		tags = "",
		plugin = {"pretty",
				"html:target/html/Autocucumber-BDD.html",
				"json:target/json/AutoPrac-BDD.json",
				"junit:target/cucumberXML.xml",
				"rerun:target/failedrerun.txt"
		},
		dryRun = false,
		monochrome = true,
		publish = true
		)

public class TestRunner {

}
