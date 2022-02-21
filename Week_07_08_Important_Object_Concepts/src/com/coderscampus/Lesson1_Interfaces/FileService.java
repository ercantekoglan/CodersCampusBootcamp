package com.coderscampus.Lesson1_Interfaces;

import java.io.File;
import java.io.IOException;

public interface FileService {
	
	String standardFileName = "data.txt";
	
	String readLine (File file) throws IOException;
	
	void writeLine(File file, String line) throws IOException;
	
}
