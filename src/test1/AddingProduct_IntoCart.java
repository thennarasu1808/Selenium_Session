package test1;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingProduct_IntoCart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		int j=0;
		String []  itemsNeeded= {"Cauliflower","Tomato","Mushroom","Beans"};
		
		List<WebElement>  allProducts=driver.findElements(By.cssSelector("h4.product-name"));
			for (int i=0;i<allProducts.size();i++) {
			
			String [] listOfProducts=allProducts.get(i).getText().split("-"); // while splitting it ll split as listOfProducts[0]- content before'-' and listOfProducts[1]-content after '-'
			String formattedName=listOfProducts[0].trim();
			
			//convert array to array list (Arrays take less memory, thats why converting into array list during runtime)
			List<String> itemList = Arrays.asList(itemsNeeded);
			
			if(itemList.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
				
				if(j==itemsNeeded.length) {
					break;
				}
				
			}
		}
		
	}

}
