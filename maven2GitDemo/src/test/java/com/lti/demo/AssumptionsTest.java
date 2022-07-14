package com.lti.demo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
//Aditional support while executing
//a failed assumptions results in test being terminated
// when to use -- if test case failed ... do not continue further
// 100 th 
class AssumptionsTest {

	@Test
	 void testOnDev()
    {
        System.setProperty("ENV", "DEV");
        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")),AssumptionsTest::message);
        System.out.println(" continue execution");
       
    }

    @Test
    void testOnProd()
    {
        System.setProperty("ENV", "PROD");
        Assumptions.assumeTrue("PROD".equals(System.getProperty("ENV")),AssumptionsTest::message);
        System.out.println(" don't continue execution");
       
    }

    private static String message () {
        return "TEST Execution Failed :: ";
    }
	
	}


