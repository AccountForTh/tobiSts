package com.tobi.dao;
/*
 *	팩토리 - 객체의 생성방법을 결정하고 만들어진 오브젝트를 돌려주는 역할 
 */
public class DaoFactory {
	public UserDao userDao() {
		UserDao userDao = new UserDao(this.make());
		return userDao;
	}
	
	public AccountDao accountDao() {
		AccountDao accountDao = new AccountDao();
		return accountDao;
	}
	
	public MessageDao messageDao() {
		MessageDao messageDao = new MessageDao();
		return messageDao;
	}
	
	public ConnectionMaker make() {
		return new OracleConnection();
	}
}
