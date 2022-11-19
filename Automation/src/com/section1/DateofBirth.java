package com.section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateofBirth {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\OCSM18\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("datepicker")).click();
		String month=driver.findElement(By.className("ui-datepicker-month")).getText();
		String year=driver.findElement(By.className("ui-datepicker-year")).getText();
		while(!(month.equals("March") &&  year.equals("2000")))
		{
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			month=driver.findElement(By.className("ui-datepicker-month")).getText();
			year=driver.findElement(By.className("ui-datepicker-year")).getText();
			
		}
		driver.findElement(By.linkText("20")).click();
		
}
}









