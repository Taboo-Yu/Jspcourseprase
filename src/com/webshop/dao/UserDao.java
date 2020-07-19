package com.webshop.dao;

import java.util.List;

import com.webshop.entity.User;

public interface UserDao {
	
	public boolean insertUser(User user);
	
	public boolean updateUser(User user);
	
	public boolean updateUserAgile(User user);

	public User selectUser(User user);

	public List<User> selectAllUser();

	public boolean deleteUserByUserId(String userId);

	public User selectUserById(String userId);

	public User selectUserByIdAndPass(String userId, String password);
	
}
