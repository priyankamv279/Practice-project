package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registration {
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
	
	@Test (priority = 2)
	public void registrationtest() {
		System.out.println("test2 intiated: Registration");
		wd.get("https://www.amazon.in/");
        wd.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).click();
        wd.findElement(By.id("createAccountSubmit")).click();
        wd.findElement(By.id("ap_customer_name")).sendKeys("PRIYANKA M V");
        wd.findElement(By.id("ap_phone_number")).sendKeys("9741008197");
        wd.findElement(By.id("ap_password")).sendKeys("Snake@24");
        wd.findElement(By.id("continue")).click();
		System.out.println("test2 completed");

	}
	
	@AfterTest
	public void  derefer() {
		System.out.println("wd closed");
		wd.close();
	}
}