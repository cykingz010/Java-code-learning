package com.Blog.Gakari.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@GetMapping("/hello")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		
		//创建测试list
		List<String> names = new ArrayList<String>();
		names.add("111");
		names.add("222");
		names.add("333");
		//设置model数据
		mav.addObject("msg", "this is key msg");
		mav.addObject("hashira",names);
		mav.setViewName("hello");//设置显示的视图
		return mav;
	}


	
}
