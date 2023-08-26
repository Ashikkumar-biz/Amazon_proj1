package com.reader.prop;

import java.io.IOException;

public class FileReaderManager {
	private FileReaderManager() {
		//private constructor to restrict the object creation outside the class
		
	}
	
	public static FileReaderManager getInstance() {
		FileReaderManager reader = new FileReaderManager();
		return reader;
		
	}
	public  static Configuration_Reader getInstanceCR() throws IOException {
		Configuration_Reader helper = new Configuration_Reader();
		return helper;
		
	}

}
