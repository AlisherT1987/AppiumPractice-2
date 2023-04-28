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
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.APP,"https://cybertek-appium.s3.amazonaws.com/calculator.apk");
        URL url=new URL("http://localhost:4723/wd/hub");

      AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, caps);

        //launch appiumDriver

        //close the app
      //  System.out.println(driver.getTitle());
        System.out.println(driver.getDeviceTime());
        Assertions.assertEquals("android", driver.getPlatformName());
        Thread.sleep(4000);
        MobileElement clearElement= driver.findElement(MobileBy.AccessibilityId("clear"));
        System.out.println("clearElement.getText() = " + clearElement.getText());
        Assertions.assertTrue(clearElement.isDisplayed());
        driver.closeApp();

    }
}
