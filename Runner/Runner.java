package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"./src/test/java"},
		glue = "stepDefination",
		
		dryRun = false,
		monochrome=true,
		plugin= {
				"pretty"
		}
		)
public class Runner extends AbstractTestNGCucumberTests {
	
	
	
}

