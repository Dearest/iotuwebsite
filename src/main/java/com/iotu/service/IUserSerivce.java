package com.iotu.service;

import com.iotu.model.User;

public interface IUserSerivce {
	
	/**登录
	 * @param user
	 * @return user對象 只包含id name token role email picture
	 * @throws Exception
	 */
	public User login(User user) throws Exception;
	
	/**查询token是否存在
	 * @param token
	 * @return true存在  false 不存在
	 * @throws Exception
	 */
	public User findToken(String token) throws Exception;
}
