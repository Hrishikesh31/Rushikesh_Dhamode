package test.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookingOnAAIPageObject{
	public WebDriver driver;

	public BookingOnAAIPageObject(WebDriver driver)
	{
		this.driver = driver;
		
	}	
	
	By sourceClick = By.cssSelector("div[data-testid='source-field']");
	By sourceEdit = By.cssSelector("div[class = 'flight-search-source-feild-input'] input");
	By destinationClick = By.cssSelector("div[data-testid='source-field']");
	By destinationEdit = By.cssSelector(".flight-search-source-feild-input input");
	By grabSourceResult = By.xpath("//div[@class='recent-list-items list-group']/button");
	
	public By sourceClickReturn() {
		return sourceClick;
	}
	
	public By sourceEditReturn() {
		return sourceEdit;
	}

	public By destinationClickReturn() {
		return destinationClick;
	}


	public By destinationEditReturn() {
		return destinationEdit;
	}
	
	public By sourceResultReturn() {
		return grabSourceResult;
	}
	
	/*click method*/
	public void clickMethod(By clickLocator)
	{
		driver.findElement(clickLocator).click();
	}
	
   /* sendkeys method */
	
	public void sendKeysMethod(By inputLocator, String inputText) {
		driver.findElement(inputLocator).sendKeys(inputText);
	}
	
	// store elements in arrayList
	public void grabInList(By locator) {
		driver.findElements(locator);
	}
	
}
