package com.birmingham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClueHT5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://bazaar.shopclues.com/wholesale.html";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act= new Actions(Driver);
//		WebElement mobacc = Driver.findElement(By.xpath("//a[contains(text(),'Mobile & Laptop Accessories')]"));
//		act.contextClick(mobacc).perform();
		WebElement mobile = Driver.findElement(By.xpath("//a[text()='Mobiles & More']"));
		act.moveToElement(mobile).perform();
		Thread.sleep(3000);
//		WebElement popup = Driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		popup.click();
	
		
	}

}
