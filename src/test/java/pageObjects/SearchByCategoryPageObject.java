package test.java.pageObjects;

import java.util.Iterator;
import java.util.Set;

//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class SearchByCategoryPageObject {
	public WebDriver driver;

	public SearchByCategoryPageObject(WebDriver driver)
	{
		this.driver = driver;
		
	}
	 
	By hov = By.cssSelector(".vl-flyout-nav.evo ul li:nth-child(3) a[_sp='p4375194.m1379.l3250']");
    //By hov = By.cssSelector(".vl-flyout-nav.evo ul li:nth-child(3) a[_sp="p4375194.m1379.l3250"]");
	By sm = By.cssSelector("a[_sp=\'p4375194.m1379.l3251\']");
	By cps = By.xpath("//div[@class='dialog__cell']/section/ul/li[3]");
	By filter = By.xpath("//button[@aria-label='All Filters']");
	By condition = By.xpath("//div[@class='x-overlay__wrapper--left']/div/div[22]");
	By location = By.xpath("//div[@class='x-overlay__wrapper--left']/div/div[25]");
	By price = By.xpath("//div[@class='x-overlay__wrapper--left']/div/div[23]");
	By usOnly = By.xpath("//input[@value='US Only']");
	By newBtn = By.xpath("//input[@id='c3-subPanel-LH_ItemCondition_New_cbx']");
	By openBtn = By.xpath("//input[@id='c3-subPanel-LH_ItemCondition_Open%20box_cbx']");
	By minAmt = By.xpath("//input[@aria-label='Minimum Value, US Dollar']");
	By maxAmt = By.xpath("//input[@aria-label='Maximum Value, US Dollar']");
	By apply = By.xpath("//button[@aria-label='Apply']");
	By resultFilter = By.cssSelector(".b-pageheader");
	By heading = By.xpath("//h1");
	
	public By headingReturn()
	{
		return heading;
	}
	public By hoverElementReturn()
	{
		return hov;
	}
	public By smart()
	{
		return sm;
	}
	
	public By cellPhoneAndSmartPhone() {
		return cps;
	}
	
	public By filterReturn() {
	    return filter;
	}
	
	public By conditionReturn() {
	    return condition;
	}
	public By locationReturn()
	{
		return location;
	}
	
	public By applyBtnReturn()
	{
		return apply;
	}
	
	public By usOnlyReturn()
	{
		return usOnly;
	}
	
	public By newReturn() {
		return newBtn;
	}
	
	public By openReturn() {
		return openBtn;
	}
	
	public By priceReturn() {
		return price;
	}
	
	
	public By minAmtReturn()
	{
		return minAmt;
	}
	
	public By maxAmtReturn()
	{
		return maxAmt;
	}
	
	public String titleReturn() {
		return driver.getTitle();
	}
	
	
	public By filterResultReturn()
	{
		return resultFilter;
	}
	/* Window Handler Method */
	public void handler() {
		Set<String> s1 = driver.getWindowHandles();
		Iterator <String> it1 = s1.iterator(); 
		driver.switchTo().window(it1.next());
	}
	
	public void hover(By hoverLocator) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(hoverLocator)).perform();
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
	/* get text method */
	public String getText(By textElement) {
		return driver.findElement(textElement).getText();
	}
	public void closeM() {
		driver.close();
	}
	
}