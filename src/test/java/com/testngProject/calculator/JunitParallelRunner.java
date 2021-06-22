package com.testngProject.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;

import com.epam.tat.module4.Calculator;

import junit.framework.Assert;

public class JunitParallelRunner {
	@Test
	public void runAllTests() {
		Class[] classes = { ParallelTest1.class, ParallelTest2.class };


		JUnitCore.runClasses(new ParallelComputer(true, true), classes);
	}
	public static class ParallelTest1 {
		private Calculator calculator;

		@Before                                         
		public void setUp() throws Exception {
			calculator = new Calculator();
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
			
		}

		@Test
		public void test1b() {
			System.out.println("Nirbhay1");
			long threadId = Thread.currentThread().getId();
			System.out.println("I am thread " + threadId );
		}
	}
	public static class ParallelTest2 {
		private Calculator calculator;

		@Before                                         
		public void setUp() throws Exception {
			calculator = new Calculator();
		}
		@Test
		public void testMulValid() {
			double a,b,mul;
			a=7;
			b=8;
			double verifyMul=a*b;
			System.out.println("The thread ID for Multiplication is "+ Thread.currentThread().getId());
			mul=calculator.mult(9,10);
			System.out.print("Multiplication of two numbers is: "+mul);
			
		}

		@Test
		public void test2b() {
			System.out.println("Nirbhay3");
			long threadId = Thread.currentThread().getId();
			System.out.println("I am thread " + threadId );
		}
	}



}
