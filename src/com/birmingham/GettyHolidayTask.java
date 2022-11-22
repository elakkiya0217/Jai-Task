package com.birmingham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GettyHolidayTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.gettyimages.in/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act = new Actions(Driver);
		Thread.sleep(3000);
		WebElement edit = Driver.findElement(By.xpath("(//a[text()='EDITORIAL'])[1]"));
		edit.click();
		
		
		
		
		
		
		
	}

}
