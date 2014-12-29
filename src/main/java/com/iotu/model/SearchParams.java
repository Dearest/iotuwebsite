package com.iotu.model;

/**
 * @author 查询或者过滤的关键字 备用
 * 
 */
@SuppressWarnings("serial")
public class SearchParams implements java.io.Serializable{
	/**
	 * 搜索关键字
	 */
	private String searchKey;

	
	/**
	 * 开始时间
	 */
	private String startTime;
	
	/**
	 * 结束时间
	 */
	private String endTime;
	
	
	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}



	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}


}
