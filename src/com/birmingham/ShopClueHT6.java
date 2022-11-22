package com.birmingham;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopClueHT6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		String url = "https://bazaar.shopclues.com/wholesale.html";
		Driver.get(url);
		Driver.manage().window().maximize();
		Actions act= new Actions(Driver);
		Thread.sleep(3000);
		WebElement Sports = Driver.findElement(By.xpath("//a[text()='Sports & More']"));
		act.moveToElement(Sports).perform();
		Thread.sleep(3000);
		WebElement WG = Driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		WG.click();
		Thread.sleep(3000);
		WebElement product = Driver.findElement(By.xpath("//span[text()='Champs Nutrition Choco Temptation USA Solac Protein No.']"));
		act.doubleClick(product).perform();


}
}