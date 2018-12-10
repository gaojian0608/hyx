package com.yc.hotel.dao;

import java.util.List;

import com.yc.hotel.po.RoomTypePO;

public interface RoomTypeMapper {
	
	/**
	 * 添加房间类型
	 * @param po
	 * @return
	 */
	public int insertRoomType(RoomTypePO po);
	
	/**
	 * 修改房间类型
	 * @param po
	 * @return
	 */
	public int updateRoomType(RoomTypePO po);
	
	/**
	 * 删除房间类型
	 * @param po
	 * @return
	 */
	public int deleteRoomType(RoomTypePO po);
	
	/**
	 * 查询房间类型
	 * @param po
	 * @return
	 */
	public List<RoomTypePO> seleteRoomType(RoomTypePO po);
	
}
