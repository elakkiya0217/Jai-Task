package com.secondWeek;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartJSE {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.flipkart.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		JavascriptExecutor js =(JavascriptExecutor)Driver;
		WebElement cls = Driver.findElement(By.xpath("//button[text()='✕']"));
		js.executeScript("arguments[0].click()", cls);
		Thread.sleep(3000);
		WebElement search = Driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("HP Laptop");
		WebElement sbar = Driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click()", sbar);
		Thread.sleep(3000);
		WebElement hp = Driver.findElement(By.xpath("(//div[contains(text(),'HP')])[9]"));
		js.executeScript("arguments[0].click()", hp);
		String pwin = Driver.getWindowHandle();
		Set<String>cwin = Driver.getWindowHandles();
		for(String a:cwin) {
			if(!(a==pwin)) {
				Driver.switchTo().window(a);
		Thread.sleep(3000);
		WebElement address = Driver.findElement(By.xpath("//span[contains(text(),'Registered')]"));
		js.executeScript("arguments[0].scrollIntoView(true)", address);
		TakesScreenshot tk = (TakesScreenshot)Driver;
		Thread.sleep(3000);
		File source = tk.getScreenshotAs(OutputType.FILE);
		Thread.sleep(10000);
		File target = new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\Screnshots\\f5.png");
		FileUtils.copyFile(source, target);  
		Thread.sleep(10000);
		WebElement compare = Driver.findElement(By.xpath("//label[text()='Compare']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", compare);
		
	}
		
		
		
		
	}
		
		
		
		
		
		
		
	}
		

}
