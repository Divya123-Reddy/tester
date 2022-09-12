package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class gurulink {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\daleppagari.divya\\Downloads\\edgedriver_win64\\New folder\\\\msedgedriver.exe");
		 
		// Start Edge Session
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.guru99.com/xpath-selenium.html");
//		driver.findElement(By.)

}
}