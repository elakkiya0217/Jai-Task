package com.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://www.snapdeal.com/";
		Driver.get(url);
		Driver.manage().window().maximize();
		WebElement a = Driver.findElement(By.xpath("(//span[contains(text(),'Fashion')])[1]"));
		Actions act = new Actions(Driver);
		act.moveToElement(a).perform();
		WebElement jac = Driver.findElement(By.xpath("//span[text()='Jackets']"));
		jac.click();
		
		

}
}