package com.yc.hotel.po;

import java.io.Serializable;

/**
 * Menber 会员表
 * @author 38929
 *
 */
public class MemberPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8461010677060543414L;

	private Integer mid;//会员编号		
	private String mname;//会员姓名
	private String mpwd;//会员密码
	private String mcard;//身份证号码  18位
	private String mtel;//手机号码
	private String mlevel;//会员等级
	private String mintegral;//会员积分
	private String mbalance;//账户余额
	private String mdemo;//预留字段
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMpwd() {
		return mpwd;
	}
	public void setMpwd(String mpwd) {
		this.mpwd = mpwd;
	}
	public String getMcard() {
		return mcard;
	}
	public void setMcard(String mcard) {
		this.mcard = mcard;
	}
	public String getMtel() {
		return mtel;
	}
	public void setMtel(String mtel) {
		this.mtel = mtel;
	}
	public String getMlevel() {
		return mlevel;
	}
	public void setMlevel(String mlevel) {
		this.mlevel = mlevel;
	}
	public String getMintegral() {
		return mintegral;
	}
	public void setMintegral(String mintegral) {
		this.mintegral = mintegral;
	}
	public String getMbalance() {
		return mbalance;
	}
	public void setMbalance(String mbalance) {
		this.mbalance = mbalance;
	}
	public String getMdemo() {
		return mdemo;
	}
	public void setMdemo(String mdemo) {
		this.mdemo = mdemo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "MemberPO [mid=" + mid + ", mname=" + mname + ", mpwd=" + mpwd + ", mcard=" + mcard + ", mtel=" + mtel
				+ ", mlevel=" + mlevel + ", mintegral=" + mintegral + ", mbalance=" + mbalance + ", mdemo=" + mdemo
				+ "]";
	}
	
}
