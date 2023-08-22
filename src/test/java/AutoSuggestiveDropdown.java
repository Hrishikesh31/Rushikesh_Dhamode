package test.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.vikamshi.com");
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(400));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div/a[@class='animation logo pull-left margin10 marginT_only']")));
		
		driver.findElement(By.xpath("//div[@class='row marginR_none ']/a[2]")).click();
		driver.findElement(By.cssSelector("input#searchField")).sendKeys("Rub");
		Thread.sleep(2000);
		List<WebElement> searchLinks = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a")); // grab all the elements which are related to search
		Thread.sleep(5000);
		for(WebElement link : searchLinks)
		{
			if(link.getText().equalsIgnoreCase("Rubber Fitness Band")) // Compare with expected link
			{
				link.click();
				break;
			}

		}
		Thread.sleep(5000);
		//String heading = driver.findElement(By.xpath("//h2")).getText();
		//Assert.assertEquals(heading, "Health care Elastic Films and Products");
	driver.close();
	}

}
