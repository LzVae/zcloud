package com.zxd.zcloud.controller;



import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.zxd.zcloud.util.MD5Util;
import com.zxd.zcloud.pojo.BaseResponse;
import com.zxd.zcloud.pojo.User;
import com.zxd.zcloud.service.UserService;

/**
* @Title: UserController.java  
* @Package com.zxd.zcloud.controller  
* @Description: TODO
* @author zhuxindong  E-mail:501801307@qq.com
* @date 创建时间：2018年5月15日 下午9:14:14
* @version 1.0
*/
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	

	@RequestMapping("/login")
	@ResponseBody
	public BaseResponse userLogin(@RequestParam(value = "username") String username,
								  @RequestParam(value = "password") String password,
								  @RequestParam(value = "rememberMe",required=false) String rememberMe,
								  HttpServletRequest request,
								  HttpServletResponse response){	
		
		User user = null;
		
		try {
			
			user = userService.getByUserName(username).get(0);
						
		} catch (Exception e) {
			
			return BaseResponse.success().add("resinfo", "nouser");
			
		}

		
		
		/**
		 * 校验用户名是否存在
		 */
		if (user == null) {
			
			return BaseResponse.success().add("resinfo", "nouser");
			
		}
		
		/**
		 * 如果用户名密码正确，返回用户信息
		 */
		if (user.getPassword().equals(MD5Util.getMD5(password))) {

			/**
			 * 加入到session
			 */

			request.getSession().setAttribute("user", user);

			/**
			 * 如果一周内自动登录
			 */
			if (rememberMe != null && rememberMe.equals("on")) {
				Cookie cookieUsername = new Cookie("username", username);
				Cookie cookiePssswordMD5 = new Cookie("passwordMD5", MD5Util.getMD5(password));
				cookieUsername.setMaxAge(60 * 60 * 24 * 7);
				cookiePssswordMD5.setMaxAge(60 * 60 * 24 * 7);

				response.addCookie(cookieUsername);
				response.addCookie(cookiePssswordMD5);
			}

			return BaseResponse.success().add("resinfo", "success");

		}

		return BaseResponse.success().add("resinfo", "errorpwd");
		
		
		
	}
	
	
	/**
	 * 我单纯拿来做路由的。。。。
	 * @Title: toHome  
	 * @Description: TODO
	 * @return String  
	 * @return
	 */
	@RequestMapping("/home")
	public String toHome() {
		
		System.out.println("to home");
		
		return "home";
		
	}
	
}
