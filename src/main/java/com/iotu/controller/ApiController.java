package com.iotu.controller;

import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.iotu.model.Comment;
import com.iotu.model.Content;
import com.iotu.model.ContentHasType;
import com.iotu.model.Page;
import com.iotu.model.SearchParams;
import com.iotu.model.Type;
import com.iotu.model.User;
import com.iotu.service.ICommentService;
import com.iotu.service.IContentService;
import com.iotu.service.IUserSerivce;

@Controller
@RequestMapping("api")
public class ApiController {
	
	@Resource(name="contentService")
	private IContentService contentService;
	@Resource(name="userService")
	private IUserSerivce userSerivce;
	@Resource(name="commentService")
	private ICommentService commentService;
	
	/**
	 * 登录 
	 * @param user
	 * @return 包含name token email 的user对象的json字符串
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public void login(User user,HttpServletResponse response) throws Exception{
		user = userSerivce.login(user);
		JSONObject result = new JSONObject();
		if(user != null){
			result.put("code", "100");
			result.put("response", user);
		}else {
			result.put("code", "111");//111登录失败 用户名或者密码错误
			result.put("result", "用户名或者密码错误");
		}

    	response.setCharacterEncoding("UTF-8");  
	    response.setContentType("text/json; charset=utf-8"); 
	    PrintWriter out = response.getWriter();
		out.append(result.toJSONString());
		out.flush();
		out.close();
	}
	
	/**获取博文列表
	 * @param page int整形 大于等于1 
	 * @return 包含博文列表的json字符串
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public void contentList(SearchParams searchParams,Page page,HttpServletResponse response,PrintWriter printWriter) throws Exception{
		List<Content> contents = contentService.getContents(page, searchParams);
		JSONObject result = new JSONObject();
		if(contents.isEmpty()){
			result.put("code", "121");//121博文列表为空
			result.put("response", "博文列表空");
		}else {
			result.put("code", "100");
			result.put("result", contents);
		}

    	response.setCharacterEncoding("UTF-8");  
	    response.setContentType("text/json; charset=utf-8"); 
	    PrintWriter out = response.getWriter();
		out.append(result.toJSONString());
		out.flush();
		out.close();
	}
	
	/**
	 * 发表博文
	 * @param content  title content token
	 * @return 表达是否成功发表的json字符串
	 * @throws Exception
	 */
	@RequestMapping("/publish")
	public void publish(Content content,HttpServletResponse response,PrintWriter printWriter,String token) throws Exception{
		JSONObject result = new JSONObject();
		Type type = new Type("android");
	
		
		User user = userSerivce.findToken(token);
		if(user != null){
			content.setTime(new Date());
			content.setUser(user);
			
			if(contentService.saveContent(content).getContentId() > 0){
				result.put("code", "100");
				result.put("result", "文章发表成功");
			}
		}else{
			result.put("code", "131");// 131 token 无效
			result.put("result", "token无效");
		}
		
		response.setCharacterEncoding("UTF-8");  
	    response.setContentType("text/json; charset=utf-8"); 
	    PrintWriter out = response.getWriter();
		out.append(result.toJSONString());
		out.flush();
		out.close();
	}
	
	/**发表评论
	 * @param comment contentId fromUser toUser  commentary isRecomment recommentId
	 * @param response
	 * @param printWriter
	 * @throws Exception
	 */
	@RequestMapping("/comment")
	public void comment(Comment comment,HttpServletResponse response,PrintWriter printWriter) throws Exception{
		
	}
	
	/**
	 * 获取博文类型的列表
	 * @param response
	 * @param printWriter
	 * @param publishTime
	 * @param token
	 * @throws Exception
	 */
	@RequestMapping("/types")
	public void types(HttpServletResponse response,PrintWriter printWriter,String token) throws Exception{
		
	}
	
}
