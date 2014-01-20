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
	private List<SearchEngineData> searchReslt;
	

	public List<SearchEngineData> getSearchReslt() {
		return searchReslt;
	}

	public void setSearchReslt(List<SearchEngineData> searchReslt) {
		this.searchReslt = searchReslt;
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
		for(SearchEngineData seData : searchReslt ){
			PrintWriter writer = new PrintWriter(fileLoction+"\the-file-name-"+fileIndex+".txt", "UTF-8");
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
		
	}

	@Override
	public void setContent(List<SearchEngineData> outputData) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
