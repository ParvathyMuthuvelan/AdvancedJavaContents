package com.training.dao;

import java.util.List;

import com.training.bean.User;

public interface UserDao {

	List<User> fetchUsers();

	boolean registerUser(User user);

	User findUser(int userId);

	boolean updateUser(User user);

}
