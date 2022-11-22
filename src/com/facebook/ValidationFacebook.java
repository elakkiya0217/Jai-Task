package com.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidationFacebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumSession\\driver\\chromedriver.exe");
        WebDriver Driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        Driver.get(url);
        Driver.manage().window().maximize();
//        Driver.close();
        String Curl = Driver.getCurrentUrl();
        System.out.println(Curl);
        String title =  Driver.getTitle();
        System.out.println(title);
        WebElement username = Driver.findElement(By.id("email"));
        username.sendKeys("elakkiya02@hotmail.com");
        WebElement password = Driver.findElement(By.id("pass"));
        password.sendKeys("1234");
        WebElement login = Driver.findElement(By.name("login"));
        login.click();
        
	}

}
