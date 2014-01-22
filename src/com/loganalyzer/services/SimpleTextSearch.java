package com.loganalyzer.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchEngineData;
import com.loganalyzer.common.models.SearchInput;

public class SimpleTextSearch implements ISearcher {
	private SearchInput input;
	private SearchContent searchContent;
	private List<SearchEngineData> searchEngineDataList;

	public List<SearchEngineData> getSearchEngineDataList() {
		return searchEngineDataList;
	}

	public void setSearchEngineDataList(List<SearchEngineData> searchEngineDataList) {
		this.searchEngineDataList = searchEngineDataList;
	}

	public SimpleTextSearch(SearchInput searchInput) {
		// TODO Auto-generated constructor stub
		this.input = input;
	}

	public SearchInput getInput() {
		return input;
	}

	public void setInput(SearchInput input) {
		this.input = input;
	}

	public SimpleTextSearch() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setSearchInput(SearchInput input) {
		// TODO Auto-generated method stub
		this.input = input;
	}

	

	@Override
	public SearchInput getSearchInput() {
		// TODO Auto-generated method stub
		return this.input;
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		//Initialize output content
		searchEngineDataList = new ArrayList<SearchEngineData>();	
		
		// get inputstring
		String searchStr = input.getSearchString();
		System.out.println("Search Started for search string : ...."+searchStr);
		int lineNo =1;
		Scanner scanner = null;
		// take the file
		for (String fileName : input.getFileList()) {
			SearchEngineData seData = new SearchEngineData();
			seData.setData(new ArrayList<StringBuilder>());
			seData.setHeader(buildHeader());
			seData.setFooter(buildFooter());
			try {
				File file = new File(fileName);				
				scanner = new Scanner(file);
				seData.setFileName(fileName);
				seData.setSearchStr(searchStr);
				String line = null;
				while(scanner.hasNextLine()){
					line = scanner.nextLine();
					if(line.contains(searchStr)){
						seData.getData().add(new StringBuilder("[Line " +lineNo+"]"+line));
					}
				}
				
				scanner.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			searchEngineDataList.add(seData);
		}
		// take the search string

	}

	private String buildFooter() {
		// TODO Auto-generated method stub
		String footer = "Search Result Ends Here";
		return null;
	}

	private String buildHeader() {
		// TODO Auto-generated method stub
		String header = "Search Result for Search String - "+input.getSearchString();
		return header;
	}

	

}
