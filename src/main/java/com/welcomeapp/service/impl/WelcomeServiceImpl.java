package com.welcomeapp.service.impl;

import com.welcomeapp.service.WelcomeService;

public class WelcomeServiceImpl implements WelcomeService{
	@Override
	public String welcomeMessage(String name) {
		return "Hello " + name + ", Welcome to The First Azure Java App";
	}
}
