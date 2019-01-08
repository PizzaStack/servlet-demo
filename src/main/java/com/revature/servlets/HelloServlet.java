package com.revature.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = this.getInitParameter("user");
		if (request.getParameter("name") != null)
			user = request.getParameter("name");
		//String user = this.getServletContext().getInitParameter("user");
		PrintWriter output = response.getWriter();
		output.write("Hello " + user);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		PrintWriter output = response.getWriter();
		output.write("POST " + title);
	}
}
