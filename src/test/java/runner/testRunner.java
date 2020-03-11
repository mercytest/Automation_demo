package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "/demo_gmail/src/test/resources/Features/login.feature",
glue= {"stepDefinitions"},
monochrome = true,
dryRun = true

)

public class testRunner {

}