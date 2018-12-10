package com.yc.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.hotel.dao.RoomMapper;
import com.yc.hotel.dao.RoomTypeMapper;
import com.yc.hotel.po.RoomPO;
import com.yc.hotel.po.RoomTypePO;
import com.yc.hotel.service.RoomService;

@Service("roomService")
public class RoomServiceImpl implements RoomService {

	@Autowired
	private RoomMapper rmapper;
	@Autowired
	private RoomTypeMapper rtmapper;
	
	/**
	 * 新增客房，对应类型数量加一
	 */
	@Transactional
	@Override
	public int addRoom(RoomPO po) {
		int result = rmapper.insertRoom(po); //新增房间
		
		RoomTypePO tpo = new RoomTypePO();
		tpo.setTid(po.getTid());
		tpo.setTnum(1);
		int result1 = rtmapper.updateRoomType(tpo); //对应类型的数量加1
		
		if( result>0 && result1>0 ){
			return 1;  //执行成功返回1
		}
		return 0; //事务回滚，返回0
	}

	/**
	 * 修改客房，若修改客房类型，修改后的类型，其数量加一，原类型，其数量减一
	 */
	@Transactional
	@Override
	public int updatetRoom(RoomPO po) { 
		int result1 = 1;
		int result2 = 1;
		if( po.getTid() != null ){
			RoomPO rpo = new RoomPO();
			rpo.setRmid(po.getRmid());
			int tid = rmapper.seleteRoom(rpo).get(0).getTid();	//通过rmid查询原客房类型	
			
			RoomTypePO tpo = new RoomTypePO();
			tpo.setTid(po.getTid());
			tpo.setTnum(1);
			result1 = rtmapper.updateRoomType(tpo); //修改后的类型，其数量加一
			
			RoomTypePO oldpo = new RoomTypePO();
			oldpo.setTid(tid);
			oldpo.setTnum(-1);
			result2 = rtmapper.updateRoomType(oldpo); //原类型，其数量减一
		}
		
		int result = rmapper.updatetRoom(po); //修改类型
		
		if( result>0 && result1>0 && result2>0 ){
			return 1;  //执行成功返回1
		}
		return 0;  //事务回滚，返回0
	}

	/**
	 * 删除客房，对应类型数量减一
	 */
	@Transactional
	@Override
	public int delRoom(RoomPO po) {
		RoomPO rpo = new RoomPO();
		rpo.setRmid(po.getRmid());
		int tid = rmapper.seleteRoom(rpo).get(0).getTid();	//通过rmid查询原客房类型
		
		RoomTypePO tpo = new RoomTypePO();
		tpo.setTid(tid);
		tpo.setTnum(-1);
		int result1 = rtmapper.updateRoomType(tpo); //对应类型的数量减1
		
		int result = rmapper.deleteRoom(po); //删除房间
		
		if( result>0 && result1>0 ){
			return 1;  //执行成功返回1
		}
		return 0; //事务回滚，返回0
	}

	/**
	 * 查询客房，联合查询
	 */
	@Override
	public List<RoomPO> findRoom(RoomPO po) {
		return rmapper.seleteRoom(po);
	}

}
