package ifPresent_Practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		readFile("InterpolWatchReport-Week1.csv").stream()
												 .filter(x -> x.getName().equalsIgnoreCase("Carmen Sandiego"))
												 .findAny()
												 .ifPresentOrElse(location -> System.out.println("Carmen Sandiego is in " + location.getCountry()),
														 										() -> System.out.println("Galdang, just missed her!"));

		System.out.println("************************");

		readFile("InterpolWatchReport-Week2.csv").stream()
												 .filter(x -> x.getName().equalsIgnoreCase("Carmen Sandiego"))
												 .findAny()
												 .ifPresentOrElse(location -> System.out.println("Carmen Sandiego is in " + location.getCountry()),
														 										() -> System.out.println("Galdang, just missed her!"));
		System.out.println("************************");

		readFile("InterpolWatchReport-Week3.csv").stream()
												 .filter(x -> x.getName().equalsIgnoreCase("Carmen Sandiego"))
												 .findAny()
												 .ifPresentOrElse(location -> System.out.println("Carmen Sandiego is in " + location.getCountry()),
														 										() -> System.out.println("Galdang, just missed her!"));

	}

	private static List<SuspectLocation> readFile(String filename) {
		BufferedReader br = null;
		List<SuspectLocation> suspectList = new LinkedList<>();
		try {
			br = new BufferedReader(new FileReader(filename));
			String line = null;
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] lineArray = line.split(",");
				SuspectLocation suspectLocation = new SuspectLocation(lineArray[1], lineArray[0]);
				suspectList.add(suspectLocation);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return suspectList;
	}
}
