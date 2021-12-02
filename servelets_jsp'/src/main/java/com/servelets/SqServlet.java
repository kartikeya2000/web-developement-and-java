package com.servelets;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/sq")

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	        
	{
		int k = 0;
		 Cookie cookies[] = req.getCookies();//cookie array
		 
		 
		 for(Cookie c: cookies)
		 { 
			 
			 if(c.getName().equals("k"))
				  k = Integer.parseInt(c.getValue());
			 
		 }
		 
		  k = k*k;
		 
		 
            PrintWriter out = res.getWriter();
	        out.println( "this is the square: "+ k);
    }
}