/**
 * Escribe un programa que dados dos números, uno real (base) y un entero
 * positivo (exponente), saque por pantalla todas las potencias con base el
 * numero dado y exponentes entre uno y el exponente introducido. No se deben
 * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 * se deberán mostrar 2 1 , 2 2 , 2 3 , 2 4 y 2 5 .
 * 
 * Ejercicio 1
 * @author José Manuel López Martín
 */

import java.util.Scanner;

public class Ejercicio15{
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int calculo = 1;
  int calculoF = 0;
  int i = 0;
  int j = 2;
    System.out.println("Programa que calcula la potencia");
    System.out.print("Introduce Nºbase positivo: ");
    int base = Math.abs(Integer.parseInt(s.nextLine()));
    System.out.print("Introduce Exponente positivo: ");
    int exponente = Math.abs(Integer.parseInt(s.nextLine()));
      
    if (exponente == 0){
      System.out.print(base + " ^ " + exponente + " = 0");
    }
    else if(exponente == 1){
      calculoF = base;
      System.out.println(base + " ^ " + exponente + " = 0");
      System.out.print(base + " ^ " + exponente + " = " + base);
      
      }
    else{
     System.out.println(base + " ^ " + i + " = 0");
     System.out.println(base + " ^ " + (i+1) + " = " + base);  
     for ( i = 2; i <= exponente; i++) {
        //esta linea multiplica uno por otro y almacena en calculo el resultado
        calculo *= base;
        calculoF = calculo + calculo;
        System.out.println(base + " ^ " + j + " = " + calculoF);
        j++;
      }
    }
  }
}
