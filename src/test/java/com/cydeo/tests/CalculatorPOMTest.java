package com.cydeo.tests;

import com.cydeo.pages.CalculatorPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorPOMTest {
    CalculatorPage calcPage=new CalculatorPage();
    @Test
    public void multiplyTest(){
        calcPage.clickSingleDigit(5);
        calcPage.multiply.click();
        calcPage.clickSingleDigit(8);
        calcPage.equals.click();
        System.out.println("calcPage.result.getText() = " + calcPage.result.getText());
        int expectedResult=40;
        Assertions.assertEquals(expectedResult,Integer.parseInt(calcPage.result.getText()) );

    }
}
