package com.iotu.dao;

import java.util.List;

import com.iotu.model.Type;

public interface ITypeDao {
	
	/**
	 * 得到博文类型的列表
	 * @return List<Type>
	 * @throws Exception
	 */
	public List<Type> getTypes() throws Exception;
}
