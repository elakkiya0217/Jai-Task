package com.seleniumxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.snapdeal.com/");
		WebElement search = Driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		search.sendKeys("home Appliances");
	    WebElement search1 = Driver.findElement(By.xpath("//span[text()='Search']"));
	    search1.click();
	    Thread.sleep(3000);
	    WebElement product = Driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
	    product.click();
	    Driver.manage().window().maximize();

		

}
}