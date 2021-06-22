package com.testngProject.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.epam.tat.module4.Calculator;

import junit.framework.Assert;

public class JunitTest {
	private Calculator calculator;

    @Before                                         
    public void setUp() throws Exception {
        calculator = new Calculator();
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

    @Test
	public void testSubValid(double a,double b,double result) {
		
		result=a-b;
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
	@Test(expected = IllegalArgumentException.class)
	public void testDivValid() {
		long div;
		long verifyDiv=0;
		
		div=calculator.div(5,0);
		System.out.println("Sum of two numbers is: "+div);
		
		
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
	@Category(TrigonometricTests.class)
	@Test
	public void testSinValue() {
		double result,verifyResult;
		
		double a=30;
		verifyResult=Math.sin(a);
		result=calculator.sin(a);
		System.out.println("Sin("+a+")="+result);
		Assert.assertEquals(verifyResult, result);
	
		
	}
	@Category(TrigonometricTests.class)
	@Test
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
	@Category(TrigonometricTests.class)
	public void testTanhValue() {
		double result,verifyResult;
		
		double a=30;
		verifyResult=Math.tanh(a);
		result=calculator.ctg(a);
		System.out.println("Tanh("+a+")="+result);
		Assert.assertEquals(verifyResult, result,0.1);
		
	}

}
