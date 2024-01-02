package com.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

    public static void main( String[] args ) throws InterruptedException
    {
    	//register the webdriver =>browser vendor 
        WebDriverManager.chromedriver().setup();
        //creating an object to the object
        WebDriver wd=new ChromeDriver();
        //maximize the browser
        wd.manage().window().maximize();
        
        //go to browser and open this url 
        wd.get("http://localhost:4200/login");
        //supply any data

        wd.findElement(By.id("username")).sendKeys("employee");
        wd.findElement(By.id("password")).sendKeys("admin1");

        //nav-search-submit-button
      
       wd.findElement(By.xpath("/html/body/app-root/app-login/div/form/button")).click();
        Alert alert=wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
        //close browser
        
        Thread.sleep(2000);
        wd.close();
    }

}
