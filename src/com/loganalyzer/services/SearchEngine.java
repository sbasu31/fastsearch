package com.loganalyzer.services;

import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.config.interfaces.ConfigurationBuilder;

public class SearchEngine implements ISearchEngine{
	private SearchInput input;

	@Override
	public void setSearchInput(SearchInput input) {
		// TODO Auto-generated method stub
		this.input = input;
	}

	@Override
	public SearchInput getSearchInput() {
		// TODO Auto-generated method stub
		return input;
	}

	@Override
	public String executeSearch() throws Exception {
		// TODO Auto-generated method stub
		// buildConfig
		ConfigurationBuilder config = new ConfigurationBuilder();
		config.buildConfig(input);
		ISearcher searcher = config.getSearchEngine();
		searcher.search();
		
		return null;
	}

}
