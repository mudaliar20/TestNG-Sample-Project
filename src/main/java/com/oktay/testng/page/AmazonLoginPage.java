package com.oktay.testng.page;

import com.oktay.testng.constants.AmazonLoginPage_Constants;
import com.oktay.testng.util.BasePageUtil;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public class AmazonLoginPage extends BasePageUtil implements AmazonLoginPage_Constants {

	public AmazonLoginPage(WebDriver driver) {
		super(driver);
	}

	public AmazonHomePage successfulLogin() {
		setText(txtEmail, validEmail);
		setText(txtPassword, validPassword);
		clickElement(btnSignIn);
		Assert.assertTrue(getTitle().equals(txtHomePageTitle));
		return new AmazonHomePage(driver);
	}

	public AmazonHomePage unsuccessfulLogin() {
		setText(txtEmail, invalidEmail);
		setText(txtPassword, invalidPassword);
		clickElement(btnSignIn);
		Assert.assertTrue(getTitle().equals(txtHomePageTitle));
		return new AmazonHomePage(driver);
	}

}
