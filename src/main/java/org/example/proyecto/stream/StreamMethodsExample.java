package org.example.proyecto.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethodsExample {
   public static void main(String[] args) {
      List<String> names = List.of("Anderson", "Juan", "Maria", "Ana", "Pedro", "Alicia", "Ana", "Juan");
      List<String> names2 = Arrays.asList("Anderson", "Juan", "Maria", "Ana", "Pedro", "Alicia", "Ana", "Juan");

      names.stream().filter(name -> name.startsWith("A")).toList();

      List<Integer> lenghtNames = names.stream().map(String::length).collect(Collectors.toList());

      List<List<Integer>> list = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(7, 8, 9));
      List<Integer> flatList = list.stream().flatMap(List::stream).collect(Collectors.toList());
      System.out.println(flatList);

      List<Integer> numbers = List.of(1, 2, 3, 3, 2, 5, 7, 8, 3);
      List<Integer> uniqueOrdered = numbers.stream().distinct().sorted().toList();
      System.out.println(uniqueOrdered);

      Set<String> setNames = names.stream().filter(name -> name.length() > 4).collect(Collectors.toSet());
      System.out.println(setNames);

      long count = names.stream().filter(name -> name.length() > 4).count();
      System.out.println(count);

      int sum = numbers.stream().reduce(0, Integer::sum);
      System.out.println(sum);

      names.stream().map(String::toUpperCase).forEach(System.out::println);
   }
}
