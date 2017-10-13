/**
 * Lectura de datos desde teclado 
 * Ejercicio 1 Tema 3
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación. 
 * @author Jose Manuel Lopez Martin
*/

public class Ejercicio1 {
  public static void main(String[] args) {

	System.out.print("A continuación se relizara una multiplicacion de");
    System.out.println(" dos numeros enteros.");
    System.out.print("Por favor, introduce un número: ");
    int primerNumero = Integer.parseInt(System.console().readLine());
/** esta linea convierte
 * el numero introducido que en principio es una cadena de caracteres
 * en un numero entero 
 */

    System.out.print("introduce otro, por favor: ");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    
    int total = primerNumero * segundoNumero;
    
    System.out.println("La multiplicacion de los dos numeros es " + total);
    
    
 }
 }
