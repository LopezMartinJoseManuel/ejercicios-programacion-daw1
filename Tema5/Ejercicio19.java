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
  // se inicia la altura a 1 (por que siempre tendra que pintar al menos un caracter
  // se cada pasada se aumenta para que termine el bucle. 1 2 3 4  /  4 
  while(alturaini <= altura){
    //se pintan espacios habiendole quitado uno a altura y se van reducido a cada iteración.
    for (i=1; i <= espacios; i++){
      System.out.print(" ");
    }
    //preguntar profe
    for(i=1; i < alturaini * 2; i++){
      System.out.print(caracter);
    }
  System.out.println();
  alturaini++;
  espacios--;
  }
}
}

