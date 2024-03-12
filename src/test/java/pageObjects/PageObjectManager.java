package test.java.pageObjects;

import org.openqa.selenium.WebDriver;



public class PageObjectManager {

	public SearchByCategoryPageObject sBC;
	public SearchBySearchFieldPageObject sBSF;
	public WebDriver driver;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
 
	
	
	public SearchByCategoryPageObject getSearchByCategoryPage()
	{
	
	 sBC= new SearchByCategoryPageObject(driver);
	 return sBC;
	}
	
	public SearchBySearchFieldPageObject SearchBySearchFieldPage()
	{
		sBSF = new SearchBySearchFieldPageObject(driver);
		return sBSF;
	}
	
	
}
