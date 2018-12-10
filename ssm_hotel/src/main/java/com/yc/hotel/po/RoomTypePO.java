package com.yc.hotel.po;

import java.io.Serializable;

/**
 * Roomtype 客房类型表
 * @author 38929
 *
 */
public class RoomTypePO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8682933008145337716L;

	private Integer tid;//客房类型编号
	private String tname;//客房类型名称
	private Integer tnum;//客房数量
	private Integer pnum;//最大入住人数
	private String tdesc;//客房类型描述
	private String tdemo;//预留字段
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTnum() {
		return tnum;
	}
	public void setTnum(Integer tnum) {
		this.tnum = tnum;
	}
	public Integer getPnum() {
		return pnum;
	}
	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}
	public String getTdesc() {
		return tdesc;
	}
	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}
	public String getTdemo() {
		return tdemo;
	}
	public void setTdemo(String tdemo) {
		this.tdemo = tdemo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "RoomTypePO [tid=" + tid + ", tname=" + tname + ", tnum=" + tnum + ", pnum=" + pnum + ", tdesc=" + tdesc
				+ ", tdemo=" + tdemo + "]";
	}
			
}
