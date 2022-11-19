package automation.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automation.genericLib.BaseClass;
import automation.genericLib.CommonUtility;

public class DropDownHandling extends BaseClass{
	@Test
	public void generalSettings()
	{
		driver.findElement(By.className("popup_menu_button_settings")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Manage system settings')]/..")).click();
		WebElement topgroupinglevel=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
		CommonUtility cu=new CommonUtility();
		cu.getSelectByVisibleText(topgroupinglevel,"Product");
		String msg=driver.findElement(By.id("FormModifiedTextCell")).getText();
		System.out.println(msg);
	}

}
