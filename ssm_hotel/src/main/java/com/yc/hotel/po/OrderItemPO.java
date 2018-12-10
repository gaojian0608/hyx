package com.yc.hotel.po;

import java.io.Serializable;

/**
 * ordetitem 入住订单详情表
 * @author 38929
 *
 */
public class OrderItemPO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5626991051720299577L;

	private Integer oiid;//入住订单的详情编号  自增
	private String orid;//入住订单编号，外键，入住订单表主键
	private String idcard;//入住人身份证（多个人用，隔开）
	private Integer rmid;//入住人编号   即会员的编号
	private String oiarrival;//入住时间
	private String oideparture;//退房时间：12：00前正常收费	12：00--18：00收取超时费，按半天住宿房费 18：00以后按一天住宿房费
	private double oiday;//入住天数
	private String type;//入住客房类型
	private double price;//入住房价
	private String oidemo01;//预留字段01
	private String oidemo02;//预留字段02
	public Integer getOiid() {
		return oiid;
	}
	public void setOiid(Integer oiid) {
		this.oiid = oiid;
	}
	public String getOrid() {
		return orid;
	}
	public void setOrid(String orid) {
		this.orid = orid;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public Integer getRmid() {
		return rmid;
	}
	public void setRmid(Integer rmid) {
		this.rmid = rmid;
	}
	public String getOiarrival() {
		return oiarrival;
	}
	public void setOiarrival(String oiarrival) {
		this.oiarrival = oiarrival;
	}
	public String getOideparture() {
		return oideparture;
	}
	public void setOideparture(String oideparture) {
		this.oideparture = oideparture;
	}
	public double getOiday() {
		return oiday;
	}
	public void setOiday(double oiday) {
		this.oiday = oiday;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getOidemo01() {
		return oidemo01;
	}
	public void setOidemo01(String oidemo01) {
		this.oidemo01 = oidemo01;
	}
	public String getOidemo02() {
		return oidemo02;
	}
	public void setOidemo02(String oidemo02) {
		this.oidemo02 = oidemo02;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "OrderItemPO [oiid=" + oiid + ", orid=" + orid + ", idcard=" + idcard + ", rmid=" + rmid + ", oiarrival="
				+ oiarrival + ", oideparture=" + oideparture + ", oiday=" + oiday + ", type=" + type + ", price="
				+ price + ", oidemo01=" + oidemo01 + ", oidemo02=" + oidemo02 + "]";
	}
	

}
