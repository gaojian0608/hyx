package com.yc.hotel.po;

import java.io.Serializable;

/**
 * picture 图片表
 * @author 38929
 *
 */
public class PicturePO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6406571781182037411L;

	private Integer pid;//图片编号
	private Integer rmid;//客房编号
	private String pimg;//图片路径
	private String pdemo;//预留字段
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Integer getRmid() {
		return rmid;
	}
	public void setRmid(Integer rmid) {
		this.rmid = rmid;
	}
	public String getPimg() {
		return pimg;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public String getPdemo() {
		return pdemo;
	}
	public void setPdemo(String pdemo) {
		this.pdemo = pdemo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "PrcturePO [pid=" + pid + ", rmid=" + rmid + ", pimg=" + pimg + ", pdemo=" + pdemo + "]";
	}
		
}
