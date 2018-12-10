package com.yc.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.hotel.dao.OrderItemMapper;
import com.yc.hotel.dao.OrderMapper;
import com.yc.hotel.po.OrderItemPO;
import com.yc.hotel.po.OrderPO;
import com.yc.hotel.po.RoomPO;
import com.yc.hotel.service.OrderItemService;
import com.yc.hotel.service.OrderService;
import com.yc.hotel.service.RoomService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper mapper;	
	@Autowired
	private OrderItemService orderItemService;
	@Autowired
	private RoomService roomService;
	
	@Override
	public int addOrder(OrderPO po) {
		List<OrderItemPO> items = po.getItems();
		int result1 = mapper.insertOrder(po);	
		int result2 = orderItemService.addOrderItem(items);
		//修改房屋状态
		RoomPO rpo = null;
		int result3 = 1;
		for( int i=0;i<items.size();i++ ){
			rpo = new RoomPO();
			rpo.setRmid(items.get(i).getRmid());
			rpo.setRmstate("入住中");
			result3 = roomService.updatetRoom(rpo);
			if(result3 == 0){break;}
		}		
		
		if( result1>0 && result2>0 && result3>0){
			return 1;
		}
		
		return 0;
	}

	@Override
	public int updateOrder(OrderPO po) {
		return mapper.updateOrder(po);   
	}

	@Override
	public int delOrder(OrderPO po) {
		OrderItemPO oipo = new OrderItemPO();
		oipo.setOrid(po.getOrid());
		int result1 = orderItemService.delOrderItem(oipo);
		int result2 = mapper.deleteOrder(po);
		if( result1>0 && result2>0 ){
			return 1;
		}
		return 0;
	}

	@Override
	public List<OrderPO> findOrder(OrderPO po) {
		return mapper.seleteOrder(po);
	}

	@Override
	public List<OrderPO> findOrderAndItem(OrderPO po) {
		return mapper.seleteOrderAndItem(po);
	}

}
