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
      SearchInput input = new SearchInput();
      SearchContent searchContent = new SearchContent();
      input.setDataTypeSearch(DataTypeSearch.NORMAL_TEXT);
      input.setSearchType(SearchType.SIMPLESEARCH);
      input.setSearchArea(SearchArea.FULLFILE);
      input.setSearchString("Property Ignored");
      
      searchContent.getFileList().add("C:\\Users\\shrutib\\Desktop\\logs\\profiles.hostprofiles.update.txt");
      ISearcher searchService = new SimpleTextSearch();
      searchService.setSearchContent(searchContent);
      searchService.setSearchInput(input);
      searchService.setSearchEngineData(new SearchEngineData());
      searchService.search();
      System.out.println(searchService.getSearchEngineData().getData().size());
   }

}
