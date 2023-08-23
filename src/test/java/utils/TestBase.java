package test.java.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	public WebDriver driver;
	public WebDriver WebDriverManager() throws IOException {
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//resources//global.properties");
	Properties pr = new Properties();
	pr.load(fis);
	
	
	
	return driver;
}
	}
