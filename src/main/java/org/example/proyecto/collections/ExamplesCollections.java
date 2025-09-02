package org.example.proyecto.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExamplesCollections {
   public static void main(String[] args) {
      List<String> names = Arrays.asList("Anderson", "Juan", "Maria", "Ana");

      names.forEach(System.out::println);
      Consumer<String> name = System.out::println;

      names.forEach(name);
      List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));

      numbers.removeIf(n -> n % 2 == 0);

      List<String> words = new ArrayList<>(List.of("hola", "adios", "buenas", "malas"));
      words.replaceAll(word -> word.toUpperCase());

   }

}
