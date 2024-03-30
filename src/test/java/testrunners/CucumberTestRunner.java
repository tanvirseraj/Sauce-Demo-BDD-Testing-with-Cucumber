package testrunners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features = "src/test/java/com/cucumber/it/feature",
        glue = "com.cucumber.it.step_definitions",
        
        plugin = {
                "pretty",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "timeline:test-output-thread/"
        }

        
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests{
	 //@DataProvider(parallel = false ----run all test in one browser
	 @DataProvider(parallel = true)
     @Override
     public Object[][] scenarios() {
             return super.scenarios();
     }

}
