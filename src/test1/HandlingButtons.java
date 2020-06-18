package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Navigated to application url");
		WebElement buttonLnk = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));
		buttonLnk.click();
		System.out.println("Clicked the button link");

		// Get XY position
		WebElement getPositionBtn = driver.findElement(By.id("position"));
		Point xyPoint = getPositionBtn.getLocation();
		xyPoint.getX();
		xyPoint.getY();
		System.out.println("X value is:" + xyPoint + " " + "Y value is:" + xyPoint);

		// Find the color
		WebElement colorButton = driver.findElement(By.id("color"));
		String color = colorButton.getCssValue("background-color");
		System.out.println("Color of the butto is:" + color);
		
		//Find the Size
		WebElement sizeButton = driver.findElement(By.id("size"));
		int height=sizeButton.getSize().getHeight();
		int width= sizeButton.getSize().getWidth();
		System.out.println("Height: "+height +" / "+"Width:"+width);
	}

}
