package com.oktay.testng.page;

import com.oktay.testng.constants.AmazonHomePage_Constants;
import com.oktay.testng.util.BasePageUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.*;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public class AmazonHomePage extends BasePageUtil implements AmazonHomePage_Constants {

    public AmazonHomePage(WebDriver driver) {
        super(driver);
    }

    public AmazonLoginPage callLoginPage() {
        assertThat(getTitle()).isEqualTo(txtHomePageTitle);
        clickElement(btnLoginPage);
        assertThat(getTitle()).isEqualTo(txtLoginPageTitle);
        takeScreenshot();
        return new AmazonLoginPage(driver);
    }

}
