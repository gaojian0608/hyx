package com.yc.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.hotel.dao.UserMapper;
import com.yc.hotel.po.UserPO;
import com.yc.hotel.service.UserService;

/**
 * 员工业务实现类
 * @author 38929
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public int addUser(UserPO user) {
		return userMapper.insertUser(user);
	}

	@Override
	public int delUser(Integer uid) {
		return userMapper.deleteUser(uid);
	}

	@Override
	public int updateUser(UserPO user) {
		return userMapper.updateUser(user);
	}

	@Override
	public List<UserPO> findByTerm(UserPO user) {
		return userMapper.selectUser(user);
	}


}
