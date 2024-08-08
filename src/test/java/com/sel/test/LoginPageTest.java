package com.sel.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
    @Test
    public void Test1() {
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/srctest/Executables/chromedriver_win32 (1)/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }
}
