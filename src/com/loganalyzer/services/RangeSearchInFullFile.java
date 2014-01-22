package com.loganalyzer.services;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;

public class RangeSearchInFullFile implements ISearcher {
	private SearchInput input;
	private SearchContent searchContent;
	private List<SearchEngineData> searchEngineDataList;

	public SearchInput getInput() {
		return input;
	}

	public void setInput(SearchInput input) {
		this.input = input;
	}

	public SearchContent getSearchContent() {
		return searchContent;
	}

	public void setSearchContent(SearchContent searchContent) {
		this.searchContent = searchContent;
	}

	public RangeSearchInFullFile(SearchInput searchInput) {
		this.input = searchInput;
	}

	public RangeSearchInFullFile() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSearchInput(SearchInput input) {
		// TODO Auto-generated method stub

	}

	

	@Override
	public SearchInput getSearchInput() {
		// TODO Auto-generated method stub
		return input;
	}

	@Override
	public void search() {
		String rangeStart = input.getSearchRangeStart();
		String rangeEnd = input.getSearchRangeEnd();
		
	}

	@Override
	public List<SearchEngineData> getSearchEngineDataList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSearchEngineDataList(List<SearchEngineData> searchEngineDataList) {
		// TODO Auto-generated method stub
		searchEngineDataList = new ArrayList<SearchEngineData>();
		int lineNo = 1;
		for (String fileName : input.getFileList()) {
			try {
				RandomAccessFile raf = new RandomAccessFile(fileName,"r");
				String line = null;
//				while(raf.readLine())
//				String line = raf.readLine()
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
