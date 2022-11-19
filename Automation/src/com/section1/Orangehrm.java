package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orangehrm {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\OCSM18\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement wb=driver.findElement(By.id("username"));
		wb.sendKeys("anu");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").perform();
		act.keyUp(Keys.CONTROL).sendKeys("a").perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").perform();
		act.keyUp(Keys.CONTROL).sendKeys("c").perform();
		act.keyDown(Keys.TAB).perform();
		act.keyUp(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL).sendKeys("v").perform();
		act.keyUp(Keys.CONTROL).sendKeys("v").perform();
		
		
	

}
}