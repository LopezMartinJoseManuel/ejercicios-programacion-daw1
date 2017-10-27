/**
 * Ejercicio 12
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
 * por teclado.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio12 {
  public static void main(String[] args) {
    
    int primera = 0;
    int segunda = 1;
    int calculoF = 0;
    int calculoP =  primera + segunda;
    System.out.println("Programa muestra secuencia Fibonacci tantas veces como quieras");
    System.out.print("Introduzca el número de secuencias: ");  
    int n1 = Integer.parseInt(System.console().readLine());
    
    if (n1 == 1){
      System.out.print("Secuencia: " + primera);
      }
    else if (n1 == 2){
      System.out.printf("Secuencia: %2d, %2d", primera, segunda);
      }
    else {
      System.out.println("Secuencia: " + primera);
      // 0 , 1 , 1 , 2 , 3 , 5 , 8
      /**1º vuelta
       * sumo primera 0 + segunda 1 y lo almaceno en calculoF  
       * calculoF = 1
       * sustituyo primera con segunda con primera = segunda  0 = 1
       * y sustituyo el valor de segunda con el calculo 1 = 1
       * 2º vuelta
       * sumo 1 + 1
       * calculoF = 2
       * 1 = 1
       * segunda = 2 <= calculo
       *        * */
      while (n1 >= 0) {
        n1--;
        calculoF = primera + segunda;
        System.out.printf("Secuencia: " + calculoF + "\n");
        primera = segunda;
        segunda = calculoF;
      }
    }
  }
}
