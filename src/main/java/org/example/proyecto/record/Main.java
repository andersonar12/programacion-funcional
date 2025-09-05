package org.example.proyecto.record;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

   public static void main(String[] args) {
      List<ProductDto> products = List.of(
         new ProductDto("Laptop", 1000.0),
         new ProductDto("Smartphone", 500.0),
         new ProductDto("Tablet", 300.0),
      new ProductDto("Tablet", 800.0)
      );

      List<String> discountedProducts = products.stream()
         .map(productDto -> new ProductDto(productDto.name(), productDto.price() * 0.9))
         .map(productDto -> String.format("%s: $%.2f", productDto.name(), productDto.price()))
         .toList();

      discountedProducts.forEach(System.out::println);

      Map<String, List<ProductDto>> byPriceRange = products.stream().collect(Collectors.groupingBy(
         productDto -> productDto.price() > 500 ? "Caro" : "Barato"
      ));

      Map<String, Long> countByRange = products.stream().collect(Collectors.groupingBy(
         productDto -> productDto.price() > 500 ? "Caro" : "Barato",
         Collectors.counting()
      ));
      System.out.println(byPriceRange);
      System.out.println(countByRange);

      //Reduccion matematica

      Double total = products.stream()
         .map(productDto -> productDto.price())
         .reduce(0.0, (price, price2) -> price + price2);

      Double totalSimple = products.stream().mapToDouble(ProductDto::price).sum();

      System.out.println("Total: $" + total);
      System.out.println("Total: $" + totalSimple);

      String productSumary = products.stream()
         .map(p -> p.name() + "( $" + p.price() + " )")
         .reduce("", (s1, s2) -> {
            if (s1.isEmpty()) {
               return s2;
            } else {
               return s1 + " | " + s2;
            }
         });

      System.out.println(productSumary);

      //Conversion entre colecciones

      Set<Double> uniquePrices = products.stream()
         .map(ProductDto::price)
         .collect(Collectors.toSet());

      System.out.println(uniquePrices);

      Map<String, Double> productMap = products.stream()
         .collect(Collectors.toMap(ProductDto::name, ProductDto::price, (oldValue, newValue) -> newValue));

      System.out.println(productMap);

      List<ProductDto> expensiveProducts = productMap.entrySet().stream()
         .filter(entry -> entry.getValue() > 500)
         .map(entry -> new ProductDto(entry.getKey(), entry.getValue()))
         .toList();

       expensiveProducts.forEach(System.out::println);

   }
}
