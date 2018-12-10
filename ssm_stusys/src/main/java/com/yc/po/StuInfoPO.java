package com.yc.po;

import java.io.Serializable;

/**
 * 学生信息
 * @author 38929
 *
 */
public class StuInfoPO implements Serializable{

	private Integer sid;
	private String sname;
	private String pwd;
	private String sex;
	private Integer age;
	private String photo;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	/**
	 * 系统上线时 删除此打印方法
	 */
	@Override
	public String toString() {
		return "StuInfoPO [sid=" + sid + ", sname=" + sname + ", pwd=" + pwd + ", sex=" + sex + ", age=" + age
				+ ", photo=" + photo + "]";
	}
	
}
