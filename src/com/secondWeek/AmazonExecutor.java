package com.secondWeek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonExecutor {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver =  new ChromeDriver();
		String url = "https://www.facebook.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)Driver;
		WebElement user = Driver.findElement(By.xpath("//input[@name='email']"));
		js.executeScript("arguments[0].setAttribute('value','elakkiya')",user);
		WebElement pass = Driver.findElement(By.xpath("//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','123456987')",pass);
		Thread.sleep(3000);
		Object b = js.executeScript("return arguments[0].getAttribute('type')",pass);
		System.out.println(b);
		WebElement login = Driver.findElement(By.xpath("//button[@name='login']"));
		js.executeScript("arguments[0].click()",login);
		
	}

}
