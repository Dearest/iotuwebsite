package com.iotu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import com.iotu.dao.IContentDao;
import com.iotu.model.Content;
import com.iotu.model.Page;
import com.iotu.model.SearchParams;
import com.iotu.util.PageTools;
import com.iotu.util.StringUtils;

public class ContentDaoImpl implements IContentDao{
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Content> getContents(Page page, SearchParams searchParams)
			throws Exception {
		String hql = "FROM Content c WHERE 1=1 ";
		String totalNumHql = "SELECT COUNT(*) FROM Content c WHERE 1=1 "; // 分页总数据量的的查询语句
		if(!StringUtils.empty(searchParams.getSearchKey())){
			totalNumHql += " AND c.title LIKE '%" + searchParams.getSearchKey()+ "%' ";
			hql += " AND c.title LIKE '%" + searchParams.getSearchKey()+ "%' ";
		}
		hql +=" ORDER By c.time";
		Query hqlquery = sessionFactory.getCurrentSession().createQuery(hql);
		Query totalQuery = sessionFactory.getCurrentSession().createQuery(totalNumHql);

		page.setTotalDataNum((Long) totalQuery.uniqueResult());
		PageTools.countTotalPageNum(page);
		int start = PageTools.countLimitStart(page);
		return (List<Content>) hqlquery.setFirstResult(start)
				.setMaxResults(page.getPerPageNum()).list();
	}

	public String saveContent(Content content) throws Exception {
		// TODO sql语句
		return null;
	}

	public String delContent(Content content) throws Exception {
		// TODO sql语句
		return null;
	}
	
	/**
	 * 生成查询条件的HQL语句
	 * 
	 * @param searchParams
	 * @return
	 */
	private String getSearchCondition(SearchParams searchParams) {
		String searchHql = "";

	
		if (!StringUtils.empty(searchParams.getSearchKey())) {
			searchHql += " AND c.title LIKE '%" + searchParams.getSearchKey()
					+ "%' ";
		}

		return searchHql;
	}


}
