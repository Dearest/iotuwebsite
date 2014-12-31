package com.iotu.dao;

import java.util.List;

import com.iotu.model.Content;
import com.iotu.model.Page;
import com.iotu.model.SearchParams;

public interface IContentDao {
	

	/**
	 * 得到博文列表 默认以日期先后排序
	 * @param page
	 * @param searchParams
	 * @return
	 * @throws Exception
	 */
	public List<Content> getContents(Page page,SearchParams searchParams) throws Exception;
	
	/**
	 * 保存博文
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public Content saveContent(Content content) throws Exception;
	
	/**
	 * 删除博文
	 * @param content
	 * @return
	 * @throws Exception
	 */
	public String delContent(Content content) throws Exception;
	
	/**
	 * 以Id查找content
	 * @return
	 * @throws Exception
	 */
	public Content findContentById(Content content) throws Exception;
}
