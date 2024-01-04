package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	WebDriver wd=null;
	@BeforeTest
	public void intiate() {
		System.out.println("config intiated");
		//register the webdriver =>browser vendor 
				WebDriverManager.chromedriver().setup();
				//creating an object to the object
				 wd=new ChromeDriver();
				//maximize the browser
				wd.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void testurl() {
		System.out.println("test1 intiated: amazon url");
		wd.get("https://www.amazon.in/");
		System.out.println("test1 completed");

	}
	
	@AfterTest
	public void  derefer() {
		System.out.println("wd closed");
		wd.close();
	}
}
