package com.adactin.runner;

import java.io.IOException;

import com.reader.prop.FileReaderManager;

public class Properties_Runner {
	public static void main(String[] args) throws IOException {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		System.out.println(url);
	}

}
