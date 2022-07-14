package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.entity.calculator;

class calculatorTest {
	calculator c = new calculator();
//@Disabled
@Test
public void testAdd() 
{   int r= c.add(100,300);
                              //expecting , actual , optional messages
	Assertions.assertEquals(400,r,"Checked add method");
	
}
@Test
public void testAssertFalse() {
	Assertions.assertEquals("Hello", "Hello");
	Assertions.assertFalse("Vaibhav".length()==3);
	Assertions.assertTrue(10<20);
}
@Test
public void etstAssertNull()
{
	String str1 = null;
	String str2="abc";
	Assertions.assertNull(str1);
	Assertions.assertNotNull(str2);
}
@Test
public void testArrayList()
{
	ArrayList<Integer> myList = new ArrayList<Integer>();
	Assertions.assertEquals(0,myList.size());
	Assertions.assertTrue(myList.isEmpty());
	myList.add(100);
	myList.add(200);
	Assertions.assertEquals(2,myList.size());
	
	
	
}
}