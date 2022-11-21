package com.coderscampus.Lesson4_Generics;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GenericsApplication {
	//generics => to catch bugs sooner. bugs are expensive to fix
	@Test
	public void generics_examples() {
		
		List list1 = new ArrayList();
		list1.add("first string value");
		list1.add("second string value");
		list1.add('E');
		
		//here is not complitation error
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println((String)list1.get(i));
		}
		
		// char E yi goremedik hata aldik demektir.Yani run time da error aldik. cunku hala generic type i eklemedik list e.
		
		List<String> list = new ArrayList<>();
		list.add("ercan");
		list.add("tekoglan");
		// list.add('E'); hata verir.
	}
	
	@Test
	public void more_generics_examples() {
		
		MyPair<Integer, String> myPair = new MyPair<>(1, "one");
		
		//hepsi calisiyo, goruldugu gibi
		MyPair<String, String> myPair1 = new MyPair<>("Bir", "one");
		MyPair<Long, Integer> myPair2 = new MyPair<>(1L, 1);
		
		myPair.getKey(); //Integer return
		myPair.getValue();
		myPair1.getKey(); // String return
	}
	
	
	@Test
	public void specifying_generic_types_at_method_level () {
		// not static
//		Transformer<Integer, Double> transformer = new Transformer<>();
//		String val = transformer.join(1, 2.0);
//		System.out.println(val);
		
		//static method
		String val = Transformer.join(10000L, 2.0);
		String val1 = Transformer.join("asd", 2.0);
		String val2 = Transformer.join(10, 2.0);
		String val3 = Transformer.join("dsa", "ter");
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
	}
	
	@Test
	public void wildcard_in_generics() {
		
		
		// her turlu Number ceisinde calisir listemiz
		List<Number> list = new ArrayList<>();
		List<AtomicInteger> list1 = new ArrayList<>();
		List<BigDecimal> list2 = new ArrayList<>();
		List<Long> list3 = new ArrayList<>();
		List<Double> list4 = new ArrayList<>();
		// ancak Object, Number in ustunde oldugu icin, extend etmedigi icin calismaz.
		//List<Object> list5 = new ArrayList<>();
		list3.add(1L);
		list3.add(5L);
		list3.add(100L);
		
		String val = Transformer.join(list3);
		System.out.println(val);
		
	}
	
}
