package com.zl.service;

import com.zl.pojo.UserPojo;

public interface UserService {
	int selTotal();
	UserPojo loginUser(UserPojo user);
}
