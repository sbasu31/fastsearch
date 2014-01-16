package com.loganalyzer.config.interfaces;

import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.outputs.IOutputRepository;
import com.loganalyzer.outputs.IReportGenerator;
import com.loganalyzer.services.ISearcher;

public class SimpleSearchConfiguration implements IConfiguration {

	@Override
	public void buildConfig(SearchInput searchInput, SearchContent content) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ISearcher getSearchEngine() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IReportGenerator getReportGenerator() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IOutputRepository getOutputRepository() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
