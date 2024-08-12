package com.sel.test;

import com.sel.driver.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected BaseTest() {

    }

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {
        Driver.initdriver();
    }

    @AfterMethod
    public void TearDown() {
        Driver.quitdriver();
    }

}
