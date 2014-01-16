package com.loganalyzer.searchinputs;

import java.util.Scanner;

import com.loganalyzer.common.models.SearchContent;

public class FilePathInput {
	
	public boolean takeInput(SearchContent searchContent, Scanner scanner){
		boolean exitFlag = false;
		System.out.println("Please Give complete path of th file : ");
		String inputStr = null;
		if(scanner.hasNextLine()){
			inputStr = scanner.nextLine();
		}
		if(inputStr != null)
			searchContent.getFileList().add(inputStr);
		
		return exitFlag;
	}

}
