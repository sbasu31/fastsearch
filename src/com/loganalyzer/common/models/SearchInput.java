package com.loganalyzer.common.models;

import com.loganalyzer.common.enums.DataTypeSearch;
import com.loganalyzer.common.enums.SearchArea;
import com.loganalyzer.common.enums.SearchRangeType;
import com.loganalyzer.common.enums.SearchType;

public class SearchInput
{
	private SearchType searchType;
	private String searchString;
	private String searchRangeStart;
	private String searchRangeEnd;
	public String getSearchRangeStart()
   {
      return searchRangeStart;
   }
   public void setSearchRangeStart(String searchRangeStart)
   {
      this.searchRangeStart = searchRangeStart;
   }
   public String getSearchRangeEnd()
   {
      return searchRangeEnd;
   }
   public void setSearchRangeEnd(String searchRangeEnd)
   {
      this.searchRangeEnd = searchRangeEnd;
   }
   private SearchArea searchArea;  
	private String searchAreaRangeStart;
	private String searchAreaRangeEnd;
	private SearchRangeType searchRangeType;
	
	public SearchRangeType getSearchRangeType()
   {
      return searchRangeType;
   }
   public void setSearchRangeType(SearchRangeType searchRangeType)
   {
      this.searchRangeType = searchRangeType;
   }
   private DataTypeSearch dataTypeSearch;
	
	public DataTypeSearch getDataTypeSearch() {
		return dataTypeSearch;
	}
	public void setDataTypeSearch(DataTypeSearch dataTypeSearch) {
		this.dataTypeSearch = dataTypeSearch;
	}
	public SearchType getSearchType() {
		return searchType;
	}
	public void setSearchType(SearchType searchType) {
		this.searchType = searchType;
	}
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	@Override
   public String toString()
   {
      return "SearchInput [searchType=" + searchType + ", searchString="
               + searchString + ", searchRangeStart=" + searchRangeStart
               + ", searchRangeEnd=" + searchRangeEnd + ", searchArea="
               + searchArea + ", searchAreaRangeStart=" + searchAreaRangeStart
               + ", searchAreaRangeEnd=" + searchAreaRangeEnd
               + ", searchRangeType=" + searchRangeType + ", dataTypeSearch="
               + dataTypeSearch + "]";
   }
   public SearchArea getSearchArea() {
		return searchArea;
	}
	public void setSearchArea(SearchArea searchArea) {
		this.searchArea = searchArea;
	}
	public String getSearchAreaRangeStart() {
		return searchAreaRangeStart;
	}
	public void setSearchAreaRangeStart(String searchAreaRangeStart) {
		this.searchAreaRangeStart = searchAreaRangeStart;
	}
	public String getSearchAreaRangeEnd() {
		return searchAreaRangeEnd;
	}
	public void setSearchAreaRangeEnd(String searchAreaRangeEnd) {
		this.searchAreaRangeEnd = searchAreaRangeEnd;
	}
}
