/**
 * Ejercicio 20
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 *
 * @author José Manuel López Martín
 */
import java.util.Scanner;

public class Ejercicio20 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa que pinta una pirámide");
    System.out.print("Introduzca la altura: ");  
    int altura = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el caracter: ");  
    String caracter = s.next();
    int espacios = altura -1;
    int i = 0;
    int alturaini = 1;
    int espacioInte = 0;
  //controla que el bucle se repita las veces que el usuario quiera
     while (alturaini < altura) {
       // introduce espacios reduciendo en 1 a cada paso 
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      // y le pinta adjunto un caracter
      System.out.print(caracter);
      // en esta parte se pinta los espacios del medio como en ej19 los caracteres  
      for (i = 1; i < espacioInte; i++) {
        System.out.print(" ");
      }
      //esta es la parte que no entiendo  
      if (alturaini>1) {
        System.out.print(caracter);
      }
    System.out.println();
    alturaini++;
    espacios--;
    espacioInte += 2;
    } 
  //se pinta la base como en el ejercicio anterior pero sin salto de linea    
  for (i = 1; i < alturaini*2; i++) {
    System.out.print(caracter);
  }
}
}

