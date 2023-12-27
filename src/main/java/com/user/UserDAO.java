package com.user;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class UserDAO {
	
	static int post(User user) {
		int status = 0;
		String Query = "insert into user(u_name,username,password,mobile,gender) values (?,?,?,?,?)";
		
		Connection con;
		
		try {	
		con = DbConnection.getConnection();
		
		PreparedStatement pst = con.prepareStatement(Query);
		pst.setString(1, user.getName());
		pst.setString(2, user.getUsername());
		pst.setString(3, user.getPassword());
		pst.setLong(4, user.getMobile());
		pst.setString(5, user.getGender());
		 
		status = pst.executeUpdate();
		
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("db not connected");
		}
		
		return status;
		
	}

}
