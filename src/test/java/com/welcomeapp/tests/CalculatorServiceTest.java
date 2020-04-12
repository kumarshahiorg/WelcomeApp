package com.welcomeapp.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.welcomeapp.service.CalculatorService;
import com.welcomeapp.service.impl.CalculatorServiceImpl;

class CalculatorServiceTest {
	CalculatorService objCalc = new CalculatorServiceImpl();

	@Test
	void testSum() {
		assertEquals(20, objCalc.sum(10, 10));
	}
	@Test
	void testMultiply() {
		assertEquals(100, objCalc.multiply(10, 10));
	}
}
