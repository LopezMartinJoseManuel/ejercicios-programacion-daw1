/**
 * Escribe un programa que lea una lista de diez números y determine cuántos
 * son positivos, y cuántos son negativos. 
 * 
 * Ejercicio 13
 * @author José Manuel López Martín
 */

import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
    int i = 1;
    int positivo = 0;
    int negativo = 0;
    System.out.println("Introduce hasta 10 números");
    do {
      System.out.print("Introduce un numero: ");
      int num = Integer.parseInt(s.nextLine());      
      
      if (num >= 0){
        positivo++;
        }
      else{
        negativo++;
        }
      i++;
    } while (i <= 10);
    System.out.printf("Numeros positivos: %3d\n", positivo);
    System.out.printf("Numeros positivos: %3d\n", negativo);
    
  }
}
