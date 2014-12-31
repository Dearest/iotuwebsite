package com.iotu.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.mail.Session;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.iotu.model.Comment;
import com.iotu.model.Content;
import com.iotu.model.Page;
import com.iotu.model.SearchParams;
import com.iotu.model.User;
import com.iotu.service.ICommentService;
import com.iotu.service.IContentService;
import com.iotu.util.SystemConstant;

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
	@Resource(name="commentService")
	private ICommentService commentService;
	
	@RequestMapping("")
	public String list() {
		return "redirect:/blog/";
	}
	
	@RequestMapping("/")
	public String list(ModelMap modelMap,Page page,SearchParams searchParams) throws Exception{
		List<Content> contents = contentService.getContents(page, searchParams);
		
		modelMap.addAttribute("contents", contents);
		return "list";
	}
	

	/**
	 * 发表评论
	 * @param comment
	 * @param response
	 * @param printWriter
	 * @param contentId
	 * @throws Exception
	 */
	@RequestMapping("/comment")
	public void comment(Comment comment,HttpServletResponse response,PrintWriter printWriter,String contentId) throws Exception{
		JSONObject result = new JSONObject();
		System.out.println("contentId"+contentId);
		comment.setTime(new Date());
		comment.setContent(new Content(Integer.parseInt(contentId)));
		if (commentService.saveComment(comment).getCommentId() > 0) {
			result.put("code", "100");
			result.put("result", "评论发表成功");
		}else{
			result.put("code", "141");
			result.put("result", "评论发表失败");
		}
		out(result,response);
	}
	
	/**
	 * 文章的详情
	 * 包含了评论
	 * @param content
	 * @param modelMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/details")
	public String details(Content content,ModelMap modelMap) throws Exception{
		content = contentService.findContentById(content);
		modelMap.addAttribute("content", content);
		
		return "details";
	}
	
	/**
	 * 给文章点赞
	 * @param content
	 * @param response
	 * @throws Exception
	 */
	@RequestMapping("/star")
	public void star(Content content,HttpServletResponse response) throws Exception{
		
	}
	
	/**
	 * 打开发布博文的页面
	 * @param content
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/add")
	public String add(HttpSession session) throws Exception{
		User user = (User) session.getAttribute(SystemConstant.LOGIN_USER);
		if (user == null) {
			return "redirect:/user/login";
		}
		
		return "add";
	}
	
	@RequestMapping("/save")
	public String save(Content content,HttpSession session) throws Exception{
		
		User user = (User) session.getAttribute(SystemConstant.LOGIN_USER);
		
		if (user == null) {
			return "redirect:/user/login";
		}
		content.setTime(new Date());
		content.setUser(user);
		contentService.saveContent(content);
		
		return "redirect:/blog";
	}

	/**重构的带代码  输出json字符串
	 * @param result
	 * @param response
	 * @throws IOException
	 */
	public void out(JSONObject result,HttpServletResponse response) throws IOException{
		response.setCharacterEncoding("UTF-8");  
	    response.setContentType("text/json; charset=utf-8"); 
	    PrintWriter out = response.getWriter();
		out.append(result.toJSONString());
		out.flush();
		out.close();
	}
}
