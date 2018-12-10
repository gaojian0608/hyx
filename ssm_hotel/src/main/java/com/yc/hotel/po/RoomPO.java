package com.yc.hotel.po;

import java.io.Serializable;

/**
 * room 客房表
 * @author 38929
 *
 */
public class RoomPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2020441884005575269L;

	private Integer rmid;//房号  工具生成 
	private Integer tid;//类型
	private Integer rmprice;//房价
	private String rmstate;//客房状态（预定，使用，空闲，清洁，维修）
	private String rmdesc;//客房描述（有窗，海景，欧式，主题，面积20m2）
	private String rmdemo;//预留字段
	private RoomTypePO rtype; //客房类型对象
	
	public Integer getRmid() {
		return rmid;
	}
	public void setRmid(Integer rmid) {
		this.rmid = rmid;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getRmprice() {
		return rmprice;
	}
	public void setRmprice(Integer rmprice) {
		this.rmprice = rmprice;
	}
	public String getRmstate() {
		return rmstate;
	}
	public void setRmstate(String rmstate) {
		this.rmstate = rmstate;
	}
	public String getRmdesc() {
		return rmdesc;
	}
	public void setRmdesc(String rmdesc) {
		this.rmdesc = rmdesc;
	}
	public String getRmdemo() {
		return rmdemo;
	}
	public void setRmdemo(String rmdemo) {
		this.rmdemo = rmdemo;
	}
	public RoomTypePO getRtype() {
		return rtype;
	}
	public void setRtype(RoomTypePO rtype) {
		this.rtype = rtype;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "RoomPO [rmid=" + rmid + ", tid=" + tid + ", rmprice=" + rmprice + ", rmstate=" + rmstate + ", rmdesc="
				+ rmdesc + ", rmdemo=" + rmdemo + ", rtype=" + rtype + "]";
	}
	

}
