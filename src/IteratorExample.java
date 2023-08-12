import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import dev.failsafe.internal.util.Assert;
//import org.junit.*;
import org.testng.Assert;

public class IteratorExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.vikamshi.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='fp-nav']//ul//li[7]")).click();
		List<WebElement> footer = driver.findElements(By.xpath("//div[@class = \"col-lg-3 col-md-3 col-sm-3 col-xs-12\"][1]/a")); 
		
		for(int i = 0 ; i < footer.size();i++)
		{
			footer.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
		}	
			Set<String> s1 = driver.getWindowHandles();
			Iterator <String> it = s1.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
		driver.close();

	}
}

