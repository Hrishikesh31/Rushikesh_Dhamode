package stepDefinations;



import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.java.pageObjects.IteratorPage;
//import test.java.pageObjects.AutoSuggestion;
import test.java.utils.TestContextSetup;

public class LandingPage {
	public TestContextSetup testContextSetup;

	public LandingPage(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@Given("User should be on Vikamshi Landing page")
	public void user_is_on_vikamshi_landing_page() throws InterruptedException {
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.manage().window().maximize();
		testContextSetup.driver.get("https://vikamshi.com/");	
		
	}
	@When("Vikmashi logo loaded")
	public void vikmshi_logo_loaded() throws InterruptedException{
		IteratorPage a = new IteratorPage(testContextSetup.driver);
		By b1 = By.cssSelector("img.animation");
		a.waitFun(b1);
		testContextSetup.driver.findElement(b1).getTagName();
		
				
		
	}
	@Then("Close the browser")
	public void close_the_browser() throws InterruptedException{
		
		testContextSetup.driver.close();
	}
}
