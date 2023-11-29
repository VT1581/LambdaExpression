package com.cg.degreed.lambdaexpressions;

import java.util.HashMap;
import java.util.Map;

//7)Convert every key-value pair of the map into a string and append them all into  a single string , in iteration order. HINT: Use Map.entrySet()  & a StringBuilder to construct the result String?
public class MapToString {

	public static void main(String[] args) {
	
		Map<String, Integer> keyValueMap = new HashMap<>();
	        keyValueMap.put("apple", 3);
	        keyValueMap.put("banana", 5);
	        keyValueMap.put("orange", 2);
	        keyValueMap.put("grape", 7);

	        // Use StringBuilder to construct the result string
	        StringBuilder result = new StringBuilder();
	        
	        // Iterate over Map entries and append them to the StringBuilder
	        for (Map.Entry<String, Integer> entry : keyValueMap.entrySet()) {
	            result.append(entry.getKey())
	                  .append(": ")
	                  .append(entry.getValue())
	                  .append(", ");
	        }

	        // Remove the trailing ", " if the StringBuilder is not empty
	        if (result.length() > 0) {
	            result.setLength(result.length() - 2);
	        }

	        System.out.println("Result: " + result.toString());


	}

}
