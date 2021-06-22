package com.testngProject.calculator;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.epam.tat.module4.Calculator;

@RunWith(Parameterized.class)
public class ParameterTestsJunit {
	private Calculator calculator;
    
	 @Before                                         
	    public void setUp() throws Exception {
	        calculator = new Calculator();
	    }
    @Parameters(name = "TestSqrtMethod")
    public static Iterable<Object []> data() 
    {
        return Arrays.asList(new Object[][] { { 9.0, 3.0 }, 
                                            { 25.0, 5.0 }, 
                                            { 225.0, 15.0 }, 
                                            { 16.0, 4.0 } 
        });
    }
    private final double input;
    private final double resultExpected;
 
   
    public ParameterTestsJunit(final double input, final double result) 
    {
        this.input = input;
        this.resultExpected = result;
    }
 
    @Test
    public void testSqrt() {
        
        Assert.assertEquals(resultExpected, calculator.sqrt(input),0.1);
    }

}
