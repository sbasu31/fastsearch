package com.loganalyzer.services.interfaces;

import com.loganalyzer.config.interfaces.IConfiguration;

public interface ISearchEngine {
	public void doSearch() throws Exception;
	public void setConfig(IConfiguration config);
	public void gererateOutput() throws Exception;

}
