package com.user;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;
import java.util.TreeMap;




public class Validate {

	static boolean user;
	static ResultSet rs;
	static Boolean validateData(String username, String password)  {
		
		Map<String,String> map = new TreeMap<String,String>();
		
		Connection con = DbConnection.getConnection();
			
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery("select username,password from user");
			while(rs.next()) {
				map.put(rs.getString(1), rs.getString(2));
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		if(map.containsKey(username)) {
			if(map.get(username).equals(password)) {
				user = true;
				return user;
				
			}else {
				user = false;
				return user;
			}
		}else {
			user = false;
			System.out.println("username");
			return user;
		}	
		
	}
}
