package com.oktay.testng.test;

import com.oktay.testng.base.BaseTest;
import com.oktay.testng.page.AmazonHomePage;
import org.testng.annotations.Test;

/*
 *  Created by oktayuyar on 2.11.2018
 */
public class DemoA extends BaseTest {

    @Test
    public void demoATest() {
        System.out.println("Demo A");

        new AmazonHomePage(driver)
                .callLoginPage()
                .successfulLogin();
    }

}


