package com.testngProject.calculator;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;

public class TestNgMain {

	public static void main(String[] args) {
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testSuite = new TestNG();
		
		testSuite.setTestClasses(new Class[] { com.testngProject.calculator.AppTest.class });
		testSuite.addListener(tla);
		testSuite.setDefaultSuiteName("Calculator");
		testSuite.setDefaultTestName("testCalculator");
		testSuite.setOutputDirectory("C:\\Users\\Nirbhay_Verma\\eclipse-workspace\\calculator\\src\\test\\java\\com\\testngProject\\calculator\\test-output");
		testSuite.run();
	}
}
