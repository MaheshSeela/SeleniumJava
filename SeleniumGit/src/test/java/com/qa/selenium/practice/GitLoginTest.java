package com.qa.selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class GitLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// handle the Text boxes
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		WebElement user = driver.findElement(By.xpath("//input[contains(@name, 'login')]"));
		if (user.isDisplayed()) {
			if (user.isEnabled()) {
				user.sendKeys("Mahesh");
				String usertxt = user.getAttribute("value");
				System.out.println(usertxt);
				user.clear();
				Thread.sleep(1500);
				user.sendKeys("Seela");
				Thread.sleep(1500);
				user.sendKeys("Mahesh");
			} else {
				System.out.println("username field is not enabled");
			}
		} else {
			System.out.println("username field is not displayed");
		}
		WebElement password = driver.findElement(By.xpath("//input[contains(@id, 'password')]"));
		if (password.isDisplayed()) {
			if (password.isDisplayed()) {
				password.sendKeys("Password1!");
				Thread.sleep(1000);
			}
			else {
				System.out.println("Password field is not enabled");
			}
		} else {
			System.out.println("Password field is not displayed");
		}
		WebElement signin = driver.findElement(By.xpath("//input[contains(@type, 'submit')]"));
		if (signin.isEnabled()) {
			signin.click();
		}
		String out = driver.findElement(By.xpath("//div[contains(text(), 'Incorrect username or password.')]"))
				.getText();
		Assert.assertEquals(out, "Incorrect username or password.");
		driver.quit();
		System.out.println("----- Test Passed ------");
	}
}
