package com.coderscampus.assignment10.dto;

import java.util.ArrayList;

public class DailyResponse {

	private ArrayList<Meals> meals;
	private Nutrients nutrients;

	public ArrayList<Meals> getMeals() {
		return meals;
	}

	public void setMeals(ArrayList<Meals> meals) {
		this.meals = meals;
	}

	public Nutrients getNutrients() {
		return nutrients;
	}

	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

}