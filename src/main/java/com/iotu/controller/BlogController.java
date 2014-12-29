package com.iotu.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iotu.model.Page;
import com.iotu.service.IContentService;

/**
 * 博客页面控制器
 * @author HanChen
 *
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Resource(name="contentService")
	private IContentService contentService;
	
	@RequestMapping("")
	public String list() {
		return "redirect:/blog/";
	}
	
	@RequestMapping("/")
	public String list(ModelMap modelMap,Page Page) throws Exception{
		
		
		return "list";
	}
	
}
