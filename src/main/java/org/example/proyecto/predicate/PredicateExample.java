package org.example.proyecto.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
   public static void main(String[] args) {
      Predicate<Integer> isEven = x -> x % 2 == 0;
      boolean result = isEven.test(9);
      System.out.println("Es par: " + result);

      BiPredicate<String, Integer> checkLength = (str,len) -> str.length() == len;
      result = checkLength.test("hello", 5);
      System.out.println("Es de longitud 5: " + result);
   }
}
