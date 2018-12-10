package com.yc.hotel.po;

import java.io.Serializable;

/**
 * reserve 预订单表
 * @author 38929
 *
 */
public class ReservePO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1070189650795644721L;

	private String reid;//预订单编号 工具生成
	private Integer mid;//预定人编号
	private String redate;//下单时间
	private String rearrival;//预入住时间
	private String redeparture;//预退房时间
	private String recost;//预付费用（预约住宿天数的房费）
	private String restate;//预订单状态（预定中，已取消，已到店）
	private String redemo01;//预留字段01
	private String redemo02;//预留字段02
	public String getReid() {
		return reid;
	}
	public void setReid(String reid) {
		this.reid = reid;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getRedate() {
		return redate;
	}
	public void setRedate(String redate) {
		this.redate = redate;
	}
	public String getRearrival() {
		return rearrival;
	}
	public void setRearrival(String rearrival) {
		this.rearrival = rearrival;
	}
	public String getRedeparture() {
		return redeparture;
	}
	public void setRedeparture(String redeparture) {
		this.redeparture = redeparture;
	}
	public String getRecost() {
		return recost;
	}
	public void setRecost(String recost) {
		this.recost = recost;
	}
	public String getRestate() {
		return restate;
	}
	public void setRestate(String restate) {
		this.restate = restate;
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
		return "ReservePO [reid=" + reid + ", mid=" + mid + ", redate=" + redate + ", rearrival=" + rearrival
				+ ", redeparture=" + redeparture + ", recost=" + recost + ", restate=" + restate + ", redemo01="
				+ redemo01 + ", redemo02=" + redemo02 + "]";
	}
	
}
