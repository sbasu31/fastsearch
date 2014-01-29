package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class TestRange {
	public static void main(String[]args){
		String rangeStart = "--> Result:";
		String rangeEnd = "--> }";
		
		try {
			RandomAccessFile raf = new RandomAccessFile("E:\\shruti\\work\\Filed Bugs\\vpxd-1.log", "r");
			int totalLength = (int) raf.length();
			System.out.println("Total Length of File :" +totalLength);
			
			int lineNo = 1;
			while(true){
				String line = raf.readLine();
				if(line == null)
					break;
				if(line.startsWith(rangeStart))
				{
					
				}
				lineNo++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
