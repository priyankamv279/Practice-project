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
public class Searchbar  {
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
	
	@Test(priority = 4)
	public void searchtest(){
		System.out.println("test4 intiated:search");
		wd.get("https://www.amazon.in/");
	    wd.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
        wd.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		JavascriptExecutor js=(JavascriptExecutor) wd;
		//no of pixels move down
		js.executeScript("window.scrollBy(0,300)");
        wd.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        System.out.println("test4 completed");

	}
	
	@AfterTest
	public void  derefer() {
		System.out.println("wd closed");
		wd.close();
	}
}
