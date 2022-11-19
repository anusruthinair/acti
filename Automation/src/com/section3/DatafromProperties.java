package com.section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatafromProperties {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream
				("C:\\Users\\GANGA\\Documents\\OCSM18\\commondata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		String url=pobj.getProperty("Url");
		System.out.println(url);
		String un=pobj.getProperty("Username");
		System.out.println(un);
		String pwd=pobj.getProperty("Password");
		System.out.println(pwd);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GANGA\\Documents\\OCSM18\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		
	}

}






