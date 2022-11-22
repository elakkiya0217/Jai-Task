 package com.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.instagram.com/accounts/login/");
		System.out.println("https://www.instagram.com/accounts/login/");
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement username = Driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("elakkiya02@hotmai.com");
		WebElement password = Driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("1234@56");
		WebElement login = Driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Driver.quit();
		
		
	}

}
