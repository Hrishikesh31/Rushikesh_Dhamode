package test.java.stepDefinations;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.netty.channel.pool.FixedChannelPool.AcquireTimeoutAction;
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
		testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		testContextSetup.driver.manage().window().maximize();;
		testContextSetup.driver.get("https://www.vikamshi.com");
		Thread.sleep(5000);		
	}
	
 	@When("User goes to footer section")
	public void user_goes_to_footer_section() {
 		testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 		testContextSetup.driver.findElement(By.xpath("//div[@id='fp-nav']//ul//li[7]")).click();
		
	}
	
	@Then("Click on all footer links")
	public void click_on_all_footer_links() {
		testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		footer = testContextSetup.driver.findElements(By.xpath("//div[@class ='col-lg-3 col-md-3 col-sm-3 col-xs-12'][1]/a"));
	}
	
	@Then("Grab all pages title")
	public void grab_all_pages_title() {
		testContextSetup.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		for(int i = 0 ; i < footer.size();i++) //loop for opening all links in new tabs 
		{
			footer.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));// for opening link in new tab
		}	
			Set<String> s1 = testContextSetup.driver.getWindowHandles(); // it will grab all the windows handler and store it in set s1
			Iterator <String> it = s1.iterator(); // creating iterator
			
		while(it.hasNext()) // checks is there next tab open
			{
				testContextSetup.driver.switchTo().window(it.next()); // switch to next tab
				System.out.println(testContextSetup.driver.getTitle());
			}
		testContextSetup.driver.quit();;
	}

}
