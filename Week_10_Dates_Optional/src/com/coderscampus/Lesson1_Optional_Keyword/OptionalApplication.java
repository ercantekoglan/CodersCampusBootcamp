package com.coderscampus.Lesson1_Optional_Keyword;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalApplication {
	public static void main(String[] args) {
		Optional<String> fullName = Optional.of("Trevor Page");

		System.out.println(fullName);

		String trevor = fullName.get();

		System.out.println(trevor);

		// lesson 2+

		Recipe recipe = new Recipe();
		// recipe.setPriceOpt(null); null pointer exception verir

		Recipe cookies = new Recipe();
		cookies.setName("Chocolate Chip Cookies");
		cookies.setInstructions("1. Pre-heat oven\n2. Put dough on baking sheet\n3. Cook dough for 15 minutes");

		// cookies.setPriceOpt(new BigDecimal(9.99));
		System.out.println(cookies);

		// Good way to get the wrapped data in Optional
		BigDecimal price = cookies.getPriceOpt()
								  .map(p -> p)
								  .orElse(new BigDecimal(0));

		// "Bad" way to get the wrapped data in Optional
//		if (cookies.getPriceOpt().isPresent()) {
//			BigDecimal price = cookies.getPriceOpt().get();
//			System.out.println(price);
//		}
		cookies.setPriceOpt(new BigDecimal(20.00));
		// lesson 4
		cookies.getPriceOpt().ifPresent(RecipeService::billClient);

	}
}