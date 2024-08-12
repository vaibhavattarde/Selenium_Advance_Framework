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

public  final class LoginPageTest extends BaseTest {

    private  LoginPageTest() //constructor -so no one can create the object
    {

    }

    @Test
    public void Test1() {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='APjFqb']")));
        element.sendKeys("Automation", Keys.ENTER);

        //DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }
}
