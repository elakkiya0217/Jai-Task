package com.birmingham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHT11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act = new Actions(Driver);
		Thread.sleep(3000);
        WebElement allcategory =Driver.findElement(By.xpath("(//span[text()='All'])[1]"));
		act.click().perform();
		Thread.sleep(3000);
		WebElement men = Driver.findElement(By.xpath("//a[contains(text(),'Fashion')]"));
		men.click();
		Thread.sleep(3000);
		WebElement sunglass = Driver.findElement(By.xpath("(//a[text()='Sunglasses'])[1]"));
		sunglass.click();
		
		
	}

}
