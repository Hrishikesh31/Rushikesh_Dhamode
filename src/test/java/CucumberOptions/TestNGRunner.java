package test.java.CucumberOptions;

//import org.testng.annotations.DataProvider;

//import cucumberOptions.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/features",
		glue = "stepDefinations",
		monochrome=true,
		tags="@tag1",
		plugin = {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		
		
)
public class TestNGRunner extends AbstractTestNGCucumberTests{


}