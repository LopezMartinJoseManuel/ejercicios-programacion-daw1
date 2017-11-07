/**
 * Ejercicio 32
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 * suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * Ejemplo 1:
 * Por favor, introduzca un número entero positivo: 94026782
 * Dígitos pares: 4 0 2 6 8 2
 * Suma de los dígitos pares: 22
 *
 * @author Jose Manuel Lopez Martin
 */

public class Ejercicio32 {
  public static void main(String[] args) {
    long volte = 0;
    long ultimo = 0;
    long suma = 0;
    System.out.println("Programa que calcula los números pares y los suma");
    System.out.print("longroduzca el número: ");  
    long num = Integer.parseInt(System.console().readLine());

      while (num > 0) {
      // le damos la vuelta al nº para empezar.
      volte = (volte * 10) + (num %10);
      num /= 10;
      }    
      
      while (volte > 0) {
        //nos quedamos con el último nº del volte
        ultimo = volte %10;
        if (ultimo %2 == 0){
          System.out.print(" " + ultimo);
          suma += ultimo;
          }
        // esta linea quita el último nº al longro
        volte /= 10;
      }
      System.out.println("");
      System.out.print("La suma de los dígitos pares: " + suma);
    
        
  }
}
