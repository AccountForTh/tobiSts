package com.tobi.test;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tobi.dao.DaoFactory;
import com.tobi.dao.UserDao;
import com.tobi.vo.UserVO;

public class UserDaoTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao ud = context.getBean("userDao", UserDao.class);
		UserVO uv = new UserVO();
		try {
			System.out.println("DBConnect");
			uv = ud.get("kth");
			
			System.out.println(uv.getPw());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
