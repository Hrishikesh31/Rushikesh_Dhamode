
package test.java.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException {
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//resources//global.properties");
	Properties pr = new Properties();
	pr.load(fis);
	
	String browser = pr.getProperty("browser");
	switch("browser") {
	case "chrome || Chrome":
		WebDriver driver = new ChromeDriver();
	case "Firefox || firefox":
		WebDriver driver1 = new FirefoxDriver();
	case "Edge || edge":
		WebDriver driver2 = new EdgeDriver();
	default:
		System.out.println("Name Browser Error");
		
		
	}
	
	return driver;
}
	}
