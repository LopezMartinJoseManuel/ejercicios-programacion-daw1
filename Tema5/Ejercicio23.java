/**
* Escribe un programa que permita ir introduciendo una serie indeterminada
* de números mientras su suma no supere el valor 10000. Cuando esto último
* ocurra, se debe mostrar el total acumulado, el contador de los números
* introducidos y la media.
*
* @author José Manuel López Martín
*/

import java.util.Scanner;

public class Ejercicio23 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Programa que realiza cálculos hasta 10000");
    System.out.println("Introduzca números");
    int suma = 0;
    int contador = 0;
    while (suma <= 10000){
    System.out.print("=> ");
    int numero = Integer.parseInt(s.nextLine());
    suma += numero;
    contador++;  
    }
    int calculo = suma / contador;
    System.out.println("Límite (10000) alcanzado" );
    System.out.println("Total acumulado: " + suma);
    System.out.println("Números introducidos: " + contador);
    System.out.println("Media: " + calculo);
  }
}
