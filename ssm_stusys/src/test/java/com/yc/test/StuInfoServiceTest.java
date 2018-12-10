package com.yc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yc.po.JsonObject;
import com.yc.po.StuInfoPO;
import com.yc.service.StuInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class StuInfoServiceTest {

	@Autowired
	private StuInfoService stuInfoService;
	
	@Test
	public void add(){
		StuInfoPO po = new StuInfoPO();
		po.setSname("丽丽");
		po.setPwd("a");
		po.setSex("女");
		po.setAge(20);
		po.setPhoto("../images/1.png");
		System.out.println(stuInfoService.addStuInfo(po));
	}
	
	@Test
	public void find(){
		StuInfoPO po = new StuInfoPO();
		po.setSname("张三");
		po.setPwd("a");
		//po.setSex("男");
		//po.setAge(20);
		//po.setPhoto("../images/1.png");
		System.out.println(stuInfoService.findAll(po));
	}
	
	@Test
	public void update(){
		StuInfoPO po = new StuInfoPO();
		po.setSname("张三");
		//po.setPwd("b");
		//po.setSex("男");
		//po.setAge(23);
		//po.setPhoto("../images/1.png");
		po.setSid(1);
		System.out.println(stuInfoService.update(po));
	}
	
	@Test
	public void byPage(){
//		JsonObject js = new JsonObject();
//		js.setPageNo(2);
//		js.setPageSize(2);
//		js.setBeginRow(2);
		System.out.println(stuInfoService.findByPage("1","2"));
	}
	
}
