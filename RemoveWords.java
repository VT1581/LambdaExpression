package com.cg.degreed.lambdaexpressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4)Remove the words that have odd lengths from the list. HINT:use one of the new methods from JDK . Use removeIf() method from Collection Interface?
public class RemoveWords {

	public static void main(String[] args) {
		
		 List<String> words =new ArrayList();

		 words.add("Lemon");
		 words.add("orange");
		 words.add("banana");

	        // Use removeIf with Predicate to remove words with odd lengths
	        words.removeIf(word -> word.length() % 2 != 0);

	        // Print the modified list
	        System.out.println("Words with even lengths: " + words);

	}

}
