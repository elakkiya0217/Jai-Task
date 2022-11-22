package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookValidation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    String url = "https://www.facebook.com/";
	    driver.get(url);
	    driver.manage().window().maximize();
	    String title =driver.getTitle();
	    System.out.println(title);
	   String curl = driver.getCurrentUrl();
	   System.out.println(curl);
	   WebElement username =driver.findElement(By.xpath("//input[@type='text']"));
	   username.sendKeys("jayakumar2242@gmail.com");
	   WebElement password = driver.findElement(By.id("pass"));
	   password.sendKeys("abcd");
	   WebElement login = driver.findElement(By.name("login"));
	   
	  login.click();
	
	}

}
