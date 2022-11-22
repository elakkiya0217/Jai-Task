package com.setOfTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		String url = "https://www.facebook.com/";
		driver.get(url);
		driver.manage().window().maximize();
	    String title =driver.getTitle();
		System.out.println(title);
		
	}

}
