package com.testngProject.calculator;

import java.lang.reflect.Method;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

import junit.framework.Assert;

public class AppTest{
	
	private Calculator calculator;
	
	@DataProvider(name="data-provider")
	public Object[][]dataProvider(Method m){
		switch (m.getName()) {
		case "testSubValid":
			return new Object[][] {{2, 3 , -1}, {5, 7, -2}};
		}
		return null;
	}
	@BeforeTest
	public void setUp() {
		this.calculator=new Calculator();	
	}
	@AfterTest
	public void tearDown() {
		calculator=null;
	}
	
	
	@Test
	public void testSuValid() {
		double a,b,sum;
		a=2.3;
		b=7.9;
		double verifySum=a+b;
		sum=calculator.sum(a,b);
		System.out.println("Sum of two numbers is: "+sum);
		Assert.assertEquals(verifySum, sum, 0.01);
		
	}
	@Test(dataProvider="data-provider")
	public void testSubValid(double a,double b,double result) {
		double sub;
		sub=calculator.sub(a,b);
		System.out.println("Difference of two numbers is: "+sub);
		Assert.assertEquals(result, sub, 0.01);
		
	}
	@Test
	public void testMulValid() {
		double a,b,mul;
		a=7;
		b=8;
		double verifyMul=a*b;
		System.out.println("The thread ID for Multiplication is "+ Thread.currentThread().getId());
		mul=calculator.mult(7,8);
		System.out.print("Multiplication of two numbers is: "+mul);
		Assert.assertEquals(verifyMul, mul);
		
	}
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testDivValid() {
		long div;
		long verifyDiv=0;
		
		div=calculator.div(5,0);
		System.out.println("Sum of two numbers is: "+div);
		Assert.assertEquals(verifyDiv, div);
		
	}
	@Test
	public void testSqrtValid() {
		double sqrt;
		double verifySqrt=2.0;
		System.out.println("The thread ID for Square root is "+ Thread.currentThread().getId());
		sqrt=calculator.sqrt(4.0);
		System.out.println("Sum of two numbers is: "+sqrt);
		Assert.assertEquals(verifySqrt, sqrt);
		
	}
	@Test(groups="Trigonometric function")
	public void testSinValue() {
		double result,verifyResult;
		
		double a=30;
		verifyResult=Math.sin(a);
		result=calculator.sin(a);
		System.out.println("Sin("+a+")="+result);
		Assert.assertEquals(verifyResult, result);
	
		
	}
	
	@Test(groups="Trigonometric function")
	public void testCosValue() {
		double result,verifyResult;
		
		double a=30;
		verifyResult=Math.cos(a);
		result=calculator.cos(a);
		System.out.println("Cos("+a+")="+result);
		Assert.assertEquals(verifyResult, result,0.1);
		
	}
	@Test
	public void testNumisPositive() {
		long a=75;
		long b=-83;
		boolean check1,check2;
		check1=calculator.isPositive(a);
		check2=calculator.isPositive(b);
		Assert.assertEquals(true, check1);
		Assert.assertEquals(false, check1);
	}
	@Test
	public void testSumValid() {
		double sum;
		double verifySum=5.625;
		
		sum=calculator.sum(5/8,5);
		System.out.println("Sum of two numbers is: "+sum);
		Assert.assertEquals(verifySum, sum, 0.01);
		
	}
	@Test(groups="Trigonometric function")
	public void testTanhValue() {
		double result,verifyResult;
		
		double a=30;
		verifyResult=Math.tanh(a);
		result=calculator.ctg(a);
		System.out.println("Tanh("+a+")="+result);
		Assert.assertEquals(verifyResult, result,0.1);
		
	}
}

