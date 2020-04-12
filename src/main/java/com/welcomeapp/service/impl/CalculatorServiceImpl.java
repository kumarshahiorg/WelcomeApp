package com.welcomeapp.service.impl;

import com.welcomeapp.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService{
	@Override
		public double multiply(double num1, double num2) {
			return num1*num2;
		}
	@Override
		public double sum(double num1, double num2) {
			return num1+num2;
		}
}
