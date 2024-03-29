package com.employeeapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.employeeapp.model.Employee;


/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/empServlet")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String employeeName = request.getParameter("employeeName");
		String city = request.getParameter("city");
		String empId = request.getParameter("employeeId");
		Integer employeeId = Integer.parseInt(empId);
		double salary = Double.parseDouble(request.getParameter("salary"));
		
		Employee employee = new Employee();
		employee.setEmployeeName(employeeName);
		employee.setCity(city);
		employee.setEmployeeId(employeeId);
		employee.setSalary(salary); 
		
		request.setAttribute("employeeName", employee);
		request.setAttribute("message", "Great Day");

		HttpSession session = request.getSession();
		session.setAttribute("message1", "Welcome to EL");
		request.setAttribute("message1", "In request scope");
		RequestDispatcher dispatcher = request.getRequestDispatcher("empscript.jsp");
		dispatcher.forward(request, response);
		
		 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
