/**
 * Ejercicio 27
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 * entre 1 y un número leído por teclado.
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio27 {
  public static void main(String[] args) {
   
    int multiplos = 0;
    int ini = 1;
    int suma = 0;
    System.out.println("Programa que calcula multiplos de 3, su suma y su nº ");
    System.out.print("Introduzca el número límite: ");  
    int num = Integer.parseInt(System.console().readLine());
    System.out.print("Multiplos de 3: ");
    while (ini <= num) {
      if((ini %3) == 0){ // comprobamos que sean multiplos con su division /3 = 0
        System.out.print("" + ini + ", ");
        multiplos++; // los contamos
        suma += ini; // los sumamos
      }
    ini++;
    }
    System.out.println(" ");
    System.out.println("Cantidad de multiplos incluidos: " + multiplos);
    System.out.println("Suma de estos: " + suma);
}
}
