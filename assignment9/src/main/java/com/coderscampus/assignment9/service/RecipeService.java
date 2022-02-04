package com.coderscampus.assignment9.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.coderscampus.assignment9.domain.Recipe;

@Service
public class RecipeService {

	@Autowired
	public FileService fileService;

	private List<Recipe> recipes = new ArrayList<>();

	public void loadRecipes() {
		recipes = fileService.allRecipes();
	}

	public List<Recipe> getRecipes() {

		if (CollectionUtils.isEmpty(recipes)) {
			loadRecipes();
		}

		return recipes;
	}

	public List<Recipe> getVegan() {

		return fileService.allRecipes().stream().filter(recipe -> recipe.getVegan()).collect(Collectors.toList());
	}

	public List<Recipe> getVeganAndGlutenFreeList() {

		return fileService.allRecipes().stream().filter(recipe -> recipe.getVegan())
				.filter(recipe -> recipe.getGlutenFree()).collect(Collectors.toList());
	}

	public List<Recipe> getVegetarianList() {

		return fileService.allRecipes().stream().filter(recipe -> recipe.getVegetarian()).collect(Collectors.toList());
	}

	public List<Recipe> getGlutenFreeList() {

		return fileService.allRecipes().stream().filter(recipe -> recipe.getGlutenFree()).collect(Collectors.toList());
	}

}
