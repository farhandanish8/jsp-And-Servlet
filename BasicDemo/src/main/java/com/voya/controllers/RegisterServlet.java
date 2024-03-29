package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		String name = request.getParameter("employeeName");
		String city = request.getParameter("city");
		String sal = request.getParameter("salary");
		double salary = Double.parseDouble(sal);
		String mob = request.getParameter("mobile");
		long mobile = Long.parseLong(mob);
		String course= request.getParameter("course");
		String[] hobbies = request.getParameterValues("hobbies");
		
		PrintWriter writer = response.getWriter();
		writer.print("<html><body>");
		writer.print("Welcome "+name+"<br>");
		writer.print("Your city is "+city+"<br>");
		writer.print("Your salary is "+salary+"<br>");
		writer.print("Your number is "+mobile+"<br>");
		writer.print("Your course is "+course+"<br>");
		for(String hobby:hobbies) {
			writer.print("Your hobby is "+hobby+"<br>");
		}
		
		writer.print("<body></html>");
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
