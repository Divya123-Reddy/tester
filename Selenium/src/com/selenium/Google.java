package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\daleppagari.divya\\Downloads\\edgedriver_win64\\New folder\\\\msedgedriver.exe");
		 
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
//		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).click();
		
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
	String sr=	driver.switchTo().alert().getText();
	System.out.println(sr);
	driver.switchTo().alert().accept();
		

}
}