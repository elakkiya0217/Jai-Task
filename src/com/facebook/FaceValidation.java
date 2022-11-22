package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceValidation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url= "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("velavan@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		
	}

}
