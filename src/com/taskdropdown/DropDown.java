package com.taskdropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.opencart.com/index.php?route=account/register";
		Driver.manage().window().maximize();
		Thread.sleep(3000);
	}

}
