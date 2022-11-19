package com.section1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPrice {
	ChromeDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String productname="APPLE iPhone X (Silver, 64 GB)";
		ProductPrice pp=new ProductPrice();
		pp.launchBrowser();
		pp.search();
		Thread.sleep(2000);
		String price=pp.fetchPrice(productname);
		System.out.println(price);
		pp.closeBrowser();
	}
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\OCSM18\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	public void search()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphonex");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}

	public String fetchPrice(String productname)
	{
		String price=driver.findElement
				(By.xpath("//div[text()='"+productname+"']/../../div[2]/div[1]/div[1]/div")).getText();
		return price;
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
}







