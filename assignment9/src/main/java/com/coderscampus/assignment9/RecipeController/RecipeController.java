package com.coderscampus.assignment9.RecipeController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment9.domain.Recipe;
import com.coderscampus.assignment9.service.RecipeService;

@RestController
public class RecipeController {

	@Autowired
	private RecipeService recipeService;

	@GetMapping("/gluten-free")
	public List<Recipe> getGlutenFreeList() {

		return recipeService.getGlutenFreeList();
	}

	@GetMapping("/vegan")
	public List<Recipe> getVeganList() {
		return recipeService.getVegan();
	}

	@GetMapping("/vegan-and-gluten-free")
	public List<Recipe> getVeganAndGlutenFreeList() {
		return recipeService.getVeganAndGlutenFreeList();

	}

	@GetMapping("/vegetarian")
	public List<Recipe> getVegetarianList() {
		return recipeService.getVegetarianList();
	}

	@GetMapping("/all-recipes")
	public List<Recipe> getAllRecipesList() {
		return recipeService.getRecipes();
	}
}