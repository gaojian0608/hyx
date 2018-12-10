package com.yc.hotel.po;

import java.io.Serializable;
import java.util.List;

/**
 * order 入住订单表
 * @author 38929
 *
 */
public class OrderPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String orid;//入住单号 工具生成
	private Integer mid;//下单人编号
	private String ordate;//入住下单时间 
	private double orcost;//预付费用，  住宿天数* 房费
	private double ormoney;//押金
	private double orpayment;//实际费用
	private String orstate;//订单状态（未预付，住宿中，已结账）
	private Integer uid;//操作人员编号 即员工编号
	private String ordemo01;//预留字段01
	private String ordemo02;//预留字段02
	private List<OrderItemPO> items; //入住详情表
	
	public String getOrid() {
		return orid;
	}
	public void setOrid(String orid) {
		this.orid = orid;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getOrdate() {
		return ordate;
	}
	public void setOrdate(String ordate) {
		this.ordate = ordate;
	}
	public double getOrcost() {
		return orcost;
	}
	public void setOrcost(double orcost) {
		this.orcost = orcost;
	}
	public double getOrmoney() {
		return ormoney;
	}
	public void setOrmoney(double ormoney) {
		this.ormoney = ormoney;
	}
	public double getOrpayment() {
		return orpayment;
	}
	public void setOrpayment(double orpayment) {
		this.orpayment = orpayment;
	}
	public String getOrstate() {
		return orstate;
	}
	public void setOrstate(String orstate) {
		this.orstate = orstate;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getOrdemo01() {
		return ordemo01;
	}
	public void setOrdemo01(String ordemo01) {
		this.ordemo01 = ordemo01;
	}
	public String getOrdemo02() {
		return ordemo02;
	}
	public void setOrdemo02(String ordemo02) {
		this.ordemo02 = ordemo02;
	}
	public List<OrderItemPO> getItems() {
		return items;
	}
	public void setItems(List<OrderItemPO> items) {
		this.items = items;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "OrderPO [orid=" + orid + ", mid=" + mid + ", ordate=" + ordate + ", orcost=" + orcost + ", ormoney="
				+ ormoney + ", orpayment=" + orpayment + ", orstate=" + orstate + ", uid=" + uid + ", ordemo01="
				+ ordemo01 + ", ordemo02=" + ordemo02 + ", items=" + items + "]";
	}
	
	
}
