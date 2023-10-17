package test.java.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBySearchFieldPageObject {
	public WebDriver driver;
	
	public SearchBySearchFieldPageObject(WebDriver driver)  // Constructor for giving life to the driver
	{
		this.driver = driver;
	}
 
	By searchBtn = By.xpath("//input[@type=\"submit\"]");
	By searchField = By.xpath("//input[@aria-label=\"Search for anything\"]");
	By heading = By.xpath("//h1");
	By result = By.xpath("//span[@role='heading']/span");
	
	public By searchFieldReturn() {
		return searchField;
	}
	
	public By searchBtnReturn() {
		return searchBtn;
	}
 
	public By headingReturn() {
		return heading;
	}
	
	public By resultReturn() {
		return result;
	}
	
	/* ********************************** */

	/*click method*/
	public void clickMethod(By clickLocator)
	{
		driver.findElement(clickLocator).click();
	}
	/* sendkeys method */
	
	public void sendKeysMethod(By inputLocator, String inputText) {
		driver.findElement(inputLocator).sendKeys(inputText);
	}
	
	public String titleReturn() {
		return driver.getTitle();
	}
	
	/* get text method */
	public String getText(By textElement) {
		return driver.findElement(textElement).getText();
	}
	
	public void closeM() {
		driver.close();
	}
}