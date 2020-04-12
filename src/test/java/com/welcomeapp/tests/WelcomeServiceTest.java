package com.welcomeapp.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.welcomeapp.service.WelcomeService;
import com.welcomeapp.service.impl.WelcomeServiceImpl;

class WelcomeServiceTest {
	WelcomeService objWelcome = new WelcomeServiceImpl();

	@Test
	void testWelcomeMessage() {
		assertEquals("HelloKumar, Welcome to The First Azure Java App", objWelcome.welcomeMessage("Kumar")); // TODO
	}

}
