package com.neotech.com01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// System.getProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");

		// WebDriver driver = new FirefoxDriver();

		String url = "https://www.nytimes.com";// https://www.nytimes.com/games/wordle/index.html

		driver.get(url);// https://www.nytimes.com

		System.out.println(url);

		String currentUrl = driver.getCurrentUrl();

		String title = driver.getTitle();

		System.out.println("title--->" + title);

		System.out.println("current url  " + currentUrl);

		if (url.equalsIgnoreCase(currentUrl)) {
			System.out.println("Urls are the same!");
		} else {
			System.out.println("Urls are different!");
		}

		Thread.sleep(3000);

		driver.quit();

	}

}
