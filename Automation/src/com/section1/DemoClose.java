package com.section1;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoClose {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\OCSM18\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("clock");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a",Keys.DELETE).perform();
		act.keyUp(Keys.CONTROL).perform();
		Thread.sleep(2000);
		searchbox.sendKeys("flowers");
		Thread.sleep(2000);
		searchbox.submit();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Amazon Fresh']")).click();
		System.out.println("exception handled");
		Thread.sleep(2000);
		String result=driver.findElement(By.xpath("//span[contains(text(),'results for')]/..")).getText();
		System.out.println(result);
		
		driver.close();
		
		
	}
}














