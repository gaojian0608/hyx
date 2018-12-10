package com.yc.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.hotel.dao.RoomTypeMapper;
import com.yc.hotel.po.RoomTypePO;
import com.yc.hotel.service.RoomTypeService;

@Service("roomTypeService")
public class RoomTypeServiceImpl implements RoomTypeService {
	
	@Autowired
	private RoomTypeMapper mapper;

	@Override
	public int addRoomType(RoomTypePO po) {
		return mapper.insertRoomType(po);
	}

	@Override
	public int updateRoomType(RoomTypePO po) {
		return mapper.updateRoomType(po);
	}

	@Override
	public int delRoomType(RoomTypePO po) {
		return mapper.deleteRoomType(po);
	}

	@Override
	public List<RoomTypePO> findRoomType(RoomTypePO po) {
		return mapper.seleteRoomType(po);
	}

}
