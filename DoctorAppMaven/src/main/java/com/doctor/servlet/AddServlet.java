package com.doctor.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    IDoctorService doctorService=new DoctorServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String doctorname= request.getParameter("doctorname");
		String speciality = request.getParameter("speciality");
		double fees = Double.parseDouble(request.getParameter("fees"));
		int ratings = Integer.parseInt(request.getParameter("ratings"));
		int experience = Integer.parseInt(request.getParameter("experience"));
		
		Doctor doctor = new Doctor();
		doctor.setDoctorName(doctorname);
		doctor.setSpeciality(speciality);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		doctor.setExperience(experience);
		
		doctorService.addDoctor(doctor);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("admin.jsp");
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
