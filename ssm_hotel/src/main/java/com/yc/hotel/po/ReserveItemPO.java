package com.yc.hotel.po;

import java.io.Serializable;

/**
 * reserveitem 预订单详情表
 * @author 38929
 *
 */
public class ReserveItemPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6489099783386393360L;

	private Integer riid;//预订单详情编号
	private String reid;//预订单编号
	private Integer rmid;//预订客房编号
	private String tname;//预订客房类型
	private double price;//预定时房价
	private String redemo01;//预留字段01
	private String redemo02;//预留字段02
	public Integer getRiid() {
		return riid;
	}
	public void setRiid(Integer riid) {
		this.riid = riid;
	}
	public String getReid() {
		return reid;
	}
	public void setReid(String reid) {
		this.reid = reid;
	}
	public Integer getRmid() {
		return rmid;
	}
	public void setRmid(Integer rmid) {
		this.rmid = rmid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getRedemo01() {
		return redemo01;
	}
	public void setRedemo01(String redemo01) {
		this.redemo01 = redemo01;
	}
	public String getRedemo02() {
		return redemo02;
	}
	public void setRedemo02(String redemo02) {
		this.redemo02 = redemo02;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ReserveItemPO [riid=" + riid + ", reid=" + reid + ", rmid=" + rmid + ", tname=" + tname + ", price="
				+ price + ", redemo01=" + redemo01 + ", redemo02=" + redemo02 + "]";
	}
	
}
