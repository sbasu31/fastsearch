package com.zeelabs.analyze;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class LogAnalyser
{
   public void analyze(String fileName,
                       String firstString,
                       String lastString)
   {
      try {
         File file = new File(fileName);
         FileReader fis = new FileReader(file);
         String currentLine = null;
         
         PrintWriter writer = new PrintWriter("the-file-name.txt", "UTF-8");
         int lineNo =0;
         boolean firstStringRead = false;
         BufferedReader br = new BufferedReader(fis);
         while((currentLine=br.readLine())!=null){
            if((currentLine.contains(firstString)&&!firstStringRead)||(firstStringRead)){
               writer.println(lineNo + " " +currentLine );
               lineNo ++ ;
               if(firstStringRead && currentLine.contains(lastString)){
                  firstStringRead = false;
                  writer.println("End of Chunk \n\n");
               }else if(!firstStringRead)
                  firstStringRead = true;
            }           
         }
         
         writer.close();
         br.close();
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (UnsupportedEncodingException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
   }

   public void analyze(File file,
                       String firstString,
                       String lasString)
   {

   }

   public static void main(String[] args)
   {
      /*String fileName = args[0];
      String firstString = args[1];// String to be search by
      String lastString = args[2];*/
	   String fileName = "C:\\test.log";
	   String firstString= "Result:";
	   String lastString = "--> ]";
      new LogAnalyser().analyze(fileName, firstString, lastString);

   }

}
