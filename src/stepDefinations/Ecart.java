package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import test.java.pageObjects.IteratorPage;
import test.java.utils.TestContextSetup;

public class Ecart {
	List<WebElement> footer;
	TestContextSetup testContextSetup;
		
	public Ecart(TestContextSetup testContextSetup, TestContextSetup a) {
		this.testContextSetup = testContextSetup;
	}
	@Given("User should be on ecart tracking page") 
	public void user_should_be_on_ecart_tracking_page() throws InterruptedException{
		
		testContextSetup.driver = new ChromeDriver();
		testContextSetup.driver.manage().window().maximize();
		testContextSetup.driver.get("https://ekartlogistics.com/");
	}
	
	@When("User insert MYSP1009831460")
	public void user_insert_tracking_num() throws InterruptedException{
		testContextSetup.driver.findElement(By.xpath("//input[@placeholder='TRACK YOUR SHIPMENT']")).sendKeys("MYSP1009831460");
	}
	@When("Clicks on search button")
    public void click()throws InterruptedException
    {
    	testContextSetup.driver.findElement(By.xpath("//button[@class='btn btn-default searchbtn']")).click();
    }
    @Then("Check weather MYSP1009831460 available on the page")
    public void heading() throws InterruptedException{
    	IteratorPage a = new IteratorPage(testContextSetup.driver);
    	a.waitFun(By.xpath("//h3[normalize-space()='MYSP1009831460']"));
    	String headingH3 = testContextSetup.driver.findElement(By.xpath("//h3[normalize-space()='MYSP1009831460']")).getText();
    	Assert.assertEquals(headingH3, "MYSP1009831460", "Text Matches");
    	testContextSetup.driver.close();
    }
}
