package com.firstWeek;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act = new Actions(Driver);
		Thread.sleep(3000);
		WebElement cls = Driver.findElement(By.xpath("//button[text()='✕']"));
		cls.click();
		Thread.sleep(3000);
		WebElement beauty = Driver.findElement(By.xpath("//div[text()='Beauty']"));
		beauty.click();
		Thread.sleep(3000);
		WebElement tv = Driver.findElement(By.xpath("//span[contains(text(),'Appliances')]"));
		act.moveToElement(tv).perform();
		Thread.sleep(3000);
		WebElement ac = Driver.findElement(By.xpath("//a[text()='Inverter AC']"));
		ac.click();
		TakesScreenshot tk = (TakesScreenshot)Driver;
		Thread.sleep(3000);
		File source = tk.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\Screnshots\\flipkart.png");
		FileUtils.copyFile(source, target);
		
		
		
		
	}

}
