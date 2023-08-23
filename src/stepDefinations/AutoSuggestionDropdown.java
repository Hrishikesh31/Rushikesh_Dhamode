package stepDefinations;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.java.pageObjects.AutoSuggestion;
import test.java.utils.TestContextSetup;


public class AutoSuggestionDropdown  {
	//public WebDriver driver;
	List<WebElement> searchLinks;	
	TestContextSetup testContextSetup;
	
	
	
public AutoSuggestionDropdown(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
	
}

@Given("User is on Vikamshi_ landing page")
public void user_is_on_vikamshi_landing_page() throws InterruptedException, IOException {
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//resources//global.properties");
	Properties pr = new Properties();
	pr.load(fis);
	//TestBase t = new TestBase();
	testContextSetup.driver = new ChromeDriver();
	testContextSetup.driver.manage().window().maximize();
	testContextSetup.driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	String url = pr.getProperty("url");
	testContextSetup.driver.get(url);	
}
/*@When("User Clicks on Search button")
public void user_clicks_on_search_button() throws InterruptedException {
	AutoSuggestion auto = new AutoSuggestion(testContextSetup.driver);
	auto.waitFun(auto.searchBtn());
	auto.clickSearchBtn();
}

@And("Insert some test in search box")
public void insert_some_test_in_search_box() throws InterruptedException {
	AutoSuggestion auto = new AutoSuggestion(testContextSetup.driver);
	auto.implWait();
	auto.sendInput();
}

@Then("Select the Rubber Fitness Band")
public void select_the_rubber_fitness_band() throws InterruptedException {
	AutoSuggestion auto = new AutoSuggestion(testContextSetup.driver);
	auto.implWait();
	searchLinks = testContextSetup.driver.findElements(auto.searchLinksResult());
	auto.compareThroughResult(searchLinks);
	
}*/

@Then("Check wheather we have redirected to appropriate page or not")
public void check_wheather_we_have_redirected_to_appropriate_page_or_not() throws InterruptedException {
	//AutoSuggestion auto = new AutoSuggestion(testContextSetup.driver);
	//String heading = testContextSetup.driver.findElement(auto.headingReturn()).getText();
	//auto.checkHeading(heading, "Health care Elastic Films and Products");
	testContextSetup.driver.close();
}
}
