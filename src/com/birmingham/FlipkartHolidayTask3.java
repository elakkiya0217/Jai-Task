package com.birmingham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHolidayTask3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		WebElement cls = Driver.findElement(By.xpath("//button[text()='✕']"));
		cls.click();
		Actions act = new Actions(Driver);
		Thread.sleep(3000);
		WebElement home = Driver.findElement(By.xpath("//div[text()='Home']"));
		act.moveToElement(home).perform();
		Thread.sleep(3000);
		WebElement furniture = Driver.findElement(By.xpath("//a[text()='Work Space Furniture']"));
		furniture.click();
		Thread.sleep(3000);
		WebElement relax = Driver.findElement(By.xpath("(//img[@alt='Ottoman'])[1]"));
		act.doubleClick(relax).perform();
		Thread.sleep(3000);
		WebElement fabricpouf= Driver.findElement(By.xpath("(//a[@rel='noopener noreferrer'])[1]"));
		act.doubleClick(fabricpouf).perform();
		Thread.sleep(3000);
		WebElement adc= Driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		adc.click();
		
		
		
		
		
		
		
		
	}

}