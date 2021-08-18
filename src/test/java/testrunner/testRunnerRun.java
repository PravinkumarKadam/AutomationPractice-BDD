package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@target/failedrerun.txt",
		glue = "stepDepinations", 
		plugin = {"pretty",								
				"html:targetRerun/html/htmlreport.html", 	
				"json:targetRerun/json/file.json",			
		},
		publish = true,									
		monochrome = true,								
		dryRun = false			
		)


public class testRunnerRun {

}
