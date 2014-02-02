package com.test;



import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class TestRange {
	public static void main(String[]args){
		String rangeStart = "--> Result:";
		String rangeEnd = "--> }";
		// C:\Personal\my codebase\fastsearch\vpxd-1.log
		try {
			RandomAccessFile raf = new RandomAccessFile("C:\\Personal\\my codebase\\fastsearch\\vpxd-1.log", "r");
			int totalLength = (int) raf.length();
			System.out.println("Total Length of File :" +totalLength);
			List<List<String>> result = new ArrayList<List<String>>();
			boolean started = false;
			int lineNo = 1;
			int occurance = 0;
			List<String> list =null;
			while(true){
				String line = raf.readLine();
				if(line == null)
					break;
				if(!started){
					list = new ArrayList<String>();
				}
				if(line.startsWith(rangeStart) && !started ){
					occurance++;
					list = new ArrayList<String>();
					started = true;
				}
				if(started){
					list.add("[ "+lineNo+" ] "+line);
					
				}
				if(line.startsWith(rangeEnd)){
					started = false;
					result.add(list);
					
				}
				lineNo++;
			}
			int occurance1 =1;
			File file = new File("output1.txt");
			PrintWriter writer = new PrintWriter(file);
			for(List<String>list1 : result){
				if(occurance1/10 == 0){
					writer.close();
					file = new File("output"+occurance1/10+".txt");
					writer = new PrintWriter(file);
				}
				writer.println("Occurance No : " + occurance1);
				for(String printline : list1){
					writer.println(printline);
				}
				writer.println("\n\n\n");
				occurance1++;
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
