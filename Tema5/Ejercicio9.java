/**
 * Ejercicio 9
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio9 {
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula cuantos dígitos tiene un número");
    System.out.print("Introduzca el número: ");  
    int n1 = Integer.parseInt(System.console().readLine());
    int n2 = 0;
    while (n1 > 0) {
      int calculo = n1 / 10;
      n1 = calculo;
      n2++;
    }
    System.out.println("El numero tiene " + n2 + " dígitos");
  }
}

