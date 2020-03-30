package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "D:/FunctionalTesting/FreeCRMBDDFramework/Features/login.feature"
,glue= {"StepDefinitions"}
,monochrome = true,
format = {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
strict = true,
dryRun = false,
tags = {"@SmokeTest"})
//"D:/FunctionalTesting/FreeCRMBDDFramework/src/main/java/StepDefinitions/LoginStepDefinition.java")

public class TestRunner {

}
