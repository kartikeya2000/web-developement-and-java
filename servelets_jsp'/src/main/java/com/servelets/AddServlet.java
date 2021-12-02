package com.servelets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/add")

public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		int i  = Integer.parseInt(req.getParameter("onenum"));
		int j = Integer.parseInt(req.getParameter("secondnum")); 
		int k = i+j;
		
		Cookie cookie = new Cookie("k",k+"");
		res.addCookie(cookie);
    
		res.sendRedirect("sq");
		
		
	}

}
