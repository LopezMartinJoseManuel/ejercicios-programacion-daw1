/**
 * Ejercicio 19
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 *
 * @author José Manuel López Martín
 */
import java.util.Scanner;

public class Ejercicio19 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Programa que pinta una pirámide");
  System.out.print("Introduzca la altura: ");  
  int altura = Integer.parseInt(System.console().readLine());
  System.out.print("Introduzca el caracter: ");  
  String caracter = s.next();
  int espacios = altura -1;
  int i = 1;
  int alturaini = 1;
  
  while(alturaini <= altura){
    System.out.println("*");
    }
  altura++;
  }
}


