package com.yc.hotel.service;

import java.util.List;

import com.yc.hotel.po.OrderPO;

/**
 * 入住订单接口
 * @author 贺
 *
 */
public interface OrderService {

	/**
	 * 入住
	 * @param po
	 * @return
	 */
	public int addOrder(OrderPO po);
	
	/**
	 * 修改入住信息
	 * @param po
	 * @return
	 */
	public int updateOrder(OrderPO po);
	
	/**
	 * 删除入住信息
	 * @param po
	 * @return
	 */
	public int delOrder(OrderPO po);
	
	/**
	 * 查找入住信息
	 * @param po
	 * @return
	 */
	public List<OrderPO> findOrder(OrderPO po);
	
	/**
	 * 入住及其详情级联查询
	 * @param po
	 * @return
	 */
	public List<OrderPO> findOrderAndItem(OrderPO po);
	
}
