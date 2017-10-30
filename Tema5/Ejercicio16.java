/**
 * Escribe un programa que diga si un número introducido por teclado es o no
 * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 * unidad. 
 * 
 * Ejercicio 16
 * @author José Manuel López Martín
 */

import java.util.Scanner;
//preguntar profe
public class Ejercicio16 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  boolean primo = true;
  
  System.out.println("Programa que calcula si el numero introducido es primo");
  System.out.print("Numero => ");
  int numero = Math.abs(Integer.parseInt(s.nextLine()));
    
  for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        primo = false;
      }
    }
        
    if (primo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }

  }
}
