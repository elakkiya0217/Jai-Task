package com.birmingham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonCombinedHT1213 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act = new Actions(Driver);
		Thread.sleep(3000);
		WebElement accounts = Driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		act.moveToElement(accounts).perform();
		Thread.sleep(3000);
		WebElement Start = Driver.findElement(By.xpath("//script[contains(text(),'ACCORDION')]"));
		Start.click();
		
	
		
	}

}
