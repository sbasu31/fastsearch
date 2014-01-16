package com.loganalyzer.common.models;

import java.util.ArrayList;
import java.util.List;

public class SearchContent {
	List<String> fileList = new ArrayList<String>();

	public List<String> getFileList() {
		return fileList;
	}

	public void setFileList(List<String> fileList) {
		this.fileList = fileList;
	}
}
