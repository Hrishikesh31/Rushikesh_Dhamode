import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vikamshi.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[src*='search-ico-36.png']")).click();
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
		String heading = driver.findElement(By.xpath("//h2")).getText();
		Assert.assertEquals(heading, "Health care Elastic Films and Products");
	driver.close();
	}

}
