package com.test;

import java.util.Scanner;

import com.loganalyzer.common.models.SearchContent;
import com.loganalyzer.common.models.SearchInput;
import com.loganalyzer.searchinputs.DataTypeSearchInput;
import com.loganalyzer.searchinputs.FilePathInput;
import com.loganalyzer.searchinputs.SearchAreaInput;
import com.loganalyzer.searchinputs.SearchRangeTypeInput;
import com.loganalyzer.searchinputs.SearchStringInput;
import com.loganalyzer.searchinputs.SearchTypeInput;

public class TestMain
{
   public static void main(String[]args){
	   System.out.println("WELCOME TO SEARCH ENGINE ");
	   System.out.println("==========================");
	   SearchInput input = new SearchInput();
	   Scanner scanner = new Scanner(System.in);
	   boolean exitFlag = new DataTypeSearchInput().takeInput(input,scanner);
	   if(!exitFlag)
	      exitFlag = new SearchTypeInput().takeInput(input,scanner);
	   
	   if(!exitFlag)
	      exitFlag = new SearchRangeTypeInput().takeInput(input,scanner);

	   if(!exitFlag)
         exitFlag = new SearchAreaInput().takeInput(input,scanner); 
	   
	   if(!exitFlag)
         exitFlag = new SearchStringInput().takeInput(input,scanner); 
	   
	   SearchContent searchContent = new SearchContent();
	   if(!exitFlag)
		   exitFlag = new FilePathInput().takeInput(searchContent,scanner);
     scanner.close();
      System.out.println("Given Input : "+input);
      System.out.println("File Selected : "+searchContent.getFileList().get(0));
      
      
   }
}
