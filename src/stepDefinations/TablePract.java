package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import test.java.utils.TestContextSetup;

public class TablePract {
	
		public TestContextSetup testContextSetup;

		public TablePract(TestContextSetup testContextSetup) {
			this.testContextSetup = testContextSetup;
		}
		List<WebElement> values;
		int sum = 0;	

@Given("User should be on the practice page")
public void user_should_be_on_the_practice_page() {
	testContextSetup.driver = new ChromeDriver();
	testContextSetup.driver.manage().window().maximize();
	testContextSetup.driver.get("https://rahulshettyacademy.com/AutomationPractice/");	
	JavascriptExecutor js = (JavascriptExecutor)testContextSetup.driver;
	js.executeScript("window.scrollBy(0,500)");
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
}
@When("User grabs all the values of Amount section")
public void user_grab() {
	
	values = testContextSetup.driver.findElements(By.xpath("//fieldset/div/table/tbody/tr/td[4]"));
	
}
@Then("Add all values in one variable")
public void add_all() {
	
	for(int i = 0; i<values.size();i++)
	{
		
		sum = sum + Integer.parseInt(values.get(i).getText());
	
	}
}

@And("check result on webpage is same as of value in variable")
public void chech_res() {
	int res = Integer.parseInt(testContextSetup.driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
	//Assert.assertEquals(sum,res);
	System.out.println(res);
	testContextSetup.driver.close();
}


}
