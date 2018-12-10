package com.yc.hotel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yc.hotel.po.OrderItemPO;
import com.yc.hotel.po.OrderPO;
import com.yc.hotel.service.OrderService;
import com.yc.hotel.util.RandomStringUtil;

@RequestMapping("/Order")
@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	// @RequestBody：接收json数据并转换成pojo对象
	// @ResponseBody：响应json数据，把pojo对象转换成json数据并响应
	@RequestMapping("/addO")
	@ResponseBody	//JSONArray obj
	private String addOrder(@RequestBody List<OrderItemPO> pos ){
		System.out.println(pos);
	    String orid = RandomStringUtil.getRandomId();
	    //设置详情表的入住订单编号并计算总预付费用
	    double orcost = 0;
	    for( int i=0;i<pos.size();i++ ){
	    	pos.get(i).setOrid(orid);
	    	String money = pos.get(i).getOidemo01();
	    	if( money != null && !"".equals(money) ){
	    		orcost+=Double.parseDouble(money);
	    	}
	    	
	    }
	    //给入住订单设值
	    OrderPO po = new OrderPO();
	    po.setOrid(orid);
	    po.setOrcost(orcost);
	    po.setUid(1);
	    po.setItems(pos);
	    
	    //调用方法添加入住订单
	    int result = orderService.addOrder(po);
	    if(result == 1){
	    	return orid;
	    }
		return "0";
	}
	
	@RequestMapping("/updateO")
	@ResponseBody
	private int updateOrder(OrderPO po){
		
		return orderService.updateOrder(po);	
	}
	
	@RequestMapping("/delO")
	@ResponseBody
	private int delOrder(OrderPO po){
		
		return orderService.delOrder(po);	
	}
	
	@RequestMapping("/findO")
	@ResponseBody
	private List<OrderPO> findOrder(OrderPO po){		
		return orderService.findOrder(po);	
	}
	
	@RequestMapping("/findOAI")
	@ResponseBody
	private List<OrderPO> findOrderAndItem(OrderPO po){		
		return orderService.findOrderAndItem(po);	
	}
	
}
