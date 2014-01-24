package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestRange {
	public static void main(String[]args){
		String rangeStart = "--> Result:";
		String rangeEnd = "--> }";
		
		try {
			RandomAccessFile raf = new RandomAccessFile("E:\\shruti\\work\\Filed Bugs\\vpxd-1.log", "r");
			int totalLength = (int) raf.length();
			System.out.println("Total Length of File :" +totalLength);
			List<List<String>> result = new ArrayList<List<String>>();
			boolean started = false;
			int lineNo = 1;
			int occurance = 0;
			while(true){
				String line = raf.readLine();
				if(line == null)
					break;
				List<String> list =null;
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
			int occurance1;
			for(List<String>list : result){
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
