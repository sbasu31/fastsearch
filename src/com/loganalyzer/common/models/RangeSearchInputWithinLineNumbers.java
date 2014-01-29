package com.loganalyzer.common.models;

public class RangeSearchInputWithinLineNumbers {
	private String searchStart ;
	private String searchEnd;
	private int lineNumStart;
	private int lineNumEnd;
	public String getSearchStart() {
		return searchStart;
	}
	public void setSearchStart(String searchStart) {
		this.searchStart = searchStart;
	}
	public String getSearchEnd() {
		return searchEnd;
	}
	public void setSearchEnd(String searchEnd) {
		this.searchEnd = searchEnd;
	}
	public int getLineNumStart() {
		return lineNumStart;
	}
	public void setLineNumStart(int lineNumStart) {
		this.lineNumStart = lineNumStart;
	}
	public int getLineNumEnd() {
		return lineNumEnd;
	}
	public void setLineNumEnd(int lineNumEnd) {
		this.lineNumEnd = lineNumEnd;
	}
	
}
