package org.example.proyecto.record;

import java.util.Objects;

public record ProductDto(String name, double price) {
   public static final String ATRIBUTO = "Hola";

   public ProductDto{
      Objects.requireNonNull(name);

   }

   public ProductDto(String name) {
      this(name, 0);
   }

   public static void methodStatic() {
      System.out.println("Hola soy un metodo");
   }

}
