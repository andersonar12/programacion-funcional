package org.example.proyecto.collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
   public static void main(String[] args) {
      List<String> fruits = Arrays.asList("Manzana", "Banana", "Mango", "Uva", "Mora");
      List<String> filterFruits = fruits.stream().filter(fruit -> fruit.contains("o")).toList();
      System.out.println(filterFruits);

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      List<Integer> numbersSquared = numbers.stream().map(n -> n * n).toList();


      System.out.println(numbersSquared);
   }
}
