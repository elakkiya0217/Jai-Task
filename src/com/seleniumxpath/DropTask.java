package com.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropTask {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/drag_drop.html";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act = new Actions(Driver);
		Thread.sleep(3000);
		WebElement drag = Driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement drop = Driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(3000);
		WebElement drag1 = Driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement drop1 = Driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(3000);
		WebElement drag2 = Driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement drop2 = Driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(drag2, drop2).perform();
		Thread.sleep(3000);
		WebElement drag3 = Driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement drop3 = Driver.findElement(By.xpath("//li[@class='placeholder']"));
		Thread.sleep(3000);
		act.dragAndDrop(drag3, drop3).perform();
		

				
	}

}
