package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import cucumber.api.cli.Main;

@CucumberOptions(features="src/test/resources/features",glue= "stepDefinations",plugin= {"html:target/cucumber-reports/cucumber-html-report.html",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunFeaturesTest extends AbstractTestNGCucumberTests{

}

