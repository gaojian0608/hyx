package com.yc.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.hotel.po.RoomPO;
import com.yc.hotel.service.RoomService;

/**
 * 客房控制类
 * @author 贺
 *
 */
@RequestMapping("/Room")
@Controller
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@RequestMapping(value="/addR",method=RequestMethod.POST)
	@ResponseBody
	public int addRoom(RoomPO po){
		System.out.println("add"+po);
		return roomService.addRoom(po);
	}
	
	@RequestMapping(value="/updateR",method=RequestMethod.PUT)
	@ResponseBody
	public int updateRoom(RoomPO po){
		System.out.println("update"+po);
		return roomService.updatetRoom(po);
	}
	
	@RequestMapping(value="/delR",method=RequestMethod.DELETE)
	@ResponseBody
	public int delRoom(RoomPO po){
		System.out.println("del"+po);
		return roomService.delRoom(po);
	}
	
	@RequestMapping(value="/findR")
	@ResponseBody
	public List<RoomPO> findRoom(RoomPO po){
		System.out.println("find"+po);
		return roomService.findRoom(po);
	}
	
}
