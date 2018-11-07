package com.oktay.testng.base;

import com.oktay.testng.constants.General_Constants;
import com.oktay.testng.util.BasePageUtil;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/*
 *  Created by oktayuyar on 5.11.2018
 */
public class BaseTest implements General_Constants {

    @BeforeMethod
    public void setup() {
        System.setProperty(DRIVER_NAME, DRIVER_PATH);
        BasePageUtil.driver = new ChromeDriver();
        BasePageUtil.driver.manage().window().fullscreen();
        BasePageUtil.driver.navigate().to(URL_AMAZON);
    }

    @AfterMethod
    public void tearDown(){
        BasePageUtil.driver.quit();
    }
}
