package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
	public class Servlet12 extends HttpServlet  {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
		response.setContentType("text/html");
		String name=request.getParameter("name");
		PrintWriter out = response.getWriter();
		out.println("<h1>Hello ,"+name+" welcome to my website....</h1>");
		out.println("Thank you");

       }
	}
