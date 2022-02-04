package com.coderscampus.assignment10.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.assignment10.dto.DailyResponse;
import com.coderscampus.assignment10.dto.WeeklyResponse;
import com.coderscampus.assignment10.service.MealService;

@RestController
public class MealController {

	@Autowired
	private MealService mealService;

	@GetMapping("mealplanner/week")
	public ResponseEntity<WeeklyResponse> getWeekMeals(String numCalories, String diet, String exclusions) {

		return mealService.getWeeklyPlan(numCalories, diet, exclusions);

	}

	@GetMapping("mealplanner/day")
	public ResponseEntity<DailyResponse> getDayMeals(String numCalories, String diet, String exclusions) {

		return mealService.getDailyPlan(numCalories, diet, exclusions);

	}

}
