package com.coderscampus.Lesson12_Stream_FlatMaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class StreamApplication {

	public static void main(String[] args) {
		List<List<Integer>> listOfNumbersList = new ArrayList<>();
		listOfNumbersList.add(Arrays.asList(1,2,3)); 
		listOfNumbersList.add(Arrays.asList(2,3,4)); 
		listOfNumbersList.add(Arrays.asList(3,4,5));
		listOfNumbersList.add(Arrays.asList(4,5,6)); 

		IntSummaryStatistics sumStats = listOfNumbersList.stream()
							        .flatMap(x -> x.stream())
			        // The x -> x.intValue() is the same as Integer::intValue
//								    .mapToInt(x -> x.intValue())
							        .mapToInt(Integer::intValue)
								    .summaryStatistics();
        System.out.println("Average: " + sumStats.getAverage());
        System.out.println("Max: " + sumStats.getMax());
        System.out.println("Min: " + sumStats.getMin());
        System.out.println("Count: " + sumStats.getCount());

	}
}
