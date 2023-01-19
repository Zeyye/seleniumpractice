package com.neotech.com01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	public static void main(String[] args) throws InterruptedException {

		System.getProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String url = "https://www.instagram.com/";

		// driver.get(url);

		driver.navigate().to(url);// ----> these two are the same

		Thread.sleep(3000);

		driver.manage().window().maximize();

		driver.manage().window().minimize();

		Thread.sleep(2000);

		driver.manage().window().maximize();

		String foxNews = "https://www.foxnews.com";

		driver.navigate().to(foxNews);

		Thread.sleep(500);

		String fifa = "https://www.fifa.com";

		driver.navigate().to(fifa);

		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);

		driver.navigate().back();

		driver.navigate().back();

		System.out.println(driver.getTitle());

		driver.quit();

	}

}
