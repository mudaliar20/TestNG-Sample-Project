package com.oktay.testng.constants;

import org.openqa.selenium.By;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public interface AmazonLoginPage_Constants extends General_Constants{

	public String txtHomePageTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";

	public By txtEmail = By.id("ap_email");
	public By txtPassword = By.id("ap_password");
	public By btnSignIn = By.id("signInSubmit");
}