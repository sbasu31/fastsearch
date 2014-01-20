package com.loganalyzer.services;

import java.util.List;

import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;

public interface ISearcher {
	public void setSearchInput(SearchInput input);
	public SearchInput getSearchInput();
	public void search();
	public List<SearchEngineData> getSearchEngineDataList();
	public void setSearchEngineDataList(List<SearchEngineData> searchEngineDataList);
	
}
