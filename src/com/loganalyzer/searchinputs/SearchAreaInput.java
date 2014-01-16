package com.loganalyzer.searchinputs;

import java.util.Scanner;

import com.loganalyzer.common.enums.SearchArea;
import com.loganalyzer.common.enums.SearchType;
import com.loganalyzer.common.models.SearchInput;

public class SearchAreaInput 
{

   
   public boolean takeInput(SearchInput input, Scanner scanner)
   {
      boolean exitFlag = false;
      if(input !=null)
      {
         System.out.println("\n\n\nPlease Select Search Area : ");
         System.out.println("--------------------------------");
         System.out.println("1. Search Within a Range ");
         System.out.println(("2. Full File Search "));
         System.out.println("Please enter the selection (y for exit):");
         
         String inputStr = null;
         if(scanner.hasNextLine())
        		 inputStr = scanner.nextLine();
         if(!"y".equalsIgnoreCase(inputStr)){
            //populateSearchInput
           if(inputStr.equalsIgnoreCase("1")){
              input.setSearchArea(SearchArea.RANGE);                
           }else if("2".equals(inputStr)){
              input.setSearchArea(SearchArea.FULLFILE);
           }                 
         }else{
            exitFlag = true;
         }
      }         
      return exitFlag;
      // TODO Auto-generated method stub
      
   }
      
}
