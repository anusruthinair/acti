package automation.genericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import automation.elementRepository.LoginLocators;

public class BaseClass {
	public WebDriver driver;
	public static WebDriver listenerDriver;
	public DataUtility du=new DataUtility();
	
	@BeforeClass(alwaysRun=true)
	public void launchBrowser()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\OCSM18\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		listenerDriver=driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@BeforeMethod(alwaysRun=true)
	public void login() throws IOException
	{
		driver.get(du.getDataFromProperties("Url"));
		LoginLocators ll=new LoginLocators(driver);
		ll.loginApp(du.getDataFromProperties("Username"),du.getDataFromProperties("Password"));
	}
	@AfterMethod(alwaysRun=true)
	public void logout()
	{
	
	}
	@AfterClass(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
}







