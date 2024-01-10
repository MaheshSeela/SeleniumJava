package com.qa.selenium.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException  {
		System.out.println("----- Test Started -----");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//textarea[contains(@class,'gLFyf')]"));
		search.sendKeys("Selenium Java");
		search.submit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(d ->d.findElement(By.xpath("//div[contains(@class, 'hdtb-mitem hdtb-msel')]"))).isDisplayed();
		driver.quit();
		System.out.println("----Test Passed----");
		
		
	}

}
