package com.demo.service;

import java.util.List;

import com.demo.bean.User;
 
public interface UserService {
 
	/**
	 * 保存用户对象
	 * @param user
	 */
	void save(User user);
	/**
	 * 获取所有用户对象
	 * @return
	 */
	List<User> getUserList();
}