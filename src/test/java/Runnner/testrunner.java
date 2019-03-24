package Runnner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features/taggedhook.feature", glue = { "com.facebook.testcase" }, format = {
		"pretty", "html:test-output", "json:Json_output/cumcumber.json",
		"junit:test-output/junitreports/cucumber.xml" }, dryRun = false, monochrome = true, strict = true)
public class testrunner {

}

// @RunWith(Cucumber.class)
// @CucumberOptions(features = "src/test/java/Features/test.feature", glue = {
// "com.facebook.testcase" }, format = {
// "pretty", "html:test-output", "json:Json_output/cumcumber.json",
// "junit:test-output/junitreports/cucumber.xml" }, dryRun = false, monochrome =
// true, strict = true,tags = {"@smoketest","@E2E"})