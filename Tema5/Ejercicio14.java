/**
 * Escribe un programa que pida una base y un exponente (entero positivo) y
 * que calcule la potencia. 
 * 
 * Ejercicio 14
 * @author José Manuel López Martín
 */

import java.util.Scanner;

public class Ejercicio14 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int calculo = 1;
  int calculoF = 0;
    System.out.println("Programa que calcula la potencia");
    System.out.print("Introduce Nºbase positivo: ");
    int base = Math.abs(Integer.parseInt(s.nextLine()));
    System.out.print("Introduce Exponente positivo: ");
    int exponente = Math.abs(Integer.parseInt(s.nextLine()));
    if (exponente == 0){
    }
    else if(exponente == 1){
      calculoF = base;
      }
    else{ 
     while (exponente >=2 ) {
        //esta linea multiplica uno por otro y almacena en calculo el resultado
        calculo *= base;
        calculoF = calculo + calculo;
        exponente--;
      }
   }
 System.out.print("El resultado es: " + calculoF); 
  }
}

