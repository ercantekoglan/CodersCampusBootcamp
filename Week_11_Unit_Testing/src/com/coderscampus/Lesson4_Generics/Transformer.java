package com.coderscampus.Lesson4_Generics;

import java.util.List;
import java.util.stream.Collectors;

public class Transformer {
	public static <T1, T2> String join(T1 v1, T2 v2) {

		return v1.toString() + " --> " + v2.toString();
	}
	//? anything demek. belirli durumlarda nereden extend oldugunu belirtmek gerekli
	//NUmber a tiklayip f4 yapinca icerik gozukur
	public static String join(List<? extends Number> list) {
		
		return list.stream().map(Number::toString).collect(Collectors.joining("\n"));
	}

}
