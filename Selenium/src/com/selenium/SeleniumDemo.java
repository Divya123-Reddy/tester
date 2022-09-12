package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\daleppagari.divya\\Downloads\\edgedriver_win64\\New folder\\\\msedgedriver.exe");
		 
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		
		 
		driver.get("https://intranet.attra.com/intranet/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtuser']")).sendKeys("daleppagari.divya");
		driver.findElement(By.xpath("//input[@id='txtpassword']")).sendKeys("Welcome@1608");
		 driver.findElement(By.xpath("//span[@class='checkmark']")).click();
		 
//		 JavascriptExecutor js=(JavascriptExecutor) driver;
//		 js.executeScript("")
//		 
		 
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.quit();
		
	}

}
