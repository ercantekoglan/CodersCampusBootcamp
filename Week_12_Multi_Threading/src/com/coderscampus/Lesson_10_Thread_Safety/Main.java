package com.coderscampus.Lesson_10_Thread_Safety;

public class Main {

	public static void main(String[] args) {

		String s = "abba";

		String reverseString = new StringBuilder(s).reverse().toString();
		if (s.equals(reverseString)) {
			System.out.println("String is a palindrome.");
		}else {
            System.out.println("String is not a palindrome.");
            
           String string = new StringBuilder().reverse().toString();
        }
		
	}
	
	
	int solution(int[] inputArray) {

	    int wynik = -1000;
	    int mnozenie;
	    for(int i = 0; i < inputArray.length - 1; i++){
	        mnozenie = inputArray[i] * inputArray[i+1];
	        if(mnozenie > wynik)
	            wynik = mnozenie;
	    }
	    return wynik;
	}

}
