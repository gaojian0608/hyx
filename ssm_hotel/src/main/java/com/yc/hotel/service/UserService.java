package com.yc.hotel.service;

import java.util.List;

import com.yc.hotel.po.UserPO;

/**
 * 员工业务接口
 * @author 38929
 *
 */
public interface UserService {

	/**
	 * 添加员工
	 * @param user
	 * @return
	 */
	public int addUser(UserPO user);

	/**
	 * 删除员工
	 * @param uid 员工编号
	 * @return
	 */
	public int delUser(Integer uid);
	
	/**
	 * 修改员工信息
	 * @param user
	 * @return
	 */
	public int updateUser(UserPO user);
	
	/**
	 * 查询
	 * @param user
	 * @return
	 */
	public List<UserPO> findByTerm(UserPO user);
}
