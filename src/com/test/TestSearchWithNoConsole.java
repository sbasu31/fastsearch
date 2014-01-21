package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.loganalyzer.common.enums.DataTypeSearch;
import com.loganalyzer.common.enums.OutputFileFormat;
import com.loganalyzer.common.enums.SearchArea;
import com.loganalyzer.common.enums.SearchType;
import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.services.ISearchEngine;
import com.loganalyzer.services.ISearcher;
import com.loganalyzer.services.SearchEngine;
import com.loganalyzer.services.SimpleTextSearch;

public class TestSearchWithNoConsole
{
   public static void main(String[]args){
	   //take inpputs
	   //ask for report generation
	   // in the report generator service, it will take inputs, form config and then call the respective searchengine
	   
	   //pass
      SearchInput input = new SearchInput();
      input.setDataTypeSearch(DataTypeSearch.NORMAL_TEXT);
      input.setSearchType(SearchType.SIMPLESEARCH);
      input.setSearchArea(SearchArea.FULLFILE);
      input.setSearchString("generateExpressionNameFromComplyLocator");  
      input.setFileFormat(OutputFileFormat.TEXTFILE);
      input.getFileList().add("C:\\logs\\logs-zip\\logs\\profiles.hostprofiles.update.Pos089.txt");
      
      ISearchEngine se = new SearchEngine();
      se.setSearchInput(input);
      try {
		String result = se.executeSearch();
		System.out.println(result);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
     
      /*ISearcher searchService = new SimpleTextSearch();
//      searchService.setSearchContent(searchContent);
      searchService.setSearchInput(input);
      searchService.search();
      
      List<SearchEngineData>seDataList = searchService.getSearchEngineDataList();
      Map<SearchInput,List<SearchEngineData>> searchResult = new HashMap<SearchInput,List<SearchEngineData>>();
      searchResult.put(input,searchService.getSearchEngineDataList());*/
      
      
   }

}
