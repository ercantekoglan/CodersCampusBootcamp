package com.coderscampus.Lesson2_IntroTo_abstract_Classes;

import java.io.File;
import java.io.IOException;

public interface FileService {
	
	String standardFileName = "data.txt";
	
	public abstract String readLine (File file) throws IOException;
	
	public abstract void writeLine(File file, String line) throws IOException;
	
}
