package com.lti.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParamTests {
	@Disabled
	@ParameterizedTest
	@ValueSource(ints = {8,10,20,50,100})
	public void testArrays(int arg) 
	{
		System.out.println("arg:"+arg);
		Assertions.assertTrue(arg%2==0);
	}
	@ParameterizedTest(name="#{index} = {0}")
	@DisplayName("should pass all non arguments to method")
	@ValueSource(strings= {"hello","world","get1024"})
	public void testParam(String msg)
	{	
		String searchKeys = "Hello";
		
		Assertions.assertFalse(msg.contains(searchKeys));
	}
	@RepeatedTest(3)
	public void shouldRepeat()
	{
		int x=10,y=20;
		assertEquals(200,x*y);
	}
	//Junit 5 supports lambda
	
	@Test
	public void testLambda()
	{
		Integer[] intAry= {2,3,7,5,10};
		
		List<Integer> numbers= Arrays.asList(intAry);
		
		Assertions.assertAll(
				() -> assertEquals(2,numbers.get(0)) ,				
				() -> assertEquals(3,numbers.get(1)) ,
				() -> assertEquals(7,numbers.get(2)) ,
				() -> assertEquals(5,numbers.get(3)) ,
				() -> assertEquals(10,numbers.get(4)) 				
				);	
	}
//	@Disabled
//	@Test
//	void testExceptions(){
//		
//		Assertions.assertThrows(UserApp.class, () ->)
//		{
//		Integer.parseInt("One");
//	}
}
