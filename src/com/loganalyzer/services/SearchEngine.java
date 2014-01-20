package com.loganalyzer.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.config.interfaces.ConfigurationBuilder;
import com.loganalyzer.outputs.IReportGenerator;

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
		List<SearchEngineData>seDataList = searcher.getSearchEngineDataList();	     
		IReportGenerator reportGen = config.getReportGenerator();
		reportGen.generatereport();
		
		
		return null;
	}

}
