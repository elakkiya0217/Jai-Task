package com.firstWeek;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FridayTask1 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe" );
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Driver.getTitle();
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cls = Driver.findElement(By.xpath("//button[text()='✕']"));
		cls.click();
		Thread.sleep(3000);
		WebElement search = Driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Apple iphone 13 pro");
		Thread.sleep(3000);
		WebElement Searchbar = Driver.findElement(By.xpath("//button[@type='submit']"));
		Searchbar.click();
		Thread.sleep(3000);
		WebElement iphone = Driver.findElement(By.xpath("(//div[contains(text(),'APPLE iPhone 13')])[1]"));
		iphone.click();
		Thread.sleep(3000);
		String pwin = Driver.getWindowHandle();
		Set<String>cwin =Driver.getWindowHandles();
		for(String a : cwin) {
			if(a.equals(pwin)) {
				
				
		}else {
			Driver.switchTo().window(a);
		}
		}
//		List<String> l = new ArrayList<>();
//		l.addAll(cwin);
//		String win = l.get(1);
//		Driver.switchTo().window(win);
//		for(String a:cwin) {
//			if(!(a==pwin)) {
//				Driver.switchTo().window(a);
//			}
//		
//		}
		Thread.sleep(4000);
		WebElement buy = Driver.findElement(By.xpath("//button[text()='BUY NOW']"));
		buy.click();
		Thread.sleep(3000);
		WebElement contin= Driver.findElement(By.xpath("//button[@type='submit']"));
		contin.click();
		String title = Driver.getTitle();
		TakesScreenshot tk = (TakesScreenshot)Driver;
		Thread.sleep(3000);
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\Screnshots\\flip.png");
		FileUtils.copyFile(source, target);
	}
		
		
		
		
	}


		
		
		



