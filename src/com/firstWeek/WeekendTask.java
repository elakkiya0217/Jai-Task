package com.firstWeek;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class WeekendTask {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement cls = Driver.findElement(By.xpath("//button[text()='✕']"));
		cls.click();
		Thread.sleep(3000);
		WebElement beauty = Driver.findElement(By.xpath("//div[text()='Beauty']"));
		beauty.click();
		Thread.sleep(3000);
		Actions act = new Actions(Driver);
		WebElement homefurniture = Driver.findElement(By.xpath("(//span[contains(text(),'Furniture')])[1]"));
		act.moveToElement(homefurniture).perform();
		Thread.sleep(3000);
		WebElement lock = Driver.findElement(By.xpath("//a[text()='Smart Door Locks']"));
		lock.click();
		Thread.sleep(3000);
		WebElement alarmlock = Driver.findElement(By.xpath("//a[contains(text(),'Sensor Alarm Lock Smart Door Lock')]"));
		alarmlock.click();
		Thread.sleep(3000);
		String pwin =  Driver.getWindowHandle();
	    Set<String> cwin = Driver.getWindowHandles();
		for(String c : cwin ) {
			if(c.equals(pwin)) {
				
			}else {
				Driver.switchTo().window(c);
			}	
			
		}
		Thread.sleep(3000);
		WebElement addkart = Driver.findElement(By.xpath("//button[text()='ADD TO CART']"));
		addkart.click();
		TakesScreenshot tk = (TakesScreenshot)Driver;
		Thread.sleep(3000);
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\Screnshots\\f1.png");
		Thread.sleep(3000);
		FileUtils.copyFile(source, target);
		
		
		
		
		
		
		
		
	}

}
