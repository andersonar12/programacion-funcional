package org.example.proyecto.task;

public class Calculator {
   public void operateAndPrint(int a, int b, Operation operation) {
      int result = operation.operate(a, b);
      System.out.println("Resultado: "+ result);
   }
   public static void main (String[]args){
      Calculator calculator = new Calculator();
      calculator.operateAndPrint(1, 2, (a, b) -> a + b);
      calculator.operateAndPrint(10, 2, (a, b) -> a - b);
      calculator.operateAndPrint(15, 25, (a, b) -> a * b);
      calculator.operateAndPrint(1500, 26, (a, b) -> a / b);
   }
}

@FunctionalInterface
interface Operation{
   int operate(int a, int b);
   }

