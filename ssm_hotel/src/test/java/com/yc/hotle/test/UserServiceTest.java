package com.yc.hotle.test;

import javax.annotation.Resource;
import org.junit.Test;
import com.yc.hotel.po.UserPO;
import com.yc.hotel.service.UserService;

public class UserServiceTest extends BaseJunit4Test{

	@Resource
	UserService userService;
	
	@Test
	public void testAddUser(){
		UserPO user = new UserPO();
		user.setUname("yc");
		user.setUpwd("a");
		user.setUtype("前台");
		user.setUstate("在职");
		System.out.println(userService.addUser(user));
	}
	
	@Test
	public void testUpdateUser(){
		UserPO user = new UserPO();
		user.setUid(1);
		//user.setUname("yc");
		user.setUpwd("a");
		user.setUtype("大堂经理");
		user.setUstate("在职");
		System.out.println(userService.updateUser(user));
	}
	
	@Test
	public void testFindByTerm(){
		UserPO user = new UserPO();
		//user.setUid(1);
		//user.setUname("yc");
		user.setUtype("大堂经理");
		//user.setUstate("在职");
		System.out.println(userService.findByTerm(user));
	}
	
	@Test
	public void testDelUser(){
		
		System.out.println(userService.delUser(1));
	}
}
