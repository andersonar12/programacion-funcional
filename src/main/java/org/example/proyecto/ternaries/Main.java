package org.example.proyecto.ternaries;

public class Main {
   public static void main(String[] args) {
      int age = 17;
      String message;

//      if (age >= 18) {
//         message = "Eres mayor de edad";
//      } else {
//         message = "Eres menor de edad";
//      }
//
//      System.out.println(message);

      message = age >= 18 ? "Eres mayor de edad" : "Eres menor de edad";
      System.out.println(message);


      int accessLevel =2;
      String accessMessage = "Acceso Denegado.";

       accessMessage = accessLevel >= 1 ? (accessLevel >= 3 ? "Acceso total." : "Acceso parcial.") : "Acceso Denegado.";

   }
}
