package com.loganalyzer.common.models;

import java.util.ArrayList;
import java.util.List;

import com.loganalyzer.common.enums.DataTypeSearch;
import com.loganalyzer.common.enums.FilePrefix;
import com.loganalyzer.common.enums.OutputFileFormat;
import com.loganalyzer.common.enums.SearchArea;
import com.loganalyzer.common.enums.SearchRangeType;
import com.loganalyzer.common.enums.SearchType;

public class SearchInput
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataTypeSearch == null) ? 0 : dataTypeSearch.hashCode());
		result = prime * result
				+ ((fileFormat == null) ? 0 : fileFormat.hashCode());
		result = prime * result
				+ ((fileList == null) ? 0 : fileList.hashCode());
		result = prime
				* result
				+ ((outputFileLocation == null) ? 0 : outputFileLocation
						.hashCode());
		result = prime * result
				+ ((prefixType == null) ? 0 : prefixType.hashCode());
		result = prime * result
				+ ((searchArea == null) ? 0 : searchArea.hashCode());
		result = prime
				* result
				+ ((searchAreaRangeEnd == null) ? 0 : searchAreaRangeEnd
						.hashCode());
		result = prime
				* result
				+ ((searchAreaRangeStart == null) ? 0 : searchAreaRangeStart
						.hashCode());
		result = prime * result
				+ ((searchRangeEnd == null) ? 0 : searchRangeEnd.hashCode());
		result = prime
				* result
				+ ((searchRangeStart == null) ? 0 : searchRangeStart.hashCode());
		result = prime * result
				+ ((searchRangeType == null) ? 0 : searchRangeType.hashCode());
		result = prime * result
				+ ((searchString == null) ? 0 : searchString.hashCode());
		result = prime * result
				+ ((searchType == null) ? 0 : searchType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SearchInput other = (SearchInput) obj;
		if (dataTypeSearch != other.dataTypeSearch)
			return false;
		if (fileFormat != other.fileFormat)
			return false;
		if (fileList == null) {
			if (other.fileList != null)
				return false;
		} else if (!fileList.equals(other.fileList))
			return false;
		if (outputFileLocation == null) {
			if (other.outputFileLocation != null)
				return false;
		} else if (!outputFileLocation.equals(other.outputFileLocation))
			return false;
		if (prefixType != other.prefixType)
			return false;
		if (searchArea != other.searchArea)
			return false;
		if (searchAreaRangeEnd == null) {
			if (other.searchAreaRangeEnd != null)
				return false;
		} else if (!searchAreaRangeEnd.equals(other.searchAreaRangeEnd))
			return false;
		if (searchAreaRangeStart == null) {
			if (other.searchAreaRangeStart != null)
				return false;
		} else if (!searchAreaRangeStart.equals(other.searchAreaRangeStart))
			return false;
		if (searchRangeEnd == null) {
			if (other.searchRangeEnd != null)
				return false;
		} else if (!searchRangeEnd.equals(other.searchRangeEnd))
			return false;
		if (searchRangeStart == null) {
			if (other.searchRangeStart != null)
				return false;
		} else if (!searchRangeStart.equals(other.searchRangeStart))
			return false;
		if (searchRangeType != other.searchRangeType)
			return false;
		if (searchString == null) {
			if (other.searchString != null)
				return false;
		} else if (!searchString.equals(other.searchString))
			return false;
		if (searchType != other.searchType)
			return false;
		return true;
	}
	private SearchType searchType; // This is about the searchType, whether it is simple search or range search
	private String searchString;
	private String searchRangeStart;
	private String searchRangeEnd;
	private String outputFileLocation;
	private FilePrefix prefixType;
	private OutputFileFormat fileFormat;
	
	List<String> fileList = new ArrayList<String>();
	
	public List<String> getFileList() {
		return fileList;
	}
	public void setFileList(List<String> fileList) {
		this.fileList = fileList;
	}
	public String getOutputFileLocation() {
		return outputFileLocation;
	}
	public void setOutputFileLocation(String outputFileLocation) {
		this.outputFileLocation = outputFileLocation;
	}
	public FilePrefix getPrefixType() {
		return prefixType;
	}
	public void setPrefixType(FilePrefix prefixType) {
		this.prefixType = prefixType;
	}
	public OutputFileFormat getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(OutputFileFormat fileFormat) {
		this.fileFormat = fileFormat;
	}
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
