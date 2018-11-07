package com.oktay.testng.page;

import com.oktay.testng.constants.AmazonLoginPage_Constants;
import com.oktay.testng.util.BasePageUtil;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public class AmazonLoginPage extends BasePageUtil implements AmazonLoginPage_Constants {

	public AmazonHomePage successfulLogin() {
		setText(txtEmail, email);
		setText(txtPassword, password);
		clickElement(btnSignIn);
		Assert.assertTrue(getTitle().equals(txtHomePageTitle));
		return new AmazonHomePage();
	}

}
