package com.yc.hotel.po;

import java.io.Serializable;

/**
 * Users 员工表
 * @author 38929
 *
 */
public class UserPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4458567802731993738L;
	
	private Integer uid;//员工编号
	private String uname;//员工姓名
	private String upwd;//员工密码
	private String utype;//员工职位
	private String ustate;//员工状态  在职 离职 退休
	private String udemo;//预留字段
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUtype() {
		return utype;
	}
	public void setUtype(String utype) {
		this.utype = utype;
	}
	public String getUstate() {
		return ustate;
	}
	public void setUstate(String ustate) {
		this.ustate = ustate;
	}
	public String getUdemo() {
		return udemo;
	}
	public void setUdemo(String udemo) {
		this.udemo = udemo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserPO [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", utype=" + utype + ", ustate=" + ustate
				+ ", udemo=" + udemo + "]";
	}
}
