package com.webshop.service;

import com.webshop.entity.User;

public interface UserService {

	/**
	 * @param user
	 * @return
	 */
	User selectUser(User user);

	/**
	 * @param user
	 * @return
	 */
	boolean insertUser(User user);
	
}
