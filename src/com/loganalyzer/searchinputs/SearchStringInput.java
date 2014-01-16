package com.loganalyzer.searchinputs;

import java.util.Scanner;

import com.loganalyzer.common.enums.SearchRangeType;
import com.loganalyzer.common.enums.SearchType;
import com.loganalyzer.common.models.SearchInput;

public class SearchStringInput
{
   public boolean takeInput(SearchInput input, Scanner scanner){
      boolean exitFlag = false;
      String inputStr = null;
      if(input.getSearchType().equals(SearchType.SIMPLESEARCH)){
         System.out.println("Please Enter Search String");
         if(scanner.hasNextLine())
        	 inputStr = scanner.nextLine();
         input.setSearchString(inputStr);
      }else if(input.getSearchType().equals(SearchType.RANGE_SEARCH)){
         System.out.println("\n\nPlease Type the Range ");
         System.out.println("Range Starts With : ");
         input.setSearchRangeStart(scanner.nextLine());
         System.out.println("Range Ends With :");
         if(scanner.hasNextLine())
        	 inputStr = scanner.nextLine();
         input.setSearchRangeEnd(inputStr);
      }else
      if(input.getSearchRangeType().equals(SearchRangeType.STRING)){
         System.out.println("\n\n Please Type the Starting of the range");
         System.out.println("Range starts with :");
         if(scanner.hasNextLine())
        	 inputStr = scanner.nextLine();
         input.setSearchAreaRangeStart(inputStr);
         System.out.println("Range ends with :");
         input.setSearchRangeEnd(scanner.nextLine());
      }
     
      return exitFlag;
      
   }

}
