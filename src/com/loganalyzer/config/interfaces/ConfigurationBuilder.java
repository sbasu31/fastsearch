package com.loganalyzer.config.interfaces;

import com.loganalyzer.common.enums.FilePrefix;
import com.loganalyzer.common.enums.OutputFileFormat;
import com.loganalyzer.common.models.OutputConfig;
import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.outputs.IOutputRepository;
import com.loganalyzer.outputs.IReportGenerator;
import com.loganalyzer.outputs.TextfileGenerator;
import com.loganalyzer.services.ISearcher;
import com.loganalyzer.services.RangeSearch;
import com.loganalyzer.services.SimpleTextSearch;

public class ConfigurationBuilder implements IConfiguration {
	private ISearcher searchEngine;
	private IReportGenerator reportGenerator;
	

	@Override
	public void buildConfig(SearchInput searchInput) {
		buildSearchEngine(searchInput);
		if(isSearchInputForSimpleSearch(searchInput)){
			searchEngine = new SimpleTextSearch(searchInput);
		}
		else if(isSearchInputForRangeSearch(searchInput)){
			searchEngine = new RangeSearch(searchInput);
		}
		OutputConfig outputConfig = buildOutputConfig(searchInput);
		buildReportGenerator(searchInput,outputConfig);
		
	}

	private void buildReportGenerator(SearchInput searchInput,
			OutputConfig outputConfig) {
		// TODO Auto-generated method stub
		if(searchInput.getFileFormat().equals(OutputFileFormat.TEXTFILE)){
			reportGenerator = new TextfileGenerator();
			reportGenerator.setOutputConfig(outputConfig);
			reportGenerator.setSearchInput(searchInput);
		}
		
	}

	private void buildSearchEngine(SearchInput searchInput
			) {
		if(isSearchInputForSimpleSearch(searchInput)){
			this.searchEngine = new SimpleTextSearch();			
		}else if(isSearchInputForRangeSearch(searchInput)){
			this.searchEngine = new RangeSearch();
		}
		searchEngine.setSearchInput(searchInput);
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
		if(searchInput.getPrefixType() !=null){
			outputConfig.setFilePrefixType(searchInput.getPrefixType());
		}
		return outputConfig;
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
