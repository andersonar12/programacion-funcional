package org.example.proyecto.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
   public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
      Stream<Integer> streamNumbers = numbers.stream();

      Stream<String> stream = Stream.of("Anderson", "Juan", "Maria", "Ana");
      stream.forEach(System.out::println);

      String[] array = {"A", "S", "D", "F"};
      Stream<String> stream2 = Arrays.stream(array);
      stream2.forEach(System.out::println);

      Stream<String> holaStream = Stream.generate(() -> "Hola Mundo").limit(3);
      holaStream.forEach(hola -> System.out.println(hola));

      List<String> list = List.of("Anderson", "Juan", "Maria", "Ana", "Pedro", "Alicia");
      list.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);

      Stream<String> stream3 = Stream.of("Anderson", "Juan", "Maria", "Ana", "Pedro", "Alicia");

      List<String> strings = stream3.toList();
      System.out.println(strings);
   }
}
