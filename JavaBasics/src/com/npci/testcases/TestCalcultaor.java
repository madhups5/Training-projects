package com.npci.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalcultaor {
	//testing the add method
    @Test
	public void testAdd()
	{
    	Calculator calculator= new Calculator();
    	int result=calculator.add(20, 30);
    	assertEquals(50, result);
	}
    //testing the sub method
    @Test
   	public void testSubtract()
   	{
       	Calculator calculator= new Calculator();
       	int result=calculator.subtract(30, 20);
       	assertEquals(10, result);
   	}
    

}
