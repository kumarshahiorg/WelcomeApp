package com.welcomeapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.welcomeapp.service.CalculatorService;
import com.welcomeapp.service.WelcomeService;
import com.welcomeapp.service.impl.CalculatorServiceImpl;
import com.welcomeapp.service.impl.WelcomeServiceImpl;

/**
 * Servlet implementation class CentralController
 */
@WebServlet("/CentralController")
public class CentralController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String msg;
	private static WelcomeService objWelcomeService = new WelcomeServiceImpl();
	private static CalculatorService objCalculatorService = new CalculatorServiceImpl();

    /**
     * Default constructor. 
     */
    public CentralController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = null;
		if(request.getParameter("action")==null) action="nothing";
		else
			action = request.getParameter("action").toString().toLowerCase();
		processAction(request, response, request.getParameter("action").toString().toLowerCase());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * 
	 */
	protected void processAction(HttpServletRequest req, HttpServletResponse res, String command)  throws ServletException, IOException {
		double num1, num2, result;
		switch(command) {	
		case "sum":
			num1 = Double.parseDouble((req.getParameter("num1")));
			num2 = Double.parseDouble((req.getParameter("num2")));
			result = objCalculatorService.sum(num1, num2);
			msg = "Addition of " + num1 + " and " + num2 + " is " + Double.toString(result);
			res.getWriter().append(msg).append(req.getContextPath());
			break;
		case "multiply":
			num1 = Double.parseDouble((req.getParameter("num1")));
			num2 = Double.parseDouble((req.getParameter("num2")));
			result = 0;
			result = objCalculatorService.multiply(num1, num2);
			msg = "Multiplication of " + num1 + " and " + num2 + " is " + Double.toString(result);
			res.getWriter().append(msg).append(req.getContextPath());			
			break;
		case "welcome": msg = objWelcomeService.welcomeMessage(req.getParameter("userName"));
			res.getWriter().append(msg).append(req.getContextPath());
			break;
		case "nothing":msg = "Error Occured";
			res.getWriter().append(msg).append(req.getContextPath());
			break;
		}
	}
}
