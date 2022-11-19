package automation.testscript;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class Alertpopup extends BaseClass{
	@Test
	public void alerHandling()
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.linkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.id("name")).sendKeys("qspider");
		driver.findElement(By.xpath("//td[@id='ButtonPane']/input[2]")).click();
		CommonUtility cu=new CommonUtility();
		String msg=cu.getAlertMsg(driver);
		System.out.println(msg);
		cu.getAlertCancel(driver);
		
		}

}
