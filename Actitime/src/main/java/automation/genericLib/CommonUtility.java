package automation.genericLib;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonUtility {
	
	public int getRandomNumber(int n)
	{
		Random r=new Random();
		int num=r.nextInt(n);
		return num;
	}

	public String getAlertMsg(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		return msg;
	}
	public void getAlertCancel(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	}
	public void getSelectByVisibleText(WebElement dropdown,String visibleText)
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(visibleText);
	}
}










