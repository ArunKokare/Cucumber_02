package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
				features = "src/test/java/featureLayer"
				,glue = "stepDefinitions"
//				,tags = "@SmokeTest and @SanityTest"
//				,dryRun = true
				,monochrome = true
				,plugin = {"pretty","html:target/cucumberReport.html","json:target/cucumberreport1.json"}
				)
public class RunnerClass extends AbstractTestNGCucumberTests{

}
