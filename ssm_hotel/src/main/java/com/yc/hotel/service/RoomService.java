package com.yc.hotel.service;

import java.util.List;

import com.yc.hotel.po.RoomPO;

/**
 * 客房信息管理接口
 * @author 贺
 *
 */
public interface RoomService {

	/**
	 * 新增客房
	 * @param po
	 * @return
	 */
	public int addRoom(RoomPO po);
	
	/**
	 * 修改客房信息
	 * @param po
	 * @return
	 */
	public int updatetRoom(RoomPO po);
	
	/**
	 * 删除客房信息
	 * @param po
	 * @return
	 */
	public int delRoom(RoomPO po);
	
	/**
	 * 查询客房信息
	 * @param po
	 * @return
	 */
	public List<RoomPO> findRoom(RoomPO po);
	
}
