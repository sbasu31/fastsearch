package com.loganalyzer.outputs;

import java.util.List;
import java.util.Map;

import com.loganalyzer.common.models.OutputConfig;
import com.loganalyzer.common.models.SearchInput;

public interface IReportGenerator {
	public void setHeader(String header) throws Exception;

	public void setFooter(String footer) throws Exception;

	public void setContent(Map<SearchInput, List<String>> outputData)
			throws Exception;
	public void setOutputConfig(OutputConfig outputConfig);
	
}
