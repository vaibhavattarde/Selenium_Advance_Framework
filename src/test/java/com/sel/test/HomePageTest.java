package com.sel.test;

import com.sel.driver.Driver;
import com.sel.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public final class HomePageTest extends BaseTest {

    private HomePageTest() //constructor -so no one can create the object
    {

    }


    @Test
    public void searchAutomationInSearchBox() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        searchBox.sendKeys("Automation", Keys.ENTER);
    }

}

