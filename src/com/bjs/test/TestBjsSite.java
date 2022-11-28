package com.bjs.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestBjsSite {
	
	@Test
	public void openBjsSite() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sijo.thomas\\bamboo-home\\local-working-dir\\MTA-SAM-JOB1\\BrowserDrivers\\chromedriver.exe");
			WebDriver driver = new  ChromeDriver();
		
			System.out.println("------------------------------------------------------------------------------------------");
			System.out.println("---------------------------------Validating BJ's logo-------------------------------------");
			driver.get("https://www.bjs.com/");
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//*[@id=\"header-margin\"]/ul/li[6]/div[1]/app-header-my-account/div/div/span/a")).click();
			System.out.println(driver.getTitle());
		
				
	}
		
	

}
