package com.loganalyzer.searchinputs;

import java.util.Scanner;

import com.loganalyzer.common.enums.DataTypeSearch;
import com.loganalyzer.common.enums.SearchType;
import com.loganalyzer.common.models.SearchInput;

public class SearchTypeInput {

	
	public boolean takeInput(SearchInput input, Scanner scanner) {
	   boolean exitFlag = false;
//		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n\nPlease Select Search Type");
		System.out.println("--------------------------------");
		System.out.println("1. Simple Search ");
		System.out.println(("2. Range Search"));
		System.out.println("Please enter the selection (y for exit):");
		String inputStr =  null;
		if(scanner.hasNextLine())
			inputStr = scanner.next();
        if(!"y".equalsIgnoreCase(inputStr)){
           //populateSearchInput
       	 if(inputStr.equalsIgnoreCase("1")){
       		 input.setSearchType(SearchType.SIMPLESEARCH);
       	 }else if("2".equals(inputStr)){
       		 input.setSearchType(SearchType.RANGE_SEARCH);
       	 }       	     	 
        }else{
           exitFlag = true;
        }
//        scanner.close();
        
		 return exitFlag;
	}
	

}
