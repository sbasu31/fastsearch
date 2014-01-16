package com.loganalyzer.common.models;

import java.util.List;

public class SearchEngineData {
	private SearchInput searchInput;
	private List<StringBuilder> data;
	public SearchInput getSearchInput() {
		return searchInput;
	}
	public void setSearchInput(SearchInput searchInput) {
		this.searchInput = searchInput;
	}
	public List<StringBuilder> getData() {
		return data;
	}
	public void setData(List<StringBuilder> data) {
		this.data = data;
	}
}
