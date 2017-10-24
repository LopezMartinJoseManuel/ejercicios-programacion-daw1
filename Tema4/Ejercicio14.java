/**Ejercicio 14 Tema 4
 * 
 * 
 *
 * @author Jose Manuel Lopez Martin
 */
 
public class Ejercicio14 {
  public static void main (String [] args) {
    System.out.println("Programa que dice si un numero es par y divisible entre 5");
    System.out.print("Introduce el primer numero: ");
    int numero = Integer.parseInt(System.console().readLine());	
    //si es resto de la division da cero significa que es par
    if ((numero % 2) == 0){
      System.out.println("El numero es par");
      }
    else{
        System.out.println("El numero es impar");	
        }

    if ((numero % 5) == 0){
      System.out.println("El numero es divisible entre 5");
       }
    else{
      System.out.println("El numero no es divisible entre 5");	
    }
  }
}
