package com.loganalyzer.outputs;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.loganalyzer.common.models.OutputConfig;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;

public class TextfileGenerator implements IReportGenerator{
	private OutputConfig outputConfig = null;
	private SearchInput input =null;
	private List<SearchEngineData> searchResult;
	

	public List<SearchEngineData> getSearchResult() {
		return searchResult;
	}

	public void setSearchResult(List<SearchEngineData> searchResult) {
		this.searchResult = searchResult;
	}

	@Override
	public void setHeader(String header) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFooter(String footer) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void setOutputConfig(OutputConfig outputConfig) {
		// TODO Auto-generated method stub
		this.outputConfig = outputConfig;
	}

	@Override
	public void generatereport() throws Exception {
		// TODO Auto-generated method stub
		String fileLoction = outputConfig.getOutputFileLocation();
		int fileIndex = 1;
		for(SearchEngineData seData : searchResult ){
			PrintWriter writer = new PrintWriter(fileLoction.trim()+"\\the-file-name-"+fileIndex+".txt", "UTF-8");
			
			writer.println("Start of Generate Report\n\n\n ");
			List<StringBuilder> dataList = seData.getData();
			writer.println(seData.getHeader());
			for(StringBuilder data :dataList){
				writer.println(data);
			}
			writer.println(seData.getFooter());
			writer.flush();
			writer.close();
		}
		
	}

	@Override
	public void setSearchInput(SearchInput input) {
		// TODO Auto-generated method stub
		this.setSearchInput(input);
	}

	
}
