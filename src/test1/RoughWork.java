package test1;


//import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.TestNGException;


public class RoughWork {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\tkarunakaran\\OneDrive - Island Pacific\\Selenium\\Selenium 3.141.59_Latest\\ChromeDriver_new\\Chrome V_79\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://smartretail2:8088/ipgui/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
Properties prop=new Properties();
		
		
		
		  String EnvironmentName = prop.getProperty("Env");
		  
		  if  (EnvironmentName.equals("IPTSFILS")) { 
	     WebElement EnvFILS=
		  driver.findElement(By.xpath("//*[@id='isc_PickListMenu_0_row_1']"));
		  EnvFILS.click();
		  
		  } else  if  (EnvironmentName.equals("IPTSFILN")) { 
			     WebElement EnvFILN=
				  driver.findElement(By.xpath("//*[@id='isc_PickListMenu_0_row_4']"));
				  EnvFILN.click();
				  
		  }  else  if  (EnvironmentName.equals("IPTSFILL")) { 
			     WebElement EnvFILL=
			   		  driver.findElement(By.xpath("//*[@id='isc_PickListMenu_0_row_5']"));
			   		  EnvFILL.click();
		  }
		  
		  
		  if (EnvironmentName.equals("IPTSFILS")) {
		  
		  WebElement EnvFILS = driver.findElement(By.
		  xpath("//td[@class='pickListCellSelectedOverDark']//div[contains(text(),'v19 Major (IPMS 19.0) QA MBSL=N MC=Y Common=E 2D (')]"
		  )); EnvFILS.click(); EnvFILS.click();
		  
		  }
		  
		  if (EnvironmentName.equals("IPTSFILQ")) {
		  
		  WebElement EnvFILQ =
		  driver.findElement(By.xpath("//*[@id=\"isc_PickListMenu_0_row_4\"]/td/div"));
		  EnvFILQ.click(); }
		  
		
		 
		WebElement TxtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		TxtUserName.sendKeys("TKARUNAKAR");
	//	WebElement TxtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		//TxtPassword.sendKeys(prop.getProperty("password"));
		WebElement Environment = driver.findElement(By.xpath("//div[@id='isc_P']"));
		Environment.click();
		
		//List<WebElement> listOfEnv=driver.findElements(By.xpath("//div[@id='isc_19']"));
		//System.out.println(listOfEnv.size());
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'Purchasing')]")));
			try {
			WebElement menuPurchasing=driver.findElement(By.xpath("//td[contains(text(),'Purchasing')]"));
			menuPurchasing.click();
			} catch (WebDriverException e) {
			System.out.println("An exceptional case.");
			}
			} catch (TestNGException e) {
				System.out.println("WebDriver couldn’t locate the element");
			}
		
	/**Iterator<WebElement> itr=listOfEnv.iterator();
		while(itr.hasNext()) {
		String 	environment=itr.next().getText();
		
		if(environment.contains("(iLava's IPTSFILS)")) {
		
		}
		} *
	
/**		 for (WebElement environemts : listOfEnv) {
			String selectEnvironement = environemts.getText();
			System.out.println(selectEnvironement); 
												
			if(selectEnvironement.contains("(iLava's IPTSFILS)")) {
				Thread.sleep(5000);
				environemts.click();
				
				break; **/
				
				

			}

		 
		 }


