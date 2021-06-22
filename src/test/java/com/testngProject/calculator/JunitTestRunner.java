package com.testngProject.calculator;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.ExcludeCategory(TrigonometricTests.class)
@Suite.SuiteClasses({				
  JunitTest.class, 			
})	
public class JunitTestRunner {

}
