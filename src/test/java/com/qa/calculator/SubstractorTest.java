package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubstractorTest {

	private Subtractor subtractor;
	
	@Test
	public void test() {
		subtractor = new Subtractor();
		int expectedValue = 4;
		int actualValue = subtractor.subtract(6,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
