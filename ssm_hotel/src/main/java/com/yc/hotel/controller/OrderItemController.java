package com.yc.hotel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.hotel.po.OrderItemPO;
import com.yc.hotel.service.OrderItemService;

@RequestMapping("/OrderItem")
@Controller
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@RequestMapping("/addOI")
	private int addOrder(OrderItemPO po){
		List<OrderItemPO> pos = new ArrayList<OrderItemPO>();
		pos.add(po);
		return orderItemService.addOrderItem(pos);	
	}
	
	@RequestMapping("/updateOI")
	private int updateOrderItem(OrderItemPO po){
		
		return orderItemService.updateOrderItem(po);	
	}
	
	@RequestMapping("/delOI")
	private int delOrderItem(OrderItemPO po){
		
		return orderItemService.delOrderItem(po);	
	}
	
	@RequestMapping("/findOI")
	private List<OrderItemPO> findOrderItem(OrderItemPO po){		
		return orderItemService.findOrderItem(po);	
	}
	
	
}
