/**
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno.
 * Ejemplo:
 * Introduzca la altura de la L: 5
 * *
 * *
 * *
 * *
 * * * *
 *
 * @author José Manuel López Martín
 */
import java.util.Scanner;

public class Escalera {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  
  System.out.println("Programa que pinta una pirámide");
  System.out.print("Introduzca la altura: ");  
  int altura = Integer.parseInt(System.console().readLine());

  int espacios = 1;
  int i = 1;
  int alturaini = 1;
  // se inicia la altura a 1 (por que siempre tendra que pintar al menos un caracter
  // se cada pasada se aumenta para que termine el bucle. 1 2 3 4  /  4 
  while(alturaini <= altura){
    //se pintan espacios habiendole quitado uno a altura y se van reducido a cada iteración.
    for (i=1; i <= espacios; i++){
      System.out.print("*");
    }
   
   
    for(i=1; i < (alturaini / 2) + 1; i++){
      System.out.print("*");
    }
    
  System.out.println();
  alturaini++;

  }
}
}
