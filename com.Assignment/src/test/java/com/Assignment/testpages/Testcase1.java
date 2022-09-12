package com.Assignment.testpages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Assignment.Checkoutpage;
import com.Assignment.Detailspage;
import com.Assignment.Loginpage1;
import com.Assignment.Productspage;
import com.Assignment.Signuppage;

public class Testcase1 {
	public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.edge.driver","C:\\Users\\daleppagari.divya\\Downloads\\edgedriver_win64\\New folder\\msedgedriver.exe");
			 
			WebDriver driver= new EdgeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
		
			Loginpage1 login=new Loginpage1(driver);
			Excel1 ex=new Excel1();
			Detailspage detail=login.gotoclickusername(ex.getdata().get(1),ex.getdata().get(2));
			
			
			Checkoutpage check=detail.gotoclickaddcart();
			check.gotoclickcheckout();
			
			Productspage product=check.gotoclickcheckout();
			
			
			Excel1 exe=new Excel1();
			Signuppage sign=product.gotoclickcheckoutpage(exe.getdata().get(1),exe.getdata().get(2),exe.getdata().get(3));
					
				sign.gotoclickfinish();
					
					
				
					}
}