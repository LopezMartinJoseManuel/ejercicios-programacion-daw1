/**
 * Ejercicio 17
 * Realiza un programa que sume los 100 números siguientes a un número entero
 * y positivo introducido por teclado. Se debe comprobar que el dato introducido
 * es correcto (que es un número positivo).
 *
 * @author Jose Manuel Lopez Martin
 */
import java.util.Scanner;

public class Ejercicio17 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  int i=0;
  
  System.out.println("Programa que calcula los 100 numeros siguientes a su número");
  System.out.print("Introduzca el número: ");  
  int num = Integer.parseInt(System.console().readLine());

      while (i <= 100) {
        num++;
        System.out.println("Número: " + num);
        i++;
      }
  }
}

