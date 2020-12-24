package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@WebServlet(name="hello",urlPatterns={"/Servlet0"})
public class Servlet11 extends HttpServlet  {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	response.setContentType("text/html");
	String name=request.getParameter("name");
	PrintWriter out = response.getWriter();
	out.println("<h1>Hello ,"+name+" welcome to my website....</h1>");
	out.println("<h1><a href='Servlet12'>Go to Servlet2 </a></h1>");
	/*RequestDispatcher rd=request.getRequestDispatcher("servlet2");
	 rd.forward(request,response);*/

     }
  }
