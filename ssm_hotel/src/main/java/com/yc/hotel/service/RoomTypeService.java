package com.yc.hotel.service;

import java.util.List;

import com.yc.hotel.po.RoomTypePO;

/**
 * 房间类型管理接口
 * @author 贺
 *
 */
public interface RoomTypeService {

	/**
	 * 添加房间类型
	 * @param po
	 * @return
	 */
	public int addRoomType(RoomTypePO po);
	
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
	public int delRoomType(RoomTypePO po);
	
	/**
	 * 查询房间类型
	 * @param po
	 * @return
	 */
	public List<RoomTypePO> findRoomType(RoomTypePO po);
	
}
