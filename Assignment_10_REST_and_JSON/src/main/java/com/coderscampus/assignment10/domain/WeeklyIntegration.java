package com.coderscampus.assignment10.domain;

import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.assignment10.dto.WeeklyResponse;

@RestController
public class WeeklyIntegration {

	public ResponseEntity<WeeklyResponse> callWeeklyResponse(String numCalories, String diet, String exclusions) {

		UriComponentsBuilder builder = UriComponentsBuilder
				.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate").queryParam("timeFrame", "week")
				.queryParam("apiKey", "675850890ecb4aa88642c3abb6723aeb");

		if (StringUtils.hasLength(numCalories)) {
			builder.queryParam("targetCalories", Integer.parseInt(numCalories));
		}
		if (StringUtils.hasText(diet)) {
			builder.queryParam("diet", diet);
		}
		if (StringUtils.hasText(exclusions)) {
			builder.queryParam("exclusions", exclusions);
		}

		URI url = builder.build().toUri();
		RestTemplate rt = new RestTemplate();
		ResponseEntity<WeeklyResponse> response = rt.getForEntity(url, WeeklyResponse.class);

		return response;
	}

}
