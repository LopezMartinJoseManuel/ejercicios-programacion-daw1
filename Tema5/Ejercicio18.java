/**
 * Ejercicio 18
 * Escribe un programa que obtenga los números enteros comprendidos entre
 * dos números introducidos por teclado y validados como distintos, el programa
 * debe empezar por el menor de los enteros introducidos e ir incrementando de
 * 7 en 7.
 *
 * @author Jose Manuel Lopez Martin
 */
import java.util.Scanner;

public class Ejercicio18 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Programa que calcula numeros comprendidos entre sus numeros y aumenta de 7 en 7");
  System.out.print("Introduzca el número: ");  
  int n1 = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el número: ");  
  int n2 = Integer.parseInt(System.console().readLine());
  
  if (n1 == n2){
    System.out.print("Los numeros son iguales error.");
  }
  else{
    if ( n1 > n2){
      int aux = n1;
      n1 = n2;
      n2 = aux;
      while (n1 <= n2) {
        System.out.println("Números: " + n1);
        n1 += 7;
        }
    }
    if (n2 > n1){
      while (n1 <= n2) {
        System.out.println("Números: " + n1);
        n1 += 7;
        }
      }
  }
}
}
