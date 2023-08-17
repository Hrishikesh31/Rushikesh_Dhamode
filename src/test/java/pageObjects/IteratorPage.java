package test.java.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IteratorPage {
public WebDriver driver;
	
	public IteratorPage(WebDriver driver)  // Constructor for giving life to the driver
	{
		this.driver = driver;
	}
	
	
	By footerBtn = By.xpath("//div[@id='fp-nav']//ul//li[7]");
	By footerLinks =By.xpath("//div[@class ='col-lg-3 col-md-3 col-sm-3 col-xs-12'][1]/a");
	
	public By footerBtnReturn()
	{
		return footerBtn;
	}
	public By footerLinksResult()
	{
		return footerLinks;
	}
	
	/* *******************Methods********************************************/
	
	public void clickOnFooterBtn()
	{
		driver.findElement(footerBtnReturn()).click();
	}
	public void traverseAndWindowHandler(List<WebElement> footer) {
		for(int i = 0 ; i < footer.size();i++) //loop for opening all links in new tabs 
		{
			footer.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));// for opening link in new tab
		}	
			Set<String> s1 = driver.getWindowHandles(); // it will grab all the windows handler and store it in set s1
			Iterator <String> it1 = s1.iterator(); // creating iterator
			
		while(it1.hasNext()) // checks is there next tab open
			{
				driver.switchTo().window(it1.next()); // switch to next tab
				System.out.println(driver.getTitle());
			}
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
