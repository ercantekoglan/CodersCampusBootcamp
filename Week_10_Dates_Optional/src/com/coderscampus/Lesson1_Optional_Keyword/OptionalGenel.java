package com.coderscampus.Lesson1_Optional_Keyword;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalGenel {

	public static void main(String[] args) {
		// ifPresent : Bu method Optional türde olan bir nesne için eğer tanımlı ise
		// içerisinde işlem yapılmasına izin verir. Örnek olarak ;
		// alistirma
		List<String> list = new ArrayList<>();
		list.add("Chuck Norris");
		list.add("Arif Pehlivan");
		list.add("Mario Jardel");
		Optional<List<String>> optList = Optional.of(list);
		optList.ifPresent(System.out::println);

		// isPresent : Bu method Optional türde olan bir nesnenin tanımlı olup
		// olmadığını kontrol etmemizi sağlar.
		// Eğer tanımlı ise true değil ise false değeri döner.
		Optional<String> chuck = Optional.of("Chuck Norris");
		System.out.println(chuck.isPresent() ? "Chuck" : "Norris");

		// map : Bu method Optional türde tanımlı olan bir nesne üzerinde işlemler
		// yapmamıza olanak sağlar. Örnek olarak ;
		Optional<String> test = Optional.of("Arif Pehlivan");
		test.map(String::length);

		List<String> list1 = new ArrayList<>();
		list1.add("Chuck Norris");
		list1.add("Arif Pehlivan");
		list1.add("Mario Jardel");
		Optional<List<String>> optList1 = Optional.of(list1);
		optList1.map(List::size).get();

		// filter : Bu method Optional türde tanımlı olan bir nesne üzerinde işlemler
		// yapmamıza olanak sağlar. Örnek olarak ;
		Optional<String> chuck1 = Optional.of("Chuck Norris");
		chuck1.filter(i -> "Chuck Norris".equals(i)).ifPresent(System.out::println);

		// orElse : Bu method Optional türde oluşturulan nesne tanımlı olup olmasına
		// bakmaksızın verilen değerini döner. Örnek olarak ;
		Optional<String> chuck2 = Optional.of("Chuck Norris");
		System.out.println(chuck2.orElse(testOrElse()));

	}

	private static String testOrElse() {
		System.out.println("Dur yapma");
		return null;
	}

}
