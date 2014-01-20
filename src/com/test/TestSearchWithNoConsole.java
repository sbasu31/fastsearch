package com.test;

import com.loganalyzer.common.enums.DataTypeSearch;
import com.loganalyzer.common.enums.SearchArea;
import com.loganalyzer.common.enums.SearchType;
import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.services.ISearcher;
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
      input.setSearchString("Property Ignored");
      
      input.getFileList().add("C:\\Users\\shrutib\\Desktop\\logs\\profiles.hostprofiles.update.txt");
      ISearcher searchService = new SimpleTextSearch();
//      searchService.setSearchContent(searchContent);
      searchService.setSearchInput(input);
      searchService.search();
      
      
   }

}
