package com.oktay.testng.test;

import com.oktay.testng.base.BaseTest;
import com.oktay.testng.base.TestListener;
import com.oktay.testng.page.AmazonHomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
 *  Created by oktayuyar on 2.11.2018
 */
@Listeners({ TestListener.class })
public class LoginTest extends BaseTest {

    @Test
    public void SuccessfulLoginTest() {
        System.out.println("Successful Login Test");

        new AmazonHomePage(driver)
                .callLoginPage()
                .successfulLogin();
    }

    @Test
    public void UnsuccessfulLoginTest() {
        System.out.println("Unsuccessful Login Test");

        new AmazonHomePage(driver)
                .callLoginPage()
                .unsuccessfulLogin();
    }

}


