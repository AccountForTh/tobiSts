package com.tobi.test;

import com.tobi.dao.DaoFactory;
import com.tobi.dao.UserDao;
import com.tobi.vo.UserVO;

public class DBConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao ud = new DaoFactory().userDao(); //���丮���
		//UserDao ud = new UserDao(new OracleConnection());
		UserVO uv = new UserVO();
//		uv.setId("kth");
//		uv.setName("taehun");
//		uv.setPw("1234");
//		try {
//			ud.add(uv);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			System.out.println("DBConnect");
			uv = ud.get("kth");
			
			System.out.println(uv.getPw());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
