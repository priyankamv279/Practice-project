package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddtoCart {
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
	
	@Test(priority = 5)
	public void addtocarttest(){
		System.out.println("test5 intiated: add to cart");
		wd.get("https://www.amazon.in/Apple-iPhone-13-128GB-Midnight/dp/B09G9HD6PD/ref=sr_1_1_sspa?keywords=iphone&qid=1704369697&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1#");
		JavascriptExecutor js=(JavascriptExecutor) wd;
		
		WebElement we= wd.findElement(By.linkText("Add to Cart"));
		js.executeScript("arguments[0].scrollIntoView();",we);
		we.click();
        System.out.println("test5 completed");

	}
	
	@AfterTest
	public void  derefer() {
		System.out.println("wd closed");
		wd.close();
	}
}
