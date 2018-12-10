package com.yc.hotel.dao;

import java.util.List;

import com.yc.hotel.po.UserPO;

/**
 * 用户接口
 * @author 38929
 *
 */
public interface UserMapper {
	
	/**
	 * 添加员工
	 * @param user
	 * @return
	 */
	public int insertUser(UserPO user);

	/**
	 * 删除员工
	 * @param uid 员工编号
	 * @return
	 */
	public int deleteUser(Integer uid);
	
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
	public List<UserPO> selectUser(UserPO user);
	
	
}
