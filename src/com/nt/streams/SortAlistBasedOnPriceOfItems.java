package com.nt.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class SortAlistBasedOnPriceOfItems {

	public static void main(String[] args) {
        List<Product> products = List.of(
            new Product("Apple", 1.99),
            new Product("Banana", 0.99),
            new Product("Orange", 2.49),
            new Product("Grapes", 3.99),
            new Product("Kiwi", 2.79)
        );

        List<Product> sortedProducts = products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        sortedProducts.forEach(System.out::println);
    }
}
/*In this code:

We have a class Product with a "price" field, and we create a list of Product objects.
We use the sorted method to sort the Product objects by their "price" field in ascending order.
We pass a comparator created using Comparator.comparingDouble(Product::getPrice) to specify the sorting criteria based on the "price" field.
The sorted products are collected into a new list using Collectors.toList().
Finally, we print the sorted list of products.
When you run this code, it will sort the list of Product objects by their "price" field in ascending order and display the sorted list using Java Streams.

*/



