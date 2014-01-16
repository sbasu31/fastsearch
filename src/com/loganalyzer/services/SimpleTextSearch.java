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
	private SearchEngineData searchEngineData;

	public SimpleTextSearch(SearchInput searchInput, SearchContent content) {
		// TODO Auto-generated constructor stub
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
	public void setSearchContent(SearchContent searchContent) {
		// TODO Auto-generated method stub
		this.searchContent = searchContent;
	}

	@Override
	public SearchContent getSearchContent() {
		// TODO Auto-generated method stub
		return this.searchContent;
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
		if(searchEngineData == null)
			searchEngineData = new SearchEngineData();
		if(searchEngineData.getData() == null){
			searchEngineData.setData(new ArrayList<StringBuilder>());
		}
		
		// get inputstring
		String searchStr = input.getSearchString();
		System.out.println("Search Started ....");
		List<StringBuilder> data = searchEngineData.getData();
		int lineNo =1;
		// take the file
		for (String fileName : searchContent.getFileList()) {
			try {
				File file = new File(fileName);				
				Scanner scanner = new Scanner(file);
				String line = null;
				while(scanner.hasNextLine()){
					line = scanner.nextLine();
					if(line.contains(searchStr)){
						data.add(new StringBuilder("[Line " +lineNo+"]"+line));
					}
				}
				
				scanner.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// take the search string

	}

	@Override
	public SearchEngineData getSearchEngineData() {
		// TODO Auto-generated method stub
		return this.searchEngineData;
	}

	@Override
	public void setSearchEngineData(SearchEngineData searchEngineData) {
		// TODO Auto-generated method stub
		this.searchEngineData = searchEngineData;
	}

}
