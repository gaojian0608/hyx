package com.yc.hotel.dao;

import java.util.List;

import com.yc.hotel.po.OrderItemPO;

/**
 * 入住详情类
 * @author 贺
 *
 */
public interface OrderItemMapper {

	/**
	 * 新增入住订单详情    批量插入
	 * @param po
	 * @return
	 */
	public int insertOrderItem(List<OrderItemPO> pos);
	
	/**
	 * 修改入住详情表
	 * @param po
	 * @return
	 */
	public int updateOrderItem(OrderItemPO po);
	
	/**
	 * 删除入住详情表
	 * @param po
	 * @return
	 */
	public int deleteOrderItem(OrderItemPO po);
	
	/**
	 * 查询入住详情表
	 * @param po
	 * @return
	 */
	public List<OrderItemPO> seleteOrderItem(OrderItemPO po);
	
}
