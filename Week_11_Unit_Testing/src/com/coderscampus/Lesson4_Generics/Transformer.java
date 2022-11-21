package com.coderscampus.Lesson4_Generics;

import java.util.List;
import java.util.stream.Collectors;

public class Transformer {
//public class Transformer<T1, T2> {

// static method bu sekilde hata verir cunku genericler static degil.
//	public static String join(T1 v1, T2 v2) {
//		
//		return v1.toString() + " -> " + v2.toString();
//	}

	//return  type oncesinde generic yaziyosun.boylece method da generic oluyo
	public static <T1, T2> String join(T1 v1, T2 v2) {
	
		return v1.toString() + " -> " + v2.toString();
	}
	
	//wildcard example -- burada listenin Number(number ustunde f4 e basinca hiyersiyi gorursun) turunde olacagini belirtiyoruz
	//List<?> -> list of anything
	public static String join(List<? extends Number> list) {
		
		return list.stream().map(Number::toString).collect(Collectors.joining("\n"));
	}
}

