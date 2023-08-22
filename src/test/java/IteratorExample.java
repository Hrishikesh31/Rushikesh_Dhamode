package test.java;


import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import dev.failsafe.internal.util.Assert;
//import org.junit.*;


public class IteratorExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@id='fp-nav']//ul//li[7]")).click();
		List<WebElement> footer = driver.findElements(By.xpath("//div[@class ='col-lg-3 col-md-3 col-sm-3 col-xs-12'][1]/a")); 
		
		for(int i = 0 ; i < footer.size();i++) //loop for opening all links in new tabs 
		{
			footer.get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));// for opening link in new tab
		}	
			Set<String> s1 = driver.getWindowHandles(); // it will grab all the windows handler and store it in set s1
			Iterator <String> it = s1.iterator(); // creating iterator
			
		while(it.hasNext()) // checks is there next tab open
			{
				driver.switchTo().window(it.next()); // switch to next tab
				System.out.println(driver.getTitle());
			}
		
		
		driver.close();

	}
}

