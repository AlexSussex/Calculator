package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

	private Division division;

	@Test
	public void test() {
		division = new Division();
		int expectedValue = 10;
		int actualValue = division.divide(100, 10);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
