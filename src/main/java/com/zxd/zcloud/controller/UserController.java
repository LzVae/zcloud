package com.zxd.zcloud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zxd.zcloud.dao.UserMapper;

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

	@RequestMapping("/login")
	public void UserLogin(HttpServletResponse response, HttpServletRequest request) throws ServletException, IOException {
		
		System.out.println("one user login!");
		
		request.getRequestDispatcher("/WEB-INF/views/home.html").forward(request,response);
	}
	
	
}
