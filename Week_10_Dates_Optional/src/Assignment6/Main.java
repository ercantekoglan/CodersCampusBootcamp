package Assignment6;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		FileOperations fo = new FileOperations();
		List<Cars> model3 = fo.readFile("model3.csv");
		List<Cars> modelS = fo.readFile("modelS.csv");
		List<Cars> modelX = fo.readFile("modelX.csv");
	
		/*for (Cars car : model3) {
			System.out.println(car.toString());
		}*/
		carReport("Model 3",model3);
		carReport("Model S",modelS);
		carReport("Model X",modelX);
		
	}

	private static void carReport(String models, List<Cars> carModel) {
		
		System.out.println(models + " Yearly Sales Report");
		
		//group by the year
		Map<Integer, List<Cars>> carMap = carModel.stream()
												  .collect(Collectors.groupingBy(y -> y.getYearMonth().getYear()));
	

	/*	Map<Integer, Integer> collect1 = carMap.entrySet()  
		   .stream()
		   .collect(Collectors.toMap(k -> k.getKey() , v -> v.getValue()
				   											 .stream()
				   											 .collect(Collectors.summingInt(t -> t.getSales())) ));*   benim cozum*/
		
	// benim cozum	collect1.forEach((key,value) -> System.out.println(key + " -> " +  value));

		
		//get sales amounts with summing
		String collect = carMap.entrySet()
							   .stream()
							   .map(x -> x.getKey() + " -> " + x.getValue().stream().collect(Collectors.summingInt(a -> a.getSales())))
							   .collect(Collectors.joining("\n"));
		System.out.println("****************************");
		System.out.println(collect);
		//compare the sales and find max and min values
		Optional<Cars> max = carModel.stream().max((Cars car1 ,Cars car2) -> car1.getSales().compareTo(car2.getSales()));
		Optional<Cars> min = carModel.stream().min((Cars car1 ,Cars car2) -> car1.getSales().compareTo(car2.getSales()));
		
		String totalMaxYearPrice = max.map(sales -> "The best month for " + models + " was: " + sales.getYearMonth()).orElse("There is no information.");
		String totalMinYearPrice = min.map(sales -> "The worst month for " + models + " was: " + sales.getYearMonth()).orElse("There is no information.");
		
		System.out.println(totalMaxYearPrice);
		System.out.println(totalMinYearPrice);
		System.out.println(" ");
		
	}

	
}
