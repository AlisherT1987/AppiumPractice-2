package com.cydeo.tests;

import com.cydeo.utils.Driver;
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

    @Test
    public void addTest(){
        MobileElement numberFour= Driver.getDriver().findElement(By.id("com.google.android.calculator:id/digit_4"));
        numberFour.click();
        MobileElement plus=Driver.getDriver().findElement(MobileBy.AccessibilityId("plus"));
        plus.click();
        MobileElement numberFive=Driver.getDriver().findElement(By.id("com.google.android.calculator:id/digit_5"));
        numberFive.click();
        MobileElement equalOperator=Driver.getDriver().findElement(MobileBy.AccessibilityId("equals"));
        equalOperator.click();
        MobileElement result=Driver.getDriver().findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());
        Assertions.assertEquals("9", result.getText());


    }
    @Test
    public void addTest2(){
        MobileElement numberOne=Driver.getDriver().findElement(By.id("com.google.android.calculator:id/digit_1"));
        numberOne.click();
        MobileElement numberFive=Driver.getDriver().findElement(By.id("com.google.android.calculator:id/digit_5"));
        numberFive.click();
        MobileElement divide=Driver.getDriver().findElement(MobileBy.AccessibilityId("divide"));
        divide.click();
        MobileElement numberThree=Driver.getDriver().findElement(By.id("com.google.android.calculator:id/digit_3"));
        numberThree.click();
        MobileElement equalOperator=Driver.getDriver().findElement(MobileBy.AccessibilityId("equals"));
        equalOperator.click();
        MobileElement result=Driver.getDriver().findElement(By.id("com.google.android.calculator:id/result_final"));
        System.out.println(result.getText());
        Assertions.assertEquals("5", result.getText());


    }
}
