/**
 * Escribe un programa que lea un número n e imprima una pirámide de números
 * con n filas como en la siguiente figura:
 *    1
 *   121
 *  12321
 * 1234321
 * @author José Manuel López Martín
 * 
 */
import java.util.Scanner;

public class Ejercicio24 {
  public static void main(String[] args) {
    
    System.out.println("Programa que pinta una pirámide");
    System.out.print("Introduzca la altura: ");  
    int altura = Integer.parseInt(System.console().readLine());
    
    int espacios = altura -1;
    int i = 0;
    int alturaini = 1;
    while(alturaini <= altura){
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      for (i = 1; i < alturaini; i++) {
        System.out.print(i);
      }
      
      for (i = alturaini; i > 0; i--) {
        System.out.print(i);
      }
    System.out.println();
    alturaini++;
    espacios--;
    }
}
}
