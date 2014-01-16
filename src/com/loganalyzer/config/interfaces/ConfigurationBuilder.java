package com.loganalyzer.config.interfaces;

import com.loganalyzer.common.enums.FilePrefix;
import com.loganalyzer.common.enums.OutputFileFormat;
import com.loganalyzer.common.models.OutputConfig;
import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.outputs.IOutputRepository;
import com.loganalyzer.outputs.IReportGenerator;
import com.loganalyzer.services.ISearcher;
import com.loganalyzer.services.RangeSearch;
import com.loganalyzer.services.SimpleTextSearch;

public class ConfigurationBuilder implements IConfiguration {
	private ISearcher searchEngine;
	private IReportGenerator reportGenerator;
	

	@Override
	public void buildConfig(SearchInput searchInput, SearchContent content) {
		buildSearchEngine(searchInput,content);
		if(isSearchInputForSimpleSearch(searchInput)){
			searchEngine = new SimpleTextSearch(searchInput,content);
			searchEngine.setSearchEngineData(new SearchEngineData());
		}
		else if(isSearchInputForRangeSearch(searchInput)){
			searchEngine = new RangeSearch(searchInput,content);
			searchEngine.setSearchEngineData(new SearchEngineData());
		}
		OutputConfig outputConfig = buildOutputConfig(searchInput);
		buildReportGenerator(searchInput,content);
		
	}

	private void buildReportGenerator(SearchInput searchInput,
			SearchContent content) {
		// TODO Auto-generated method stub
		
	}

	private void buildSearchEngine(SearchInput searchInput,
			SearchContent content) {
		if(isSearchInputForSimpleSearch(searchInput)){
			this.searchEngine = new SimpleTextSearch();			
		}else if(isSearchInputForRangeSearch(searchInput)){
			this.searchEngine = new RangeSearch();
		}
		searchEngine.setSearchInput(searchInput);
		searchEngine.setSearchContent(content);
		searchEngine.setSearchEngineData(new SearchEngineData());
	}

	private OutputConfig buildOutputConfig(SearchInput searchInput) {
		OutputConfig outputConfig = new OutputConfig();
		/*
		 * outputFileLocation = "C:\\fastsearch\\output\\";
	private FilePrefix filePrefixType;
	private OutputFileFormat fileFormat;
		 */
		if(searchInput.getOutputFileLocation() !=null){
			outputConfig.setOutputFileLocation(searchInput.getOutputFileLocation());
		}
		if(searchInput.getFileFormat()!=null){
			outputConfig.setFileFormat(searchInput.getFileFormat());
		}
		return null;
	}

	private boolean isSearchInputForRangeSearch(SearchInput searchInput) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean isSearchInputForSimpleSearch(SearchInput searchInput) {
		return false;
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
