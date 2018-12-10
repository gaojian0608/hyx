package com.yc.po;

/**
 * 分页
 * @author 38929
 *
 */
public class JsonObject {

	private int pageNo = 1;
	private int pageSize = 10;
	private int total;
	//private int totalPage;
	private Object rows;// total:"",rows:[{},{},{}]
	private int beginRow; //每页显示第一行的位置
	
	
	public int getBeginRow() {
		return beginRow;
	}
	public void setBeginRow(int beginRow) {
		this.beginRow = beginRow;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}
	public JsonObject() {
		super();
	}
	public JsonObject(int pageNo, int pageSize) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
	}
	public JsonObject(int pageNo, int pageSize, int total, Object rows) {
		super();
		this.pageNo = pageNo;
		this.pageSize = pageSize;
		this.total = total;
		this.rows = rows;
	}
	@Override
	public String toString() {
		return "JsonObject [pageNo=" + pageNo + ", pageSize=" + pageSize + ", total=" + total + ", rows=" + rows
				+ ", beginRow=" + beginRow + "]";
	}
	
	
	
}
