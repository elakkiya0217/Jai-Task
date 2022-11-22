package com.birmingham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.interactions.Actions;

public class SnapDealHT9 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.snapdeal.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act =new Actions(Driver);
		Thread.sleep(3000);
		WebElement womenfashion = Driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		act.moveToElement(womenfashion).perform();
		Thread.sleep(3000);
		WebElement heels = Driver.findElement(By.xpath("//span[text()='Heels']"));
		heels.click();
			
		
	}

}
