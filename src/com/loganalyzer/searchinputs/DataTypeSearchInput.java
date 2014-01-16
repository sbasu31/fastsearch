package com.loganalyzer.searchinputs;

import java.util.Scanner;

import org.omg.PortableInterceptor.SUCCESSFUL;

import com.loganalyzer.common.enums.DataTypeSearch;
import com.loganalyzer.common.models.SearchInput;

public class DataTypeSearchInput
{

   
   public boolean takeInput(SearchInput input, Scanner scanner)
   {
      boolean exitFlag = false;
//      Scanner scanner = new Scanner(System.in);
      
         
         System.out.println("Please select Type Data for Search : ");
         System.out.println("-------------------------------");
         System.out.println("1. Simple Text ");
         System.out.println("2. Date ");
         System.out.println("3. Regex ");
         System.out.println("Enter the Menu id (For exit type'y'): ");
         String inputStr = scanner.nextLine();
         if(!"y".equalsIgnoreCase(inputStr)){
            //populateSearchInput
        	 if(inputStr.equalsIgnoreCase("1")){
        		 input.setDataTypeSearch(DataTypeSearch.NORMAL_TEXT);
        	 }else if("2".equals(inputStr)){
        		 input.setDataTypeSearch(DataTypeSearch.DATE);
        	 }else{
        		 input.setDataTypeSearch(DataTypeSearch.REGEX);
        	 }        
        	         	 
         }else{
        	 System.out.println("\n\n\n Thanks for Using Log Analyzer");
        	 exitFlag = true;
         }
//         scanner.close();       
      
      return exitFlag;
      
   }
   
}
