package com.iweb.testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		FileInputStream fileInputStream = new FileInputStream("config.properties");
		Properties properties = new Properties();
		properties.load(fileInputStream);

		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("DriverLocation");
		//String dataBase = properties.getProperty("DataBase");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverLocation);
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", driverLocation);
		}
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}
