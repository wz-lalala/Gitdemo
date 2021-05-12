package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
import com.demo.bean.BaseBean;
 
@Repository
public interface CommonDao<T extends BaseBean> extends JpaRepository<T, Long> {
 
}
