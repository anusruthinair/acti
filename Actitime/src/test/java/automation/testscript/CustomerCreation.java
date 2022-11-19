package automation.testscript;

import java.io.IOException;
import java.time.Duration;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;
import automation.genericLib.DataUtility;
@Listeners(automation.genericLib.ListenerImplementation.class)
public class CustomerCreation extends BaseClass {
	@Test
	public void createCustomer() throws EncryptedDocumentException, IOException
	{
		
		CommonUtility cu=new CommonUtility();
		int num=cu.getRandomNumber(10000);
		String expcustomername=du.getDataFromExcelsheet("Sheet1",0,0);
		expcustomername=expcustomername+num;
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector(".title.ellipsis")).click();
		driver.findElement(By.className("createNewCustomer")).click();
		
		driver.findElement(By.className("newNameField")).sendKeys(expcustomername);
	driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("done");
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.textToBePresentInElementLocated
			(By.cssSelector(".titleEditButtonContainer>.title"),expcustomername));
String actualcustomername=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actualcustomername);

}
}


