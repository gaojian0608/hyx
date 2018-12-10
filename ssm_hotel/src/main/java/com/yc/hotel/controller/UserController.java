package com.yc.hotel.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.hotel.po.UserPO;
import com.yc.hotel.service.UserService;
import com.yc.hotel.util.CookieTool;

/**
 * 员工控制类
 * @author 38929
 *
 */
@RequestMapping("/user")
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	/**
	 * 员工查询
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/findAll")
	@ResponseBody
	public List<UserPO> findByTerm(UserPO user){
		System.out.println("查找用户");
		return userService.findByTerm(user);
	}
	
	/**
	 * 员工删除
	 * @param uid
	 * @return
	 */
	@RequestMapping(value="/del/{uid}",method=RequestMethod.DELETE)
	@ResponseBody
	public int del(@PathVariable("uid") Integer uid){
		System.out.println("del。。。。。");
		return userService.delUser(uid);
		
		
	}
	/**
	 * 员工修改
	 * @param uid
	 * @param userInfoPO
	 * @return
	 */
	  @RequestMapping(value="/update/{uid}",method=RequestMethod.PUT)
	  @ResponseBody
	  public int update(@PathVariable("uid") Integer uid,UserPO user){	
		  user.setUid(uid);
		  System.out.println(user);
		  return userService.updateUser(user);
	  }
	/**
	 * 员工添加
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	@ResponseBody
	public int addUser(UserPO user){
		System.out.println(user);
		return userService.addUser(user);
		
	}

	/** 
     * 描述：登录验证 
     * @param request 
     * @param response 
     * @return 
     * @throws IOException 
     */  
    @RequestMapping(value="/login")  
    @ResponseBody
    public boolean index(UserPO user ,HttpServletRequest httpRequest,HttpServletResponse httpResponse) throws IOException{  
       /* String uname = httpRequest.getParameter("uname");  
        String upwd = httpRequest.getParameter("upwd"); 
        System.out.println(user);
        String str = null;  */
       // UtcUsersDao usersDao = new UtcUsersDao();  
        List<UserPO> users = userService.findByTerm(user);  
        if( users != null && users.size()>0 ){
        	return true;
        }
        /*if(users==null || users.size()==0){//登录验证失败  
           // logger.info("登录失败");  
            httpRequest.getSession().setAttribute("errorInfo","用户名或密码错误，请重新登录！");  
            String path = httpRequest.getContextPath();  
            String basePath = httpRequest.getScheme() + "://"+ httpRequest.getServerName() + ":" + httpRequest.getServerPort()+ path + "/";  
            httpResponse.sendRedirect(basePath+"self/logOn.do");  
        }else if ("10".equals(users.get(0).getUname())) {  
            int  loginMaxAge = 30*24*60*60;   //定义账户密码的生命周期，这里是一个月。单位为秒  
            String rememberPwd = httpRequest.getParameter("rememberPwd")==null?"":httpRequest.getParameter("rememberPwd").toString();  
            if ("rememberPwd".equals(rememberPwd)) {  
                CookieTool.addCookie(httpResponse , "loginName" , uname , loginMaxAge); //将姓名加入到cookie中  
                CookieTool.addCookie(httpResponse , "loginPwd" , upwd , loginMaxAge);   //将密码加入到cookie中  
            }  
            httpRequest.getSession().setAttribute("utcUsers", users);  
            str = "/Administrator";  
        }else {  
            int  loginMaxAge = 30*24*60*60;   //定义账户密码的生命周期，这里是一个月。单位为秒  
            String rememberPwd = httpRequest.getParameter("rememberPwd")==null?"":httpRequest.getParameter("rememberPwd").toString();  
            if ("rememberPwd".equals(rememberPwd)) {  
                CookieTool.addCookie(httpResponse , "loginName" , uname , loginMaxAge); //将姓名加入到cookie中  
                CookieTool.addCookie(httpResponse , "loginPwd" , upwd , loginMaxAge);   //将密码加入到cookie中  
            }  
            //将UtcUsers放到session中  
            httpRequest.getSession().setAttribute("Users", users);  
           // System.out.println("豪华");
            return  true;
        }  */
        return false;
    }  
  
}
