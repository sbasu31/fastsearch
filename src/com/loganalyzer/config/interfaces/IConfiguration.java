package com.loganalyzer.config.interfaces;

import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.outputs.IOutputRepository;
import com.loganalyzer.outputs.IReportGenerator;
import com.loganalyzer.services.ISearcher;

public interface IConfiguration {
   public void buildConfig(SearchInput searchInput, SearchContent content);
   public ISearcher getSearchEngine() throws Exception;
   public IReportGenerator getReportGenerator() throws Exception;
   public IOutputRepository getOutputRepository() throws Exception;
}
