package com.tobi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.tobi.vo.UserVO;

public class UserDao {
	private ConnectionMaker db = null;
	public UserDao(ConnectionMaker connectionMaker){
		this.db = connectionMaker;
	}
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public void add(UserVO userVO) throws SQLException, ClassNotFoundException{
		conn = db.getConnection();
		String query = "INSERT INTO USERS(id, name, password) values(?,?,?)";
		ps = conn.prepareStatement(query);
		ps.setString(1, userVO.getId());
		ps.setString(2, userVO.getName());
		ps.setString(3, userVO.getPw());
		
		ps.executeUpdate();
		ps.close();
		conn.close();
	}
	
	public UserVO get(String id) throws ClassNotFoundException, SQLException{
		conn=db.getConnection();
		String query = "SELECT * FROM USERS WHERE id = ?";
		ps = conn.prepareStatement(query);
		ps.setString(1, id);
		rs = ps.executeQuery();
		
		rs.next();
		UserVO userVO = new UserVO();
		userVO.setId(rs.getString("id"));
		userVO.setName(rs.getString("name"));
		userVO.setPw(rs.getString("password"));
		
		rs.close();
		ps.close();
		conn.close();
		return userVO;
	}
	
	
}
