package testrunner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)

@CucumberOptions(
		features={"/Users/pdube/ECLIPSE/eclipse-workspace/DS-ALGO_Cucumber/src/test/resources/Features",},
		glue ={"stepdefinition"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","json:target/target/Cucumber.json",
				"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"pretty","html:target/dsAlgoReport.html",
				"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",}
		)

public class Testrunner extends AbstractTestNGCucumberTests{
			
			@Override
			@DataProvider(parallel = false)
			public Object[][] scenarios() {

				return super.scenarios();
			}

}
