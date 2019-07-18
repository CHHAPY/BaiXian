package com.zl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zl.dao.UserPojoMapper;
import com.zl.pojo.UserPojo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserPojoMapper up;
	@Override
	public int selTotal() {
		return up.selTotal();
	}
	@Override
	public UserPojo loginUser(UserPojo user) {
		if(user.getName()!=null&&!"".equals(user.getName())&&user.getPad()!=null&&!"".equals(user.getPad())) {
			user=up.loginUser(user);
			return user;
		}
		return null;
	}

}
