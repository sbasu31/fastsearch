package com.loganalyzer.services;

import com.loganalyzer.common.models.SearchInput;

public interface ISearchEngine {
	public void setSearchInput(SearchInput input);
	public SearchInput getSearchInput();
	public String executeSearch() throws Exception;
	

}
