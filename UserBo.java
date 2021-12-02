package com.training.bo;

import java.util.List;

import com.training.bean.User;
import com.training.dao.UserDao;
import com.training.dao.UserDaoCollectionImpl;

public class UserBo {

	public List<User> fetchUsers() {
		UserDao userDao=new UserDaoCollectionImpl();
		List<User> userList=userDao.fetchUsers();
		return userList;
	}

	public boolean registerUser(User user) {
		UserDao userDao=new UserDaoCollectionImpl();
		boolean result=userDao.registerUser(user);
		return result;
	}

	
	public User findUser(int userId) {
		UserDao userDao=new UserDaoCollectionImpl();
		User user=userDao.findUser(userId);
		return user;
	}

	public boolean updateUser(User user) {
		boolean result=true;
		UserDao userDao=new UserDaoCollectionImpl();
		result=userDao.updateUser(user);
		return result;
	}

}
