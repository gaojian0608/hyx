package com.yc.hotle.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yc.hotel.dao.OrderItemMapper;
import com.yc.hotel.po.OrderItemPO;

public class OrderItemTest extends BaseJunit4Test {

	@Autowired
	private OrderItemMapper mapper;
	
	@Test
	public void addTest(){
		OrderItemPO po = new OrderItemPO();
		po.setOrid("2018120613190001");
		po.setIdcard("123456789009,09889766548");
		po.setRmid(101);
		po.setOiarrival("2018-12-06 14:07:33");
		po.setOideparture("2018-12-09 11:07:33");
		po.setOiday(3);
		po.setType("单标");
		po.setPrice(100);
		List<OrderItemPO> pos = new ArrayList<OrderItemPO>();
		pos.add(po);pos.add(po);
		System.out.println(mapper.insertOrderItem(pos));
	}
	
	@Test
	public void updateTest(){
		OrderItemPO po = new OrderItemPO();
		po.setOiid(1);
		//po.setOrid("2018120613190001");
		po.setIdcard("123456789009,09889766548");
		po.setRmid(101);
		po.setOiarrival("2018-12-04 14:07:33");
		po.setOideparture("2018-12-08 11:07:33");
		po.setOiday(4);
		po.setType("双标");
		po.setPrice(120);
		System.out.println(mapper.updateOrderItem(po));
	}
	
	@Test
	public void delTest(){
		OrderItemPO po = new OrderItemPO();
		po.setOiid(2);
		//po.setOrid("2018120613190001");
//		po.setIdcard("123456789009,09889766548");
//		po.setRmid(101);
//		po.setOiarrival("2018-12-04 14:07:33");
//		po.setOideparture("2018-12-08 11:07:33");
//		po.setOiday(4);
//		po.setType("双标");
//		po.setPrice(120);
		System.out.println(mapper.deleteOrderItem(po));
	}
	
	@Test
	public void findTest(){
		OrderItemPO po = new OrderItemPO();
		po.setOiid(1);
		po.setOrid("2018120613190001");
		po.setIdcard("123456789009,09889766548");
		po.setRmid(101);
		po.setOiarrival("2018-12-04 14:07:33");
		po.setOideparture("2018-12-08 11:07:33");
		po.setOiday(4);
		po.setType("双标");
		po.setPrice(120);
		System.out.println(mapper.seleteOrderItem(po));
	}
	
}
