package test.java.utils;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class TestContextSetup {
	public TestBase testBase;
	public WebDriver driver;
	
	public TestContextSetup() {
		testBase = new TestBase();
	}
}
