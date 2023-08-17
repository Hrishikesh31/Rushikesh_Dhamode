package test.java.CucumberOptions;

//import cucumberOptions.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue = "test.java.stepDefinations",
		
		monochrome=true
		
)
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
}