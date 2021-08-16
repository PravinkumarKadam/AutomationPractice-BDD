package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\Workplace\\com.automationPractice-BDD\\src\\test\\resources\\features",
		glue = "stepDepinations",
		tags = "@ValidatelogoSize",
		plugin = {"pretty",
				"html:target/html/Autocucumber-BDD.html",
				"json:target/json/AutoPrac-BDD.json"
		},
		dryRun = false,
		monochrome = true,
		publish = true
		)

public class TestRunner {

}
