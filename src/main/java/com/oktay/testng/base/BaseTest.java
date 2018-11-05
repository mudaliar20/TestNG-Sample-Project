package com.oktay.testng.base;

import com.oktay.testng.constants.General_Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public class BaseTest implements General_Constants {

	public WebDriver driver;

	@BeforeTest
	public void setup() {
		System.setProperty(DRIVER_NAME, DRIVER_PATH);

		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.navigate().to(URL_AMAZON);
	}

}
