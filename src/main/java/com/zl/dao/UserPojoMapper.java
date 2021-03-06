package com.zl.dao;

import com.zl.pojo.UserPojo;

public interface UserPojoMapper {
	UserPojo loginUser(UserPojo user);
	
    int deleteByPrimaryKey(Integer id);

    int insert(UserPojo record);

    int insertSelective(UserPojo record);

    UserPojo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPojo record);

    int updateByPrimaryKey(UserPojo record);
    
    int selTotal();	//测试
}