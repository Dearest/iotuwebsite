package com.iotu.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.iotu.dao.IContentDao;
import com.iotu.dao.ITypeDao;
import com.iotu.model.Content;
import com.iotu.model.Page;
import com.iotu.model.SearchParams;
import com.iotu.service.IContentService;

public class ContentServiceImpl implements IContentService{
	
	private IContentDao contentDao;
	private ITypeDao typeDao;

	public void setTypeDao(ITypeDao typeDao) {
		this.typeDao = typeDao;
	}

	public void setContentDao(IContentDao contentDao) {
		this.contentDao = contentDao;
	}

	public List<Content> getContents(Page page, SearchParams searchParams)
			throws Exception {
		List<Content> list1 = contentDao.getContents(page, searchParams);
		List<Content> list2 = new ArrayList<Content>();
		for (Content content : list1) {
			content.setAuthor(content.getUser().getName());
			content.setUser(null);
			list2.add(content);
		}
		return list2;
	}

	public Content saveContent(Content content) throws Exception {
		
		return contentDao.saveContent(content);
	}

	public String delContent(Content content) throws Exception {
		
		return null;
	}
}
