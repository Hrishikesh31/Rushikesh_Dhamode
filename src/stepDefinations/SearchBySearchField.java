 package stepDefinations;

import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.java.pageObjects.SearchBySearchFieldPageObject;
import utils.TestContextSetup;


public class SearchBySearchField{
		TestContextSetup testContextSetup;
		public SearchBySearchFieldPageObject sBC;
		
		public SearchBySearchField(TestContextSetup testContextSetup) {
			this.testContextSetup=testContextSetup;
			this.sBC =testContextSetup.pageObjectManager.SearchBySearchFieldPage();
		}
	
@Given("User is on ebay.com_ page")
public void user_is_on_ebay_com_page() throws InterruptedException, IOException{
	  
	Assert.assertTrue(sBC.titleReturn().contains("eBay"));
	    
	}
@When("User Search using search bar")
public void user_search_using_search_bar() throws InterruptedException, IOException{
	    
		sBC.sendKeysMethod(sBC.searchFieldReturn(), "MacBook");   
	}

@When("clicks on search")
public void clicks_on_search() throws InterruptedException, IOException{
	   
		sBC.clickMethod(sBC.searchBtnReturn());
	}
	
@Then("page loads completely")
public void page_loads_completely() throws InterruptedException, IOException{
	    
		String heading = sBC.getText(sBC.headingReturn());
		assertTrue(heading.contains("MacBook"));
	
	    
	}
@Then("Verify result")
public void verify_result() throws InterruptedException, IOException{
	   
		String result = sBC.getText(sBC.resultReturn());
		assertTrue((result.toLowerCase()).contains("macbook"));
		
	}

	
	
}