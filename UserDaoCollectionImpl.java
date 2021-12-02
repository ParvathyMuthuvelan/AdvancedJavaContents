package com.training.dao;

import java.util.ArrayList;
import java.util.List;

import com.training.bean.User;

public class UserDaoCollectionImpl implements UserDao {
	static List<User> usrList;

	public UserDaoCollectionImpl() {
		if (usrList == null) {
			usrList = new ArrayList<>();
			usrList.add(new User(1, "Sai", "s", "sai@gmail.com", "India", "male"));
			usrList.add(new User(2, "Minu", "M", "minu@gmail.com", "India", "female"));
		}
	}

	@Override
	public List<User> fetchUsers() {

		return usrList;
	}

	@Override
	public boolean registerUser(User user) {
		boolean result = true;
		int size = usrList.size();
		size++;
		user.setUserId(size);

		usrList.add(user);
		return result;
	}

	@Override
	public User findUser(int userId) {
		User usr = null;
		for (User u : usrList) {
			if (u.getUserId() == userId) {
				usr = u;
				break;
			}
		}
		return usr;
	}

	@Override
	public boolean updateUser(User user) {
		boolean result = true;
		int index = 0;
		int size = usrList.size();
		for (int i = 0; i < size; i++) {
			if (usrList.get(i).getUserId() == user.getUserId()) {
				user.setGender(usrList.get(i).getGender());

				index = i;
				break;
			}
		}

		usrList.set(index, user);
		return result;
	}
}
