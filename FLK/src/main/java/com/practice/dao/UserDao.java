package com.practice.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.practice.entity.User;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class UserDao {
	
	    private static final String URL = "jdbc:mysql://localhost:3306/flk";
	    private static final String USER = "root";       // your MySQL username
	    private static final String PASSWORD = "root";   // your MySQL password
	    private static final String query = "INSERT INTO users(name, email, password) VALUES (?, ?, ?)";
        private final String login="select * from users where email=? and password=?";

        private static HikariDataSource ds;

        static {
            HikariConfig config = new HikariConfig();
            config.setJdbcUrl("jdbc:mysql://localhost:3306/flk");
            config.setUsername("root");
            config.setPassword("root");
            config.setMaximumPoolSize(10); // pool size
            ds = new HikariDataSource(config);
        }

        public static Connection getConnection() throws Exception {
            return ds.getConnection();
        }



	public int InsertUser(User u) throws Exception {
		Connection conn = getConnection();
		PreparedStatement prep = conn.prepareStatement(query);
		prep.setString(1, u.getName());
		prep.setString(2, u.getEmail());
		prep.setString(3, u.getPassword());
		
		int rows = prep.executeUpdate();
		conn.close();
		return rows;
		
	}


	public boolean validateUser(String email, String hashPwd) throws Exception {
		System.out.println("loggin entered");
		boolean status=false;
		Connection con=getConnection();
		PreparedStatement ps = con.prepareStatement(login);
		ps.setString(1, email);
		ps.setString(2, hashPwd);
		
		ResultSet rs=ps.executeQuery();
		
		status= rs.next();
		con.close();
		return status;
	}

}
