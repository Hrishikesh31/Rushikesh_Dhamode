package test.java.stepDefinations;


import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import test.java.utils.TestContextSetup;


public class AutoSuggestionDropdown {
	//public WebDriver driver;
	List<WebElement> searchLinks;	
	TestContextSetup testContextSetup;
	
public AutoSuggestionDropdown(TestContextSetup testContextSetup) {
	this.testContextSetup = testContextSetup;
}

@Given("User is on Vikamshi_ landing page")
public void user_is_on_vikamshi_landing_page() throws InterruptedException {
	testContextSetup.driver = new ChromeDriver();
	testContextSetup.driver.manage().window().maximize();
	testContextSetup.driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	testContextSetup.driver.get("https://www.vikamshi.com");	
}
@When("User Clicks on Search button")
public void user_clicks_on_search_button() throws InterruptedException {
	//testContextSetup.driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	WebDriverWait wait = new WebDriverWait(testContextSetup.driver,java.time.Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row marginR_none ']/a[2]")));
	//Thread.sleep(1000);
	testContextSetup.driver.findElement(By.xpath("//div[@class='row marginR_none ']/a[2]")).click();
}

@And("Insert some test in search box")
public void insert_some_test_in_search_box() throws InterruptedException {
	testContextSetup.driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	testContextSetup.driver.findElement(By.cssSelector("input#searchField")).sendKeys("Rub");
}

@Then("Select the Rubber Fitness Band")
public void select_the_rubber_fitness_band() throws InterruptedException {
	testContextSetup.driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	searchLinks = testContextSetup.driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
	for(WebElement link : searchLinks)
	{
		if(link.getText().equalsIgnoreCase("Rubber Fitness Band")) // Compare with expected link
		{
			link.click();
			break;
		}

	}
}

@Then("Check wheather we have redirected to appropriate page or not")
public void check_wheather_we_have_redirected_to_appropriate_page_or_not() throws InterruptedException {
	String heading = testContextSetup.driver.findElement(By.xpath("//h2")).getText();
	Assert.assertEquals(heading, "Health care Elastic Films and Products");
	testContextSetup.driver.close();
}
}
