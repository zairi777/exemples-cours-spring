package fr.zaroum.cours.spring.service;

import fr.zaroum.cours.spring.dao.userDao;

public class UserServiceImpl implements UserService {

	private userDao userDao;

	public void setUserDao(final userDao userDao) {
		this.userDao = userDao;
	}

}
