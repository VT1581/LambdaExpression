package com.cg.degreed.lambdaexpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//3)Use the functional interface supplier,consumer,predicate and function to invoke built-in methods from java API
public class FunctionalInterfaces {

	public static void main(String[] args) {
        // Supplier: Represents a supplier of results.
        Supplier<String> supplier = () -> "Hello, World!";
        System.out.println("Supplier result: " + supplier.get());

        // Consumer: Represents an operation that accepts a single input argument and returns no result.
        Consumer<String> consumer = message -> System.out.println("Consumer result: " + message);
        consumer.accept("Hello, Consumer!");

        // Predicate: Represents a predicate (boolean-valued function) of one argument.
        Predicate<Integer> predicate = number -> number > 0;
        boolean isPositive = predicate.test(5);
        System.out.println("Predicate result: Is 5 positive? " + isPositive);

        // Function: Represents a function that accepts one argument and produces a result.
        Function<Integer, String> function = number -> "Squared: " + (number * number);
        String result = function.apply(4);
        System.out.println("Function result: " + result);

        // Example using built-in methods from Java API
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Use Predicate to filter names starting with 'A'
        
/*        Predicate<String> startsWithAPredicate = name -> name.startsWith("A");
        List<String> aNames = filterList(names, startsWithAPredicate);
        System.out.println("Names starting with 'A': " + aNames);  */
        names.stream().filter(name->name.startsWith("A")).forEach(System.out::println);

        // Use Function to transform names to uppercase
        
   /*     Function<String, String> toUpperCaseFunction = String::toUpperCase;
        List<String> upperCaseNames = transformList(names, toUpperCaseFunction);
        System.out.println("Uppercase names: " + upperCaseNames);  */
        names.stream().map(name->name.toUpperCase()).forEach(System.out::println);
    }

/*    // Generic method to filter a list based on a Predicate
    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        return list.stream().filter(predicate).toList();
    }

    // Generic method to transform a list based on a Function
    private static <T, R> List<R> transformList(List<T> list, Function<T, R> function) {
        return list.stream().map(function).toList();
    } */
}
