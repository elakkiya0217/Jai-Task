package com.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		WebElement cls = Driver.findElement(By.xpath("//button[text()='✕']"));
		cls.click();
		WebElement fas = Driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]"));
		fas.click();
		Actions act = new Actions(Driver);
		Thread.sleep(3000);
		WebElement men = Driver.findElement(By.xpath("//span[text()='Men']"));
		act.moveToElement(men).perform();
		Thread.sleep(3000);
		WebElement CShirt = Driver.findElement(By.xpath("//a[text()='Casual Shirts']"));
		CShirt.click();
		
		
	
		
	}

}
