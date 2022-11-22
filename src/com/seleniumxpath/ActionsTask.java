package com.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/simple_context_menu.html";
		Driver.get(url);
		Actions act = new Actions(Driver);
		WebElement doubcl =Driver.findElement(By.xpath("//button[contains(text(),'Click Me To See Alert')]")) ;
		Thread.sleep(3000);
		act.doubleClick(doubcl).perform();
		Thread.sleep(3000);
		WebElement rteclik = Driver.findElement(By.xpath("//span[text()='right click me']"));
		Thread.sleep(3000);
		act.contextClick(rteclik).perform();
		
	
	
		
		
	}

}
