package com.zl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.UserPojoMapper;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserPojoMapper userDao;
	@Override
	public int selTotal() {
		return userDao.selTotal();
	}

}
