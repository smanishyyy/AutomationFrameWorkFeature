package Runnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/tagging.feature", glue = { "com.facebook.testcase" }, format = {
		"pretty", "html:test-output", "json:Json_output/cumcumber.json",
		"junit:test-output/junitreports/cucumber.xml" }, dryRun = true, monochrome = true, strict = true, tags = {
				"@smoketest", "@E2E" }

)
public class testrunner {

}
