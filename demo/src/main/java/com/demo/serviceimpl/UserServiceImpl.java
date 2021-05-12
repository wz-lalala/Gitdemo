package com.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;
 
import com.demo.bean.User;
import com.demo.dao.UserDao;
import com.demo.service.UserService;
 
@Service
public class UserServiceImpl implements UserService {
	private UserDao userdao ;
   
	@Override
	public void save(User user) {
		userdao.save(user);
		
	}
	@Override
	public List<User> getUserList() {
	    return userdao.findAll();
	}
 
}