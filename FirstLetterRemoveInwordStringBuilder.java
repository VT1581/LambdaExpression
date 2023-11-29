package com.cg.degreed.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//5)Create a string that consistes of the first letter of each word in the list of strings provided. HINT: Use Consumer interface & a StringBuilder to construct the result?

public class FirstLetterRemoveInwordStringBuilder {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi", "pear");
        StringBuilder result = new StringBuilder();

        // Use a Consumer to append the first letter of each word to the StringBuilder
        Consumer<String> firstLetterConsumer = word -> result.append(word.charAt(0));

        // Apply the Consumer to each word in the list
        words.forEach(firstLetterConsumer);

        System.out.println("Result: " + result.toString());

	}

}
