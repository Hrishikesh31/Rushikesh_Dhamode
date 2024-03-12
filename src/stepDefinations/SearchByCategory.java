package stepDefinations;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.java.pageObjects.SearchByCategoryPageObject;
import utils.TestContextSetup;

 
public class SearchByCategory  {
	
TestContextSetup testContextSetup;
public SearchByCategoryPageObject sBC;

public SearchByCategory(TestContextSetup testContextSetup) {
	this.testContextSetup=testContextSetup;
	this.sBC =testContextSetup.pageObjectManager.getSearchByCategoryPage();
} 

@Given("User is on ebay.com page")
public void user_is_on_ebay_com_page() throws InterruptedException, IOException{
   	
		Assert.assertTrue(sBC.titleReturn().contains("eBay"));
	
}

@When("User Navigate to search by category")
public void user_navigate_to_search_by_category() throws InterruptedException, IOException{
	
	//sBC.hover(sBC.hoverElementReturn());
	//Thread.sleep(1000);
	//sBC.clickMethod(sBC.smart());
	
}

@When("Select Cell Phones & Smartphones")
public void select_cell_phones_smartphones() throws InterruptedException, IOException{
	
	
	sBC.clickMethod(sBC.cellPhoneAndSmartPhone());	
}


@Then("Click on All Filters")
public void click_on_all_filters() throws InterruptedException, IOException{
	//SearchByCategoryPageObject sBC = new SearchByCategoryPageObject(testContextSetup.driver);
	
	sBC.clickMethod(sBC.filterReturn());
	
}


@Then("Apply three filters")
public void apply_three_filters() throws InterruptedException, IOException{
	  
		
	    sBC.handler(); // windows handler
	    sBC.implWait(); // implicitly wait
	    sBC.clickMethod(sBC.conditionReturn());// click method clicks on locator
	    sBC.implWait();
	    sBC.clickMethod(sBC.newReturn());
	    sBC.clickMethod(sBC.openReturn());
	    sBC.clickMethod(sBC.priceReturn());
	    sBC.implWait();
	    sBC.sendKeysMethod(sBC.minAmtReturn(),"1000");// SendKeys Method
	    sBC.sendKeysMethod(sBC.maxAmtReturn(),"2000");
	    sBC.clickMethod(sBC.locationReturn());
	    sBC.implWait();
	    sBC.clickMethod(sBC.usOnlyReturn());
	    sBC.clickMethod(sBC.applyBtnReturn());
}


@Then("Verify that the filter applied")
public void verify_that_the_filter_applied() throws InterruptedException, IOException{
	//SearchByCategoryPageObject e1 = new SearchByCategoryPageObject(testContextSetup.driver); 
	
	sBC.implWait();
	String result = sBC.getText(sBC.filterResultReturn());
	System.out.println(result);
	assertTrue(result.contains("1000"));
	
}
}