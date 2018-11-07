package com.oktay.testng.page;

import com.oktay.testng.constants.AmazonHomePage_Constants;
import com.oktay.testng.util.BasePageUtil;
import org.testng.Assert;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public class AmazonHomePage extends BasePageUtil implements AmazonHomePage_Constants {

    public AmazonLoginPage callLoginPage() {
        Assert.assertTrue(getTitle().equals(txtHomePageTitle));
        clickElement(btnLoginPage);
        Assert.assertTrue(getTitle().equals(txtLoginPageTitle));
        return new AmazonLoginPage();
    }

}
