package com.loganalyzer.common.models;

import com.loganalyzer.common.enums.FilePrefix;
import com.loganalyzer.common.enums.OutputFileFormat;

public class OutputConfig {
	private String outputFileLocation = "C:\\fastsearch\\output\\";
	public String getOutputFileLocation() {
		return outputFileLocation;
	}
	public void setOutputFileLocation(String outputFileLocation) {
		this.outputFileLocation = outputFileLocation;
	}
	public FilePrefix getFilePrefixType() {
		return filePrefixType;
	}
	public void setFilePrefixType(FilePrefix filePrefixType) {
		this.filePrefixType = filePrefixType;
	}
	public OutputFileFormat getFileFormat() {
		return fileFormat;
	}
	public void setFileFormat(OutputFileFormat fileFormat) {
		this.fileFormat = fileFormat;
	}
	private FilePrefix filePrefixType;
	private OutputFileFormat fileFormat;
}
