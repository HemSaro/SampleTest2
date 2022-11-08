package com.cts.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static WebDriver driver;

	public static void browserlaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void sendkeys(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clickdata(WebElement element) {
		element.click();
	}

	public static WebElement findElementid(String id) {
		return driver.findElement(By.id(id));
	}

	public static WebElement findElementname(String name) {
		return driver.findElement(By.name(name));
	}

}
