package test.java.stepDefinations;


import java.util.List;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import test.java.pageObjects.IteratorPage;
import test.java.utils.TestContextSetup;

public class IterarorExampleSteps {
	
	List<WebElement> footer;
	TestContextSetup testContextSetup;
	TestContextSetup a;
	
	public IterarorExampleSteps(TestContextSetup testContextSetup, TestContextSetup a) {
		this.testContextSetup = testContextSetup;
		this.a = a;
	}
		
	@Given("User is on Vikamshi landing page")
	public void user_is_on_vikamshi_landing_page() throws InterruptedException {
		
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.manage().window().maximize();;
		testContextSetup.driver.get("https://www.vikamshi.com");
		//testContextSetup.driver.close();		
	}
	
 	@When("User goes to footer section")
	public void user_goes_to_footer_section() {
 		IteratorPage it = new IteratorPage(testContextSetup.driver);
 		it.waitFun(it.footerBtnReturn());
 		it.clickOnFooterBtn();;
	}
	
	@Then("Click on all footer links")
	public void click_on_all_footer_links() {
		IteratorPage it = new IteratorPage(testContextSetup.driver);
		it.implWait();
		footer = testContextSetup.driver.findElements(it.footerLinksResult());
	}
	
	@Then("Grab all pages title")
	public void grab_all_pages_title() {
		IteratorPage it = new IteratorPage(testContextSetup.driver);
		it.implWait();
		it.traverseAndWindowHandler(footer);
		testContextSetup.driver.quit();
	}

}
