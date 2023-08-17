package test.java.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AutoSuggestion {
	public WebDriver driver;
	
	public AutoSuggestion(WebDriver driver)  // Constructor for giving life to the driver
	{
		this.driver = driver;
	}
	
	
	By searchBtn = By.xpath("//div[@class='row marginR_none ']/a[2]");
	By searchLinks = By.xpath("//ul[@id='ui-id-1']/li/a");
	By heading = By.xpath("//h2");
	
	public By searchBtn()
	{
		return searchBtn;
	}
	public By searchLinksResult()
	{
		return searchLinks;
	}
	
	public By headingReturn()
	{
		return heading;
	}
	/*Assertion for comparing Heading of newly opened page*/
	public void checkHeading(String actualText, String expectedText ) {
		Assert.assertEquals(actualText, expectedText);
	}
	
	/*Method for click on the search button*/
	public void clickSearchBtn()
	{
		driver.findElement(searchBtn).click();
	}
	
	/*Method for compare required text and click on the result*/
	public void compareThroughResult(List<WebElement> searchLinks) 
	{
	for(WebElement link : searchLinks)
		{
		if(link.getText().equalsIgnoreCase("Rubber Fitness Band")) // Compare with expected link
			{
			link.click();
			break;
			}
		}
	}
	
	/*Method for sending input in the search field*/
	public void sendInput()
	{
	driver.findElement(By.cssSelector("input#searchField")).sendKeys("Rub");
	}
	
	
	/*Implicit and Explicit Waits*/
	public void waitFun(By by1)
	{
		WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by1));
	}
	/* ********************************************************* */
	public void implWait()
	{
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(20));
	}
	
}
