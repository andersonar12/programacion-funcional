package org.example.proyecto;

public class Main {
   public static void main(String[] args) {

   Operation operation = new Operation() {
      @Override
      public int operate(int a, int b) {
         return a + b;
      }
   };

   System.out.println(operation.operate(1, 2));

   Operation multiply = (a, b) -> a * b;
   System.out.println(multiply.operate(14, 2));

   Operation subtraction = (a, b) -> a - b;
   System.out.println(subtraction.operate(12, 2));
   }
}

@FunctionalInterface
interface Operation{
   int operate(int a, int b);

   default String show(){
      return "Soy una operacion";
   }

   default String show2(){
      return "Soy otra operacion";
   }

   static Operation substraction(){
      return (int a, int b) -> a - b;
   }
}