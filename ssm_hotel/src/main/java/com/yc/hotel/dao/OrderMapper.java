package com.yc.hotel.dao;

import java.util.List;

import com.yc.hotel.po.OrderPO;

/**
 * 入住类
 * @author 贺
 *
 */
public interface OrderMapper {

	/**
	 * 新增入住订单 
	 * @param po
	 * @return
	 */
	public int insertOrder(OrderPO po);
	
	/**
	 * 修改入住记录
	 * @param po
	 * @return
	 */
	public int updateOrder(OrderPO po);
	
	/**
	 * 删除入住记录
	 * @param po
	 * @return
	 */
	public int deleteOrder(OrderPO po);
	
	/**
	 * 查询入住记录
	 * @param po
	 * @return
	 */
	public List<OrderPO> seleteOrder(OrderPO po);
	
	/**
	 * 入住及其详情级联查询
	 * @param po
	 * @return
	 */
	public List<OrderPO> seleteOrderAndItem(OrderPO po);
	
}
