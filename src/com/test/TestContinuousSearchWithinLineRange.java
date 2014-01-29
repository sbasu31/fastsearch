package com.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import com.loganalyzer.common.models.RangeSearchInputWithinLineNumbers;

class ContinuousSearchInput{
	private int startLineNo;
	private int endLineNo;
	private String searchString;
	public int getStartLineNo(){
		return this.startLineNo;
	}
	public void setStartLineNo(int startLineNo){
		this.startLineNo = startLineNo;				
	}
	
	public int getEndLineNo(){
		return this.endLineNo;
	}
	public void setEndLineNo(int endLineNo){
		this.endLineNo = endLineNo;
	}
	public String getsearchString(){
		return this.searchString;
	}
    public void setSearchString(String searchString){
    	this.searchString = searchString;
    }
	
}
public class TestContinuousSearchWithinLineRange {
	
	public static void main(String[] args){
		ContinuousSearchInput input = new ContinuousSearchInput();
		input.setSearchString("printDetailedObject");
		input.setStartLineNo(78);
		input.setEndLineNo(200);
		
		try {
			RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Sudipto\\Desktop\\logs-zip\\logs\\profiles.hostprofiles.update.Pos040.txt", "r");
			boolean found = false;
			int lineNo = input.getStartLineNo();
			raf.seek(input.getStartLineNo());
			String line = raf.readLine();
			
			while(line != null){
				if(!found){
					
				}
				if(line.contains(input.getsearchString())){
					
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
