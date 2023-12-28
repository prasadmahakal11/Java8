package practice;

import java.util.*;
import java.util.stream.Collectors;

public class MostCommonElementFinder {
    public static void main(String[] args) {
        List<String> elements = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "date", "date", "banana");

        // Use Java 8 Stream API and Collectors to find the most common element
        Optional<Map.Entry<String, Long>> mostCommonEntry = elements.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        if (mostCommonEntry.isPresent()) {
            Map.Entry<String, Long> entry = mostCommonEntry.get();
            System.out.println("Most common element: " + entry.getKey());
            System.out.println("Occurrences: " + entry.getValue());
        } else {
            System.out.println("The collection is empty.");
        }
    
}

		

	}


