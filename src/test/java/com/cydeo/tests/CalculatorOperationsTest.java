package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorOperationsTest {
    AppiumDriver<MobileElement>driver;
    DesiredCapabilities caps=new DesiredCapabilities();
    @BeforeEach
    public void setUp() throws MalformedURLException {
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.APP,"https://cybertek-appium.s3.amazonaws.com/calculator.apk");
        URL url=new URL("http://localhost:4723/wd/hub");

         driver = new AndroidDriver<MobileElement>(url,caps);
    }
    @Test
    public void addTest(){
        MobileElement numberFour=driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        numberFour.click();
        MobileElement plus=driver.findElement(MobileBy.AccessibilityId("plus"));
        plus.click();
        MobileElement numberFive=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        numberFive.click();
        MobileElement equalOperator=driver.findElement(MobileBy.AccessibilityId("equals"));
        equalOperator.click();
        MobileElement result=driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());
        Assertions.assertEquals("9", result.getText());


    }
    @Test
    public void addTest2(){
        MobileElement numberOne=driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        numberOne.click();
        MobileElement numberFive=driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        numberFive.click();
        MobileElement divide=driver.findElement(MobileBy.AccessibilityId("divide"));
        divide.click();
        MobileElement numberThree=driver.findElement(By.id("com.google.android.calculator:id/digit_3"));
        numberThree.click();
        MobileElement equalOperator=driver.findElement(MobileBy.AccessibilityId("equals"));
        equalOperator.click();
        MobileElement result=driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());
        Assertions.assertEquals("5", result.getText());


    }
    @AfterEach
    public  void cleanUp(){
        driver.closeApp();
    }
}
