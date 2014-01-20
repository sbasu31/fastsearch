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
	private Map<SearchInput,List<String>> outputData;

	@Override
	public void setHeader(String header) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFooter(String footer) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContent(Map<SearchInput, List<String>> outputData)
			throws Exception {
		// TODO Auto-generated method stub
		this.outputData = outputData;
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
		Set<SearchInput>keys = outputData.keySet();
		int fileIndex =1;
		for(SearchInput input : keys){
			PrintWriter writer = new PrintWriter("the-file-name-"+fileIndex+".txt", "UTF-8");
			writer.println("Start of Search Report\n\n\n ");
			List<String> dataList = outputData.get(input);
			for(String data :dataList){
				writer.println(data);
			}
			writer.flush();writer.close();
		}
		
		
		
	}

	@Override
	public void setSearchInput(SearchInput input) {
		// TODO Auto-generated method stub
		
	}

}
