package cn.com.lanou.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import cn.com.lanou.domain.User;
import cn.com.lanou.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);//建立日志
	
	@Resource
	private UserService userService;
	
	/**
	 * 注册
	 * @param request
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("register")
	public String register(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		logger.info("------");
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		User user = new User();
		user.setName(username);
		user.setPassword(password);
		
		
		userService.insertUser(user);
		logger.info("----------"  + user.getName() + "------------" + user.getPassword());
		model.addAttribute("user", user);
		return "success";
	}
	
	
	
	
	/**
	 * 异步提交
	 * @param request
	 * @param user
	 * @param response
	 * @param model
	 * @return
	 */
	@RequestMapping("registerAjax")
	public void registerAjax(HttpServletRequest request, User user, HttpServletResponse response, Model model) {
		
		logger.info("------");
		
		
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
		
//		User user = new User();
//		user.setName(username);
//		user.setPassword(password);
		
		
		userService.insertUser(user);
		logger.info("----------"  + user.getName() + "------------" + user.getPassword());
		
		try {
			
			String jsonstr = "{"
					+ "username:\"qwwqe\","
					+ "result\":\"ok\""
				+ "}";
			
			
			
			PrintWriter out = response.getWriter();
			out.print(jsonstr);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	@RequestMapping("demo")
	public String demo(HttpServletRequest request, Model model) {
//		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
//		
//		Map<String, String> map = (Map<String, String>) new HashMap();
//		map.put("")
		List<Map<String, String>> list = new ArrayList<Map<String, String>>();
		
		Map<String, String> map = new HashMap<String, String>();
		
		//map.put(key, value)
		
		
		return "success";
	}
	
	
	
	
}
