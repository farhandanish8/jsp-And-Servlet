package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDb {
	    static Connection connection;
	    public static Connection openConnection() {
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	        }catch(ClassNotFoundException e1) {
	        	e1.printStackTrace();
	        }
	        String url = "jdbc:mysql://localhost:3306/voyatraining";
	        String userName = "root";
	        String password="root";
	        try {
	        	 connection = DriverManager.getConnection(url, userName, password);
	        } catch (Exception e) {
	        	 e.printStackTrace();
	    	}
			return connection;
	    }
}
	    
