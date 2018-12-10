package com.yc.hotel.dao;

import java.util.List;

import com.yc.hotel.po.RoomPO;

public interface RoomMapper {

	/**
	 * 新增客房
	 * @param po
	 * @return
	 */
	public int insertRoom(RoomPO po);
	
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
	public int deleteRoom(RoomPO po);
	
	/**
	 * 查询客房信息
	 * @param po
	 * @return
	 */
	public List<RoomPO> seleteRoom(RoomPO po);
	
}
