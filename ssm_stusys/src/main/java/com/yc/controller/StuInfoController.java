package com.yc.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yc.po.JsonObject;
import com.yc.po.StuInfoPO;
import com.yc.service.StuInfoService;

//@RequestMapping("/stuInfo")
@Controller
public class StuInfoController {

	@Autowired
	private StuInfoService stuInfoService;
	
	/**
	 * 添加学生
	 * @param po
	 * @return
	 */
	@RequestMapping("/addStuInfo")
	@ResponseBody
	public int addStuInfo(StuInfoPO po,HttpServletRequest request,@RequestParam("stupic") MultipartFile stupic) {
		if( !stupic.isEmpty() ){
			try{
				String path = request.getSession().getServletContext().getRealPath("");
				//request.getServletContext().getRealPath("");
				//System.out.println(path);
				//存储图片的位置   第一种：直接存到项目下       第二种：服务器中创建一个项目用来存储图片     图片不能重名
				String savepath = "../images/"+System.currentTimeMillis()+stupic.getOriginalFilename();
				//System.out.println(savepath);
				File dest = new File(path+savepath);
				stupic.transferTo(dest);  //文件上传
				po.setPhoto(savepath); //设置路径到po对象中	
			}catch(Exception e){
				e.printStackTrace();
			}		
		}
		return stuInfoService.addStuInfo(po);
	}

	/**
	 * 修改学生信息
	 * @param po
	 * @return
	 */
	@RequestMapping("/update")
	public int update(StuInfoPO po) {
		return stuInfoService.update(po);
	}

	/**
	 * 查询所有
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<StuInfoPO> findAll(StuInfoPO po) {
		return stuInfoService.findAll(po);
	}
	
	/**
	 * 分页查询
	 * @param page
	 * @param rows
	 * @return
	 */
	@RequestMapping("/findByPage")
	@ResponseBody
	public JsonObject findByPage(@RequestParam(value="page")String page,@RequestParam("rows")String rows) {
		System.out.println("findByPage...");
		return stuInfoService.findByPage(page, rows);
	}
	
}
