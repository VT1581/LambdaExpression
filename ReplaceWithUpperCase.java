package com.cg.degreed.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class ReplaceWithUpperCase {
	
	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear");

        // Define a UnaryOperator to convert a word to uppercase
        UnaryOperator<String> toUppercase = String::toUpperCase;

        // Use replaceAll with the UnaryOperator to convert each word to uppercase
        words.replaceAll(toUppercase);

        System.out.println("Uppercase words: " + words);
	}

}
