package com.loganalyzer.common.models;

import java.util.List;

public class SearchEngineData {
	private String fileName;
	private String searchStr;
	private String header;
	private String footer;
	public String getHeader() {
		return header;
	}
	public void setHeader(String header) {
		this.header = header;
	}
	public String getFooter() {
		return footer;
	}
	public void setFooter(String footer) {
		this.footer = footer;
	}
	private List<StringBuilder> data;
	
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getSearchStr() {
		return searchStr;
	}
	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}
	public List<StringBuilder> getData() {
		return data;
	}
	public void setData(List<StringBuilder> data) {
		this.data = data;
	}
}
