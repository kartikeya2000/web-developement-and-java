package com.login.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.beans.Statement;
import java.sql.Connection;

public class Logindao {
	
	
	String url = "jdbc:mysql://loclhost:3306/navin";
    String username = "root";
    String password = "root";
	String sql = "select * from login where name=? and pass = ?";
	public boolean checkcredential(String name, String pass){
		
		try {
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1,name);
		st.setString(2,pass);
		ResultSet rs = st.executeQuery();
		if(rs.next()) {
			return true;
		}
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
		return false;
		
	}

}
