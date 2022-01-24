package com.coderscampus.assignment9.RecipeController;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment9.domain.Recipe;
import com.coderscampus.assignment9.service.FileService;

@RestController
public class RecipeController {

	@Autowired
	private FileService fileService;

	@GetMapping("/gluten-free")
	public List<Recipe> getGlutenFreeList() {

		return fileService.allRecipes().stream().filter(Recipe -> Recipe.getGlutenFree()).collect(Collectors.toList());
	}

	@GetMapping("/vegan")
	public List<Recipe> getVeganList() {
		return fileService.allRecipes().stream().filter(Recipe -> Recipe.getVegan()).collect(Collectors.toList());
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> getVeganAndGlutenFreeList() {
		return fileService.allRecipes().stream().filter(Recipe -> Recipe.getVegan())
				.filter(Recipe -> Recipe.getGlutenFree()).collect(Collectors.toList());

	}

	@GetMapping("/vegetarian")
	public List<Recipe> getVegetarianList() {
		return fileService.allRecipes().stream().filter(Recipe -> Recipe.getVegetarian()).collect(Collectors.toList());
	}

	@GetMapping("/all-recipes")
	public List<Recipe> getAllRecipesList() {
		return fileService.allRecipes();
	}
}