package com.oktay.testng.page;

import com.oktay.testng.constants.AmazonLoginPage_Constants;
import com.oktay.testng.util.BasePageUtil;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public class AmazonLoginPage extends BasePageUtil implements AmazonLoginPage_Constants {

	public AmazonLoginPage(WebDriver driver) {
		super(driver);
	}

	public AmazonHomePage successfulLogin() {

		setText(txtEmail, email);
		setText(txtPassword, password);
		takeScreenshot();
		clickElement(btnSignIn);
		assertThat(getTitle()).isEqualTo(txtHomePageTitle);
		return new AmazonHomePage(driver);
	}

}
