package com.demo.dao;

import org.springframework.stereotype.Repository;
 
import com.demo.bean.User;
 
@Repository
public interface UserDao extends CommonDao<User> {
 
}
