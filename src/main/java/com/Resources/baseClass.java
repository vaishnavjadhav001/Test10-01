package com.Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class baseClass {
	public WebDriver driver;
	public Properties prop;

	public void intializeDriver() throws IOException {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\Resources\\data.properties");
		prop =new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			 driver = new FirefoxDriver();
		}
		
		
	}
	@BeforeClass
	public void Launchbrowser() throws IOException {
		intializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	public String generateRandomEmail() {
		return System.currentTimeMillis()+"@gmail.com";
	}
}
