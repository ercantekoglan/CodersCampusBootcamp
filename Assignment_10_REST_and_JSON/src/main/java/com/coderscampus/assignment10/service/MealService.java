package com.coderscampus.assignment10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.coderscampus.assignment10.domain.DailyIntegration;
import com.coderscampus.assignment10.domain.WeeklyIntegration;
import com.coderscampus.assignment10.dto.DailyResponse;
import com.coderscampus.assignment10.dto.WeeklyResponse;

@Service
public class MealService {
	
	@Autowired
	private DailyIntegration daily;
	@Autowired 
	private WeeklyIntegration weekly;
	
	
	public ResponseEntity<DailyResponse> getDailyPlan(String numCalories, String diet, String exclusions) {
		return daily.callDailyResponse(numCalories, diet, exclusions);
	}
	
	public ResponseEntity<WeeklyResponse> getWeeklyPlan(String numCalories, String diet, String exclusions) {
		return weekly.callWeeklyResponse(numCalories, diet, exclusions);
	}

}
