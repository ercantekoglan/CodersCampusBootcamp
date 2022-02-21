package exercise_sorting_practice;

import java.util.Arrays;
import java.util.Comparator;

public class FarmerAlBaryardInventoryApplicationTwo {

	public static void main(String[] args) {

		FileService fileService = new FileService();
		Pig[] pigs = fileService.getPigsFromFile();
		

		// SORT the pigs by name...
		Arrays.sort(pigs, new Comparator<Pig>() {

			@Override
			public int compare(Pig pig1, Pig pig2) {
				return pig1.getName().compareTo(pig2.getName());
			}
		});

		// 1. run a for loop on the pig array
		// 2. In the for loop create an array called pig names, get the names of the
		// pigs using
		// the getName getter from the Pig class, save it into the pigNames string array
		// 3. Sort the pig names
		// 4. Print the sorted names to the console
		String[] pigNames = new String[4];
		for (Pig pigg : pigs) {
			int i = 0;
			pigNames[i] = pigg.getName();
			System.out.println(pigNames[i]);
			i++;
		}

	}

}
