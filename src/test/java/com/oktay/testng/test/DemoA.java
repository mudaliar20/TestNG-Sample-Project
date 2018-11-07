package com.oktay.testng.test;

import com.oktay.testng.base.BaseTest;
import com.oktay.testng.base.TestListener;
import com.oktay.testng.page.AmazonHomePage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/*
 *  Created by oktayuyar on 2.11.2018
 */
@Listeners(TestListener.class)
public class DemoA extends BaseTest {

    @Test(groups = {"Smoke"})
    public void demoATest() {
        System.out.println("Demo A");

        new AmazonHomePage()
                .callLoginPage()
                .successfulLogin();
    }

    @Test(groups = {"Regression"})
    public void demoBTest() {
        System.out.println("Demo B");

        new AmazonHomePage()
                .callLoginPage()
                .successfulLogin();
    }

}


