package com.loganalyzer.searchinputs;

import java.util.Scanner;

import com.loganalyzer.common.enums.SearchRangeType;
import com.loganalyzer.common.enums.SearchType;
import com.loganalyzer.common.models.SearchInput;

public class SearchRangeTypeInput
{
   public boolean takeInput(SearchInput input, Scanner scanner){
      boolean exitFlag = false;
      System.out.println("\n\n\nPlease Select Type of Search Range");
      System.out.println("--------------------------------");
      System.out.println("1. Line No ");
      System.out.println(("2. Simple String"));
      System.out.println("3. Date");
      System.out.println("Please enter the selection (y for exit):");
      
      String inputStr =  null;
      if(scanner.hasNextLine())
    		  inputStr = scanner.nextLine();
        if(!"y".equalsIgnoreCase(inputStr)){
           //populateSearchInput
          if(inputStr.equalsIgnoreCase("1")){
             input.setSearchRangeType(SearchRangeType.LINE_NO);
          }else if("2".equals(inputStr)){
             input.setSearchRangeType(SearchRangeType.STRING);
          }else if("3".equalsIgnoreCase(inputStr))     {
             input.setSearchRangeType(SearchRangeType.DATE);
          }
        }else{
           exitFlag = true;
        }
        
       return exitFlag;
   }

}
