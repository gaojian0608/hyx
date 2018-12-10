package com.yc.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.dao.StuInfoMapper;
import com.yc.po.JsonObject;
import com.yc.po.StuInfoPO;
import com.yc.service.StuInfoService;

@Service("stuInfoService")
public class StuInfoServiceImpl implements StuInfoService {
	@Autowired
	private StuInfoMapper stuInfoMapper;
	
	@Override
	public int addStuInfo(StuInfoPO po) {
		return stuInfoMapper.addStuInfo(po);
	}

	@Override
	public int update(StuInfoPO po) {
		return stuInfoMapper.update(po);
	}

	@Override
	public List<StuInfoPO> findAll(StuInfoPO po) {
		return stuInfoMapper.findAll(po);
	}

	/**
	 * 分页查询
	 */
	@Override
	public JsonObject findByPage(String pageNo,String pageSize) {
		JsonObject js = new JsonObject();
		if( pageNo == null || "".equals(pageNo) ){
			js.setPageNo(1);
		}else{
			js.setPageNo(Integer.parseInt(pageNo));
		}
		
		if( pageSize == null || "".equals(pageSize) ){
			js.setPageSize(0);
		}else{
			js.setPageSize(Integer.parseInt(pageSize));
		}
				
		js.setBeginRow((js.getPageNo()-1)*js.getPageSize()); //设置当前页第一行数据的位置
		JsonObject json = stuInfoMapper.findByPage(js);
		int total = stuInfoMapper.total();
		json.setTotal(total);
		return json;
	}

	@Override
	public List<StuInfoPO> findByMap(Map<String, Object> map) {
		return stuInfoMapper.findByMap(map);
	}

	@Override
	public StuInfoPO findByID(int sid) {
		StuInfoPO po = new StuInfoPO();
		po.setSid(sid);
		List<StuInfoPO> list = stuInfoMapper.findAll(po);
		return list.get(0);
	}

	
}
