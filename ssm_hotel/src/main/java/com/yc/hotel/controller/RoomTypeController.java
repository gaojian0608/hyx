package com.yc.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.hotel.po.RoomTypePO;
import com.yc.hotel.service.RoomTypeService;
/**
 * 客房类型控制类
 * @author 贺
 *
 */
@RequestMapping("/RoomType")
@Controller
public class RoomTypeController {

	@Autowired
	private RoomTypeService roomTypeService;
	
	@RequestMapping(value="/addRT",method=RequestMethod.POST)
	@ResponseBody
	public int addRoomType(RoomTypePO po){
		System.out.println("add"+po);
		return roomTypeService.addRoomType(po);
	}
	
	@RequestMapping(value="/updateRT",method=RequestMethod.PUT)
	@ResponseBody
	public int updateRoomType(RoomTypePO po){
		po.setTnum(0);
		System.out.println("update"+po);
		return roomTypeService.updateRoomType(po);
	}
	
	@RequestMapping(value="/delRT",method=RequestMethod.DELETE)
	@ResponseBody
	public int delRoomType(RoomTypePO po){
		System.out.println("del"+po);
		return roomTypeService.delRoomType(po);
	}
	
	@RequestMapping(value="/findRT")
	@ResponseBody
	public List<RoomTypePO> findRoomType(RoomTypePO po){
		System.out.println("find"+po);
		return roomTypeService.findRoomType(po);
	}
	
}
