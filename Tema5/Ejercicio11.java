/**
 * Ejercicio 11
 * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 * los 5 primeros números enteros a partir de uno que se introduce por teclado.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.println("Programa que muestra el cuadrado y el cubo de un numero \n");
    System.out.print("Introduzca el numero: ");  
    int n1 = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    while (i <= 5) {
      int cuadrado = n1 * n1;
      int cubo = n1 * n1 * n1;
      System.out.printf("Numero: %4d  cuadrado  %6d  cubo  %8d\n",n1, cuadrado, cubo);
      n1++;
      i++;
    }
  }
}
