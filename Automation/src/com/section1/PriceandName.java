package com.section1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceandName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\OCSM18\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex",Keys.ENTER);
		List<WebElement> allproductname=driver.findElements
				(By.xpath("//div[@class='MIXNux']/following-sibling::div[1]/div[1]/div[1]"));
		for(WebElement productname:allproductname) {
			 String name=productname.getText();
			String price=driver.findElement
					(By.xpath("//div[text()='"+name+"']/../../div[2]/div[1]/div[1]/div")).getText();
			System.out.println(name+"------>"+price);
		}
	}

}









