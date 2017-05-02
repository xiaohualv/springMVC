/*
 * 文件名：HelloWorldController.java
 * 版权：Copyright by www.qimooc.com
 * 描述：
 * 修改人：laozhuang
 * 修改时间：2017年5月2日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.laozhuang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/helloworld")
public class HelloWorldController {

	@RequestMapping(value = "/index", method = { RequestMethod.GET })
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", "Hello World!");
		modelAndView.setViewName("index");
		return modelAndView;
	}
}
