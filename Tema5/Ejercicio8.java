/**
 * Ejercicio 8
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula la tabla de multiplicar de un numero.");
    System.out.print("Introduzca el numero: ");  
    int n1 = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    while (i <= 10) {
      int resultado = n1 * i;
      System.out.println(n1 + " x " + i + " = " + resultado);
      i++;
    }
  }
}
