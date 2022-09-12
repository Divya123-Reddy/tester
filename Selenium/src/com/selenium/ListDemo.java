package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListDemo {
	public static void main(String[] args) {
//		System.setProperty("webdriver.edge.driver","C:\\Users\\daleppagari.divya\\Downloads\\edgedriver_win64\\New folder\\\\msedgedriver.exe");
//		WebDriver driver=new ChromeDriver();
		 List l=new ArrayList();
		 String s2="tdy";
		boolean s= l.add("divya");
		boolean s1= l.add(99);
//		 for(int i=0;i<l.size();i++) {
//			 System.out.println(l.get(i));
		 System.out.println("rfsg "+s+" "+s1+" "+s2);
		 }
		 
	}


