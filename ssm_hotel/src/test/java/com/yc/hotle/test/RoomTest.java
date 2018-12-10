package com.yc.hotle.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yc.hotel.po.RoomPO;
import com.yc.hotel.po.RoomTypePO;
import com.yc.hotel.service.RoomService;

public class RoomTest extends BaseJunit4Test {

	@Autowired
	private RoomService roomService;
	
	@Test
	public void addRoomTest(){
		RoomPO po = new RoomPO();
		po.setRmid(101);
		po.setTid(1);
		po.setRmprice(100);
		po.setRmstate("空闲");
		po.setRmdesc("有窗");
		System.out.println(roomService.addRoom(po));
	}
	
	@Test
	public void updateRoomTest(){
		RoomPO po = new RoomPO();
		po.setRmid(101);
		//po.setTid(1);
		po.setRmprice(120);
		po.setRmstate("预定");
		po.setRmdesc("无窗");
		System.out.println(roomService.updatetRoom(po));
	}
	
	@Test
	public void delRoomTest(){
		RoomPO po = new RoomPO();
		po.setRmid(101);
		System.out.println(roomService.delRoom(po));
	}
	
	@Test
	public void findRoomTest(){
		RoomPO po = new RoomPO();
		//po.setRmid(101);
		//po.setTid(1);
		//po.setRmprice(100);
		//po.setRmstate("空闲");
		//po.setRmdesc("窗");
		RoomTypePO rtype = new RoomTypePO();
		//rtype.setTname("单标");
		rtype.setPnum(1);
		po.setRtype(rtype);		
		System.out.println(roomService.findRoom(po));
	}
	
}
