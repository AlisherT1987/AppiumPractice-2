package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTests {
    @Test
    public void calculatorAddTest() throws MalformedURLException, InterruptedException {
        //DesiredCapabilities


        DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability("deviceName", "Pixel 3");
        //caps.setCapability("platform", "Android");
        //caps.setCapability("platformVersion", "10.0");
        //caps.setCapability("app", "https://cybertek-appium.s3.amazonaws.com/etsy.apk");
        //caps.setCapability("adbExecTimeout", "20000");
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "Pixel 3"); desiredCapabilities.setCapability("platform", "Android"); desiredCapabilities.setCapability("platformVersion", "10.0"); desiredCapabilities.setCapability("app", "https://cybertek-appium.s3.amazonaws.com/calculator.apk"); desiredCapabilities.setCapability("adbExecTimeout", "20000");
            AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);



        //launch appiumDriver

        //close the app
      //  System.out.println(driver.getTitle());
        System.out.println(driver.getDeviceTime());
        Assertions.assertEquals("android", driver.getPlatformName());
        Thread.sleep(4000);
        MobileElement clearElement= (MobileElement) driver.findElement(MobileBy.AccessibilityId("clear"));
        System.out.println("clearElement.getText() = " + clearElement.getText());
        Assertions.assertTrue(clearElement.isDisplayed());
        driver.closeApp();

    }
}
