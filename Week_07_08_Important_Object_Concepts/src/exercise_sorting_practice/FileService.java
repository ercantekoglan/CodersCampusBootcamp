package exercise_sorting_practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileService {
	
	public Pig[] getPigsFromFile () {
		
		BufferedReader fileReader = null;
		
		try {	
			int i = 0;
			String line = null;
			Pig[] pigs = new Pig[4];
			fileReader = new BufferedReader(new FileReader("pigs.txt"));
			
			while ((line = fileReader.readLine()) != null) {
				String[] lineData = line.split(",");
				Pig pig = new Pig(lineData[0], lineData[1]);
				pigs[i] = pig;
				i++;
			}
			return pigs;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;

		
	}

}
