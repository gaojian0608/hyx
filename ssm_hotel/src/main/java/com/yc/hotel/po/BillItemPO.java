package com.yc.hotel.po;

import java.io.Serializable;

/**
 * billitem 账单详情表
 * @author 38929
 *
 */
public class BillItemPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2269915541741174625L;

	private String biid;//账单表 工具生成
	private String orid;//入住单号
	private double roomcost;//住宿费
	private double meals;//餐饮消费（早中晚---酒水，食物）
	private double indemnity;//赔偿费用，退房时客房物品是否人为损坏的赔偿费
	private double service;//客房服务费，座机话费，客房物品消耗费
	private String bidemo01;//预留字段01
	private String bidemo02;//预留字段02
	public String getBiid() {
		return biid;
	}
	public void setBiid(String biid) {
		this.biid = biid;
	}
	public String getOrid() {
		return orid;
	}
	public void setOrid(String orid) {
		this.orid = orid;
	}
	public double getRoomcost() {
		return roomcost;
	}
	public void setRoomcost(double roomcost) {
		this.roomcost = roomcost;
	}
	public double getMeals() {
		return meals;
	}
	public void setMeals(double meals) {
		this.meals = meals;
	}
	public double getIndemnity() {
		return indemnity;
	}
	public void setIndemnity(double indemnity) {
		this.indemnity = indemnity;
	}
	public double getService() {
		return service;
	}
	public void setService(double service) {
		this.service = service;
	}
	public String getBidemo01() {
		return bidemo01;
	}
	public void setBidemo01(String bidemo01) {
		this.bidemo01 = bidemo01;
	}
	public String getBidemo02() {
		return bidemo02;
	}
	public void setBidemo02(String bidemo02) {
		this.bidemo02 = bidemo02;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "BillItemPO [biid=" + biid + ", orid=" + orid + ", roomcost=" + roomcost + ", meals=" + meals
				+ ", indemnity=" + indemnity + ", service=" + service + ", bidemo01=" + bidemo01 + ", bidemo02="
				+ bidemo02 + "]";
	}
	
}
