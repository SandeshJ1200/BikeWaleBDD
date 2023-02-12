package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadJSON {

	public static String getResourceAsString(String jsonFileName) {
		String content = null;

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			System.err.println("File Not Found, Please check file path!");
		}

		return content;
	}

}
