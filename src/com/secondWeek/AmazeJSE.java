package com.secondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazeJSE {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.amazon.in/";
		Driver.get(url);
		Driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		WebElement search = Driver.findElement(By.xpath("//input[@type='text']"));
		js.executeScript("arguments[0].setAttribute('value','HP Laptop')", search);
		WebElement sbar = Driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click()", sbar);
		
		
	}

}
