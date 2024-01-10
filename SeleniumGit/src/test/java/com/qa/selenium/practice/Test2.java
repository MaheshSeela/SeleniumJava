package com.qa.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("WebDriver.ChromeDriver", "./Resources/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://github.com/login");
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.name("login")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.id("password")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.className("header-logo")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.linkText("Forgot password?")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.partialLinkText("Create an")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.tagName("h1")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.xpath("//label[contains(text(), 'Username')]")));
				Thread.sleep(3000);
				highlight(driver, driver.findElement(By.cssSelector("input[name= 'commit']")));
				driver.close();

		system.out.println("----- Test Passed -----);
				

	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'borader:1.5px solid black; background:red')", element);
		
	}
	

}
