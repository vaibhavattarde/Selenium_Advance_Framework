package com.sel.driver;

import com.sel.utils.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public final class Driver {
    private Driver() {

    }

    public static WebDriver driver;

    public static void initdriver() throws Exception {
        System.out.println(Thread.currentThread().getId() + " " + Driver.driver);
        if (Objects.isNull(DriverManager.getDriver())) {
            //System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
            WebDriver driver = new ChromeDriver();
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(ReadPropertyFile.getValue("url"));
        }
    }

    public static void quitdriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}
