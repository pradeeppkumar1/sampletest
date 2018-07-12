import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewTest {

  @DataProvider(name="logincred")
  public Object[][] DP()
	{
		//datas
		Object[][] testdata = { {"pradeep.kumar2@starwoodhotels.com","Annapurnama@2"} ,
								//{"syed", "pass2"},
								//{"pradeep","pass3"}
							};
		
		return testdata;
		
	}
  
  /*	
@Test(dataProvider = "logincred")	
public void login(String uname, String pass)
{
	 System.out.println("User name is "+ uname + "Pass : " +pass);
		 
}

@Parameters("username")
@Test
public void paramTest(String username)
{
	System.out.println("from parameter method "+ username );
} 

@Test
public void webdrivertestchrom() 
{
	 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pradeep.z.kumar\\Desktop\\Personal\\training\\Selenium V3\\chromedriver_win32\\chromedriver.exe");		
						
				WebDriver driver;
				driver=new ChromeDriver();	
				
				driver.get("https://rally1.rallydev.com/slm/login.op");
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				driver.findElement(By.name("userid")).sendKeys("pradkum1");
				//driver.findElement(By.name("btnK"))
 
				driver= null;
}
*/	
@Test(dataProvider = "logincred")
public void webdrivertestie(String uname, String pass)
{
	 
		System.setProperty("webdriver.ie.driver","C:\\Users\\pradeep.z.kumar\\Desktop\\Personal\\training\\Selenium V3\\IEDriverServer_x64_3.12.0\\IEDriverServer.exe");		
						
				WebDriver driver;
				driver=new InternetExplorerDriver();	
				
				driver.get("https://rally1.rallydev.com/slm/login.op");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				//loginto Rally		
				driver.findElement(By.name("j_username")).sendKeys(uname);
				driver.findElement(By.name("j_password")).sendKeys(pass);
				driver.findElement(By.id("login-button")).click();
				WebDriverWait wait =new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='header-logo']")));
				//driver.findElement(((By.xpath("//div[@class='header-logo']")));
						
				driver= null;
}
//@Test
public void webdrivertestfirefox()
{
	 
		System.setProperty("webdriver.gecko.driver","C:\\Users\\pradeep.z.kumar\\Desktop\\Personal\\training\\Selenium V3\\geckodriver-v0.20.1-win64\\geckodriver.exe");		
				WebDriver driver;	
				 
				driver=new FirefoxDriver();	
				
				driver.get("http://www.hdfcbank.com/");
 
				driver= null;
}

}


