package com.yc.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.hotel.dao.OrderItemMapper;
import com.yc.hotel.po.OrderItemPO;
import com.yc.hotel.service.OrderItemService;

@Service("orderItemService")
public class OrderItemServieImpl implements OrderItemService {

	@Autowired
	private OrderItemMapper mapper;
	
	@Override
	public int addOrderItem(List<OrderItemPO> pos) {
		return mapper.insertOrderItem(pos);
	}

	@Override
	public int updateOrderItem(OrderItemPO po) {
		return mapper.updateOrderItem(po);
	}

	@Override
	public int delOrderItem(OrderItemPO po) {
		return mapper.deleteOrderItem(po);
	}

	@Override
	public List<OrderItemPO> findOrderItem(OrderItemPO po) {
		return mapper.seleteOrderItem(po);
	}

}
