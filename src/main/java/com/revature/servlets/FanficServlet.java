package com.revature.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.model.Fanfic;
import com.revature.services.FanficService;

public class FanficServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FanficService fanficService = new FanficService();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.write(fanficService.getAllFanfics().toString());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String body = request.getParameter("body");
		
		Fanfic newFanfic = new Fanfic(Integer.parseInt(id), title, body);
		fanficService.insertFanfic(newFanfic);
	}

}
