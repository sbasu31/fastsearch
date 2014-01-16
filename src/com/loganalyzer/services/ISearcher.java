package com.loganalyzer.services;

import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;

public interface ISearcher {
	public void setSearchInput(SearchInput input);
	public void setSearchContent(SearchContent searchContent);	
	public SearchContent getSearchContent();
	public SearchInput getSearchInput();
	public void search();
	public SearchEngineData getSearchEngineData();
	public void setSearchEngineData(SearchEngineData searchEngineData);
	
}
