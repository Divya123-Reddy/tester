package com.zoho.testpages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.zoho.pages.Appspage;
import com.zoho.pages.Homepage;
import com.zoho.pages.Loginpage;


public class Testcase {
	public static Logger Log=LogManager.getLogger(Testcase.class.getName());
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Users\\daleppagari.divya\\Downloads\\edgedriver_win64\\New folder\\\\msedgedriver.exe");
		 
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.zoho.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		Log.info("Logger massage");
		Log.error("Error message");
		Log.debug("Debug message");
		Log.fatal("Fatal message");
		
	Homepage homepage=new Homepage(driver);
	Loginpage login = homepage.gotoSignin();
	Excel e=new Excel();
		
		Appspage app = 	login.gotoclicklogin("daleppagari.divya@attra.com.au","Welcome@1608");
		app.gotoclickCRM();
		}
	
}


