package com.tobi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OracleConnection implements ConnectionMaker{
	@Override
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String user = "hr";
		String pw = "credit";
		String connURL = "jdbc:oracle:thin:@192.168.0.3:1521:orcl";
		Connection conn = null;
		PreparedStatement ps;
		try {
			//1. driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2. connetion
			conn = DriverManager.getConnection(connURL, user, pw);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}
