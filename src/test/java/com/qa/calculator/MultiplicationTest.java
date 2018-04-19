package com.qa.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	Multiplication multiplication;

	@Test
	public void test() {
		multiplication = new Multiplication();
		int expectedValue = 100;
		int actualValue = multiplication.multiply(10,10);
	}

}
