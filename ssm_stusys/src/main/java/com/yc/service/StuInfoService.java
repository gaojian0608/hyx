package com.yc.service;

import java.util.List;
import java.util.Map;

import com.yc.po.JsonObject;
import com.yc.po.StuInfoPO;

public interface StuInfoService {

	/**
	 * 添加学生信息
	 * @param po
	 * @return
	 */
	public int addStuInfo(StuInfoPO po);
	
	/**
	 * 修改学生信息
	 * @param po
	 * @return
	 */
	public int update(StuInfoPO po);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<StuInfoPO> findAll(StuInfoPO po);
	
	/**
	 * 分页查看
	 * @param js
	 * @return
	 */
	public JsonObject findByPage(String pageNo,String pageSize);
	
	/**
	 * 条件查看
	 * @param map
	 * @return
	 */
	public List<StuInfoPO> findByMap(Map<String, Object> map);
	
	/**
	 * ID查询
	 * @param id
	 * @return
	 */
	public StuInfoPO findByID(int id);
}
