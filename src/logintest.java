import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class logintest {
	@Test
	public void webdrivertestie() throws InterruptedException
	{
		 
			//System.setProperty("webdriver.ie.driver","C:\\Users\\pradeep.z.kumar\\Desktop\\Personal\\training\\Selenium V3\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pradeep.z.kumar\\Desktop\\Personal\\training\\Selenium V3\\chromedriver_win32\\chromedriver.exe");		
				
					WebDriver driver;
					driver=new InternetExplorerDriver();	
					
					driver.get("https://ccn4.qa.starwoodhotels.com/ccn/#/welcome");
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
					//WebDriverWait wait =new WebDriverWait(driver, 20);
					//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("userid")));
					
					driver.findElement(By.id("btn_login")).click();
					driver.findElement(By.name("userid")).sendKeys("pradkum1");
					driver.findElement(By.name("password")).sendKeys("Annapurnama@");
					
					driver= null;
	}
}
