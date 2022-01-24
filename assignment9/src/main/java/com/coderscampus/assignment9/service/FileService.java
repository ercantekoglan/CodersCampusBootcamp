package com.coderscampus.assignment9.service;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment9.domain.Recipe;

@Service
public class FileService {

	public List<Recipe> allRecipes() {

		List<Recipe> recipeList = new ArrayList<>();

		CSVFormat csvFormat = CSVFormat.EXCEL.withDelimiter(',').withEscape('\\').withSkipHeaderRecord(true)
				.withHeader("Cooking Minutes", "Dairy Free", "Gluten Free", "Instructions", "Preparation Minutes",
						"Price Per Serving", "Ready In Minutes", "Servings", "Spoonacular Score", "Title", "Vegan",
						"Vegetarian")
				.withIgnoreSurroundingSpaces();

		CSVParser csvParser = null;
		Reader excelInput = null;
		{
			try {
				excelInput = new FileReader("recipes.txt");
				csvParser = new CSVParser(excelInput, csvFormat);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			for (CSVRecord record : csvParser) {

				Integer cookingMinutes = Integer.parseInt(record.get("Cooking Minutes"));
				Boolean dairyFree = Boolean.parseBoolean(record.get("Dairy Free"));
				Boolean glutenFree = Boolean.parseBoolean(record.get("Gluten Free"));
				String instructions = record.get("Instructions");
				Double prepMin = Double.parseDouble(record.get("Preparation Minutes"));
				Double price = Double.parseDouble(record.get("Price Per Serving"));
				Integer readyInMin = Integer.parseInt(record.get("Ready In Minutes"));
				Integer servings = Integer.parseInt(record.get("Servings"));
				Double score = Double.parseDouble(record.get("Spoonacular Score"));
				String title = record.get("Title");
				Boolean vegan = Boolean.parseBoolean(record.get("Vegan"));
				Boolean vegetarian = Boolean.parseBoolean(record.get("Vegetarian"));

				Recipe recipe = new Recipe(cookingMinutes, dairyFree, glutenFree, instructions, prepMin, price,
										   readyInMin, servings, score, title, vegan, vegetarian);

				recipeList.add(recipe);
			}

		}
		return recipeList;
	}
}
