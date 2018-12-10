package com.yc.hotle.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.yc.hotel.dao.OrderMapper;
import com.yc.hotel.po.OrderPO;

public class OrderTest extends BaseJunit4Test {

	@Autowired
	private OrderMapper mapper;
	
	@Test
	public void addtest(){
		OrderPO po = new OrderPO();
		po.setOrid("2018120613190001");
		po.setMid(1);
		//po.setOrdate(ordate);
		po.setOrcost(1000);
		po.setOrmoney(100);
		po.setOrpayment(1100);
		po.setOrstate("住宿中");
		po.setUid(1);
		System.out.println(mapper.insertOrder(po));
	}
	
	@Test
	public void updatetest(){
		OrderPO po = new OrderPO();
		po.setOrid("2018120613190001");
		po.setMid(1);
		//po.setOrdate(ordate);
		po.setOrcost(1210);
		po.setOrmoney(90);
		po.setOrpayment(1300);
		po.setOrstate("住宿");
		po.setUid(1);
		System.out.println(mapper.updateOrder(po));
	}
	
	@Test
	public void deltest(){
		OrderPO po = new OrderPO();
		po.setOrid("2018120613190001");
		po.setMid(1);
		//po.setOrdate(ordate);
		po.setOrcost(1000);
		po.setOrmoney(100);
		po.setOrpayment(1100);
		po.setOrstate("住宿中");
		po.setUid(1);
		System.out.println(mapper.deleteOrder(po));
	}
	
	@Test
	public void findtest(){
		OrderPO po = new OrderPO();
		po.setOrid("2018120613190001");
		po.setMid(1);
		//po.setOrdate(ordate);
		po.setOrcost(1210);
		po.setOrmoney(90);
		po.setOrpayment(1300);
		po.setOrstate("住宿");
		po.setUid(1);
		//System.out.println(mapper.seleteOrder(po));
		System.out.println(mapper.seleteOrderAndItem(po));
	}
	
}
