package cucumberoptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/features",
		glue = "com.stepdefs", 
		monochrome = true,
		dryRun = false,
        plugin  = {"pretty", "json:target/reports/jsonreport/index.json","html:target/reports/htmlreport","junit:target/reports/xmlreport.xml"}
)

public class RunCukeTest {

}