package com.yc.hotle.test;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yc.hotel.po.RoomTypePO;
import com.yc.hotel.service.RoomTypeService;

public class RoomTypeTest extends BaseJunit4Test {

	@Autowired
	private RoomTypeService roomTypeService;
	
	/**
	 * 添加房间类型测试
	 */
	@Test
	public void addTest(){
		RoomTypePO po = new RoomTypePO();
		po.setTname("双标");
		po.setPnum(2);
		po.setTdesc("有窗");
		System.out.println(roomTypeService.addRoomType(po));
	}
	
	/**
	 * 修改房间类型测试
	 */
	@Test
	public void updateTest(){
		RoomTypePO po = new RoomTypePO();
		RoomTypePO fpo = new RoomTypePO();
		fpo.setTid(1);
		List<RoomTypePO> list = roomTypeService.findRoomType(fpo);
		//po.setTname("单标");
		//po.setPnum(1);
		//po.setTdesc("有窗");
		po.setTnum(list.get(0).getTnum()-1);
		po.setTid(1);
		System.out.println(roomTypeService.updateRoomType(po));
	}
	
	/**
	 * 删除房间类型测试
	 */
	@Test
	public void delTest(){
		RoomTypePO po = new RoomTypePO();
		//po.setTname("双标");
		po.setTid(2);
		System.out.println(roomTypeService.delRoomType(po));
	}
	
	/**
	 * 查询房间类型测试
	 */
	@Test
	public void findTest(){
		RoomTypePO po = new RoomTypePO();
		//po.setTid(1);
		po.setTname("单");
		//po.setTnum(1);
		//po.setPnum(1);
		//po.setTdesc("有窗");
		System.out.println(roomTypeService.findRoomType(po));
	}
	
}
